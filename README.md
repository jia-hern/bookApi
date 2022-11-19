# Spring Boot Library

## Endpoints

### Sign-Up

```
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 73

{
    "name": "admin",
    "username": "admin",
    "password": "admin"
}
```

### Sign-In

```
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
    "username": "admin",
    "password": "admin"
}
```

### Change-Role

```
PUT /api/user/change/ADMIN HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9VU0VSIiwidXNlcklkIjoyLCJleHAiOjE2MzIxNDc3NDl9.rLBudACxFgoL9LhWBopfIYGPG3lQcRmhEdugBVdBnAm4MItJbC1JLCHv-Y15UIyDOPBmUOTRoiIlsZlX7W2hBw
```

### Save Book

```
POST /api/book HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MiwiZXhwIjoxNjMyMTQ3ODMwfQ.7zX58-yVhZihWKTiZFn-lzsJfBjSc66gFY_UVBP-tLuvB-tzUHaoRVTLmfOlVxhhRd0-c7_lVk7ofkkJBrqgUg
{
    "name": "book1",
    "description": "book 1 description",
    "quantity": "3",
    "bookType": "FICTION"
}
```

### Get All Books

```
GET /api/book HTTP/1.1
Host: localhost:8080
```

### Delete book

```
DELETE /api/book/1 HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MiwiZXhwIjoxNjMyMTQ3ODMwfQ.7zX58-yVhZihWKTiZFn-lzsJfBjSc66gFY_UVBP-tLuvB-tzUHaoRVTLmfOlVxhhRd0-c7_lVk7ofkkJBrqgUg
```

### Save UserActivity

```
POST /api/userActivity HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MiwiZXhwIjoxNjMyMTQ3ODMwfQ.7zX58-yVhZihWKTiZFn-lzsJfBjSc66gFY_UVBP-tLuvB-tzUHaoRVTLmfOlVxhhRd0-c7_lVk7ofkkJBrqgUg
Content-Type: application/json

{
    "userId": 1,
    "bookId": 1,
    "activity": "BORROW",
}
```

### Get All UserActivity

```
GET /api/userActivity HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MiwiZXhwIjoxNjMyMTQ3ODMwfQ.7zX58-yVhZihWKTiZFn-lzsJfBjSc66gFY_UVBP-tLuvB-tzUHaoRVTLmfOlVxhhRd0-c7_lVk7ofkkJBrqgUg
```
