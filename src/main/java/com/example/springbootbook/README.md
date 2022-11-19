# Spring Boot Library

## Endpoints

### Sign-up

```
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 70

{
"name":"admin",
"username":"admin",
"password":"admin"
}
```

### Sign-In

```
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 70

{
    "name":"admin",
    "username":"admin",
    "password":"admin"
}
```

### Change role

```
PUT /api/user/change/ADMIN HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9VU0VSIiwidXNlcklkIjoyLCJleHAiOjE2NTI0OTk1OTl9.5zL9Kt1VY8zKZsKTkUSpT1-F9nO8eBqfkr1QnyyRgnN3hf2jVvCZ78v-azSkTpnApdaC2veR2bCxS3CsvEn3vA
```

### Save Book

```
POST /api/book HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MiwiZXhwIjoxNjUyNDk5NjI2fQ.ckTkzvN6i0oYjQgm9r17H8ADWd4JoFd2inVg6G9lDbm9-JP1p0sstzl9MPTo5prjTqP9x_XtU05gRIN6duwHdA
Content-Type: application/json
Content-Length: 98

{
    "name":"book1",
    "description":"desc-1",
    "quantity": "3",
    "bookType": "FICTION"
}
```

### Get All Books

```
GET /api/book HTTP/1.1
Host: localhost:8080
```

### Delete Book

```
DELETE /api/book/1 HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MSwiZXhwIjoxNjUyNDkzNzk4fQ.jr-0ZsvMrSkt4ohdouS-oV2D1s1-0Cp_Dzi1eefnifEwXyupPIRu0yyGkKQ_Y8gMH9gVkVO6ycmKk5BgCHvhdA
```

### Save UserActivity

```
POST /api/userActivity HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MSwiZXhwIjoxNjUyNDkzNzk4fQ.jr-0ZsvMrSkt4ohdouS-oV2D1s1-0Cp_Dzi1eefnifEwXyupPIRu0yyGkKQ_Y8gMH9gVkVO6ycmKk5BgCHvhdA
Content-Type: application/json
Content-Length: 72

{
    "userId":"2",
    "bookId":"2",
    "userActivityType": "BORROW"
}
```

### Get All UserActivity of logged in user

### not working yet

```
GET /api/userActivity HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MiwiZXhwIjoxNjUyNTAwMzEyfQ.OfpJ35_Kf6lq6R_eSge1Bl6sD_98yhK75paxAP2tUUy7ahUdN3fmt1Z5fogSyVo633CWwpb0dKFLegSN829CWA
```

### Get All UserActivity of all users

### not working yet

```
GET /api/userActivity/all HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MiwiZXhwIjoxNjUyNTAwMzEyfQ.OfpJ35_Kf6lq6R_eSge1Bl6sD_98yhK75paxAP2tUUy7ahUdN3fmt1Z5fogSyVo633CWwpb0dKFLegSN829CWA
Content-Type: application/json
Content-Length: 64

{
    "userId":"1",
    "bookId":"2",
    "activity": "BORROW"
}
```
