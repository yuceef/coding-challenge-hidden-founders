# Shops

The application in front of you allows you to view a set of shops ordered by their location from the nearest to the furthest, and it also allows you to interact with each shop (like or dislike) of course without forgetting the first phase of registration if it's a new user or login for an old one.

## What's inside 

This project is based on the [Spring Boot](http://projects.spring.io/spring-boot/) project and uses these packages :
- Maven
- Spring Core
- Spring Data (jpa/Hibernate & MySQL)
- Spring security
- Spring MVC (Tomcat)
- Anular 7

## Functional spec

The coding challenge is about implementing an app that lists shops nearby. 

- As a User, I can sign up using my email & password
- As a User, I can sign in using my email & password
- As a User, I can display the list of shops sorted by distance
- As a User, I can like a shop, so it can be added to my preferred shops
  - Acceptance criteria: liked shops shouldn’t be displayed on the main page
- As a User, I can dislike a shop, so it won’t be displayed within “Nearby Shops” list during the next 2 hours
- As a User, I can display the list of preferred shops
- As a User, I can remove a shop from my preferred shops list

## Installation

After cloning the application you will find two folders:
- Back-end: realized with the spring boot framework.
- Front-end: made with Angular 7.

## Installation: Back-end

The project is created with Maven, so you just need to import it to your IDE(Eclipse,..) and build the project to resolve the dependencies.

## Installation: Database configuration 
Create a MySQL database with the name `shops` and add the credentials to `/resources/application.properties`.  
The default ones are :

```
spring.datasource.driverClassName = com.mysql.jdbc.Driver
spring.datasource.url = jdbc:mysql://localhost/shops
spring.datasource.username = root
spring.datasource.password = 
```

## Installation: Front-end
- Use the following command in the project folder `npm install`  [NPM] https://www.npmjs.com/
- Run `ng serve -o` for a dev server. Navigate to `http://localhost:4200/`.

