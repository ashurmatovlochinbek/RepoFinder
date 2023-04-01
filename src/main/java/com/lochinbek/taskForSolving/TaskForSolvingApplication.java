package com.lochinbek.taskForSolving;

import com.lochinbek.taskForSolving.entity.Repo;
import com.lochinbek.taskForSolving.entity.ResponseItemFromApi;
import com.lochinbek.taskForSolving.entity.User;
import com.lochinbek.taskForSolving.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableScheduling
public class TaskForSolvingApplication {
	private final UserService userService;

	public TaskForSolvingApplication(UserService userService) {
		this.userService = userService;
	}

	public static void main(String[] args) {
		SpringApplication.run(TaskForSolvingApplication.class, args);
	}

	@Scheduled(fixedRate = 7_200_000)
	public void refreshData() {
		RestTemplate restTemplate = new RestTemplate();
		List<User> all = userService.findAll();
		for (User user : all) {
			String usernameResourceUrl = "https://api.github.com/users/" + user.getUsername() + "/repos";
			ResponseEntity<ResponseItemFromApi[]> response = restTemplate.getForEntity(usernameResourceUrl, ResponseItemFromApi[].class);
			ResponseItemFromApi[] itemsFromApis = response.getBody();
			User updateableUser = new User(user.getUsername());
			Arrays.asList(itemsFromApis).stream().forEach(item -> updateableUser.addRepo(new Repo(item.getName())));
			userService.delete(user);
			userService.save(updateableUser);
		}

	}
}
