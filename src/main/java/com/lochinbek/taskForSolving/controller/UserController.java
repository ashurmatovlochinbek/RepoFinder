package com.lochinbek.taskForSolving.controller;

import com.lochinbek.taskForSolving.entity.Repo;
import com.lochinbek.taskForSolving.entity.ResponseItemFromApi;
import com.lochinbek.taskForSolving.entity.User;
import com.lochinbek.taskForSolving.exception.MyErrorHandler;
import com.lochinbek.taskForSolving.exception.NotFoundUserException;
import com.lochinbek.taskForSolving.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getByUsername")
    public ResponseEntity<User> find(@RequestParam String username) {
        if(userService.get(username).isEmpty()) {
            RestTemplate restTemplate = new RestTemplate();
            restTemplate.setErrorHandler(new MyErrorHandler());
            String usernameResourceUrl = "https://api.github.com/users/" + username + "/repos";
            ResponseEntity<ResponseItemFromApi[]> response = restTemplate.getForEntity(usernameResourceUrl, ResponseItemFromApi[].class);
            if(response.getStatusCode().equals(HttpStatus.NOT_FOUND)) {
                throw new NotFoundUserException("Not Found");
            } else {
                ResponseItemFromApi[] itemsFromApis = response.getBody();
                User user = new User(username);
                Arrays.asList(itemsFromApis).stream().forEach(item -> user.addRepo(new Repo(item.getName())));
                userService.save(user);
                return new ResponseEntity<>(user, HttpStatus.OK);
            }
        } else {
            return new ResponseEntity<>(userService.get(username).get(), HttpStatus.OK);
        }
    }




}
