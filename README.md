# taskForSolving
This project used the GitHub API.
Controller takes username as a request and processes that request.
First the username is checked against the database if the database has its repositories.
If not, controller sends the request to GitHub. If there is such a user in GitHub, 
it will get all its repositories and first save it and its repositories in the database and send the response to the user.
If you send such a request to the controller again next time, it will take all the responses from the database at once.
All repositories are updated and checked every two hours from the GitHub API to see if there is a new repository for this user.
if there is new repos on github then we will add new repos to database
