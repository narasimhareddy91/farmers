# farmers
This Application developed for farmers support to apply pestcides on thier crops

I have used following tech stack to devlop this application

Java 17 or above
Spring boot 3.1.3
MySQL 8.0.34.0

This is rest based application developed using java spring boot framework. I Have implemented JWT role based authorization mechanism.

Sample Curls are provided below

curl -L 'localhost:8484/agri/auth/login' \
-H 'Content-Type: application/json' \
--data-raw '{"email":"perfagriagent@agri.com", "password":"perfagriagent"}'

curl -L 'localhost:8484/agri/farmers' \
-H 'Content-Type: application/json' \
-H 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiIzLHBlcmZhZ3JpYWdlbnRAYWdyaS5jb20iLCJpc3MiOiJOU1lSRUREWSIsInJvbGVzIjoiW1JPTEVfQUdSSUFHRU5UXSIsImlhdCI6MTY5NDQ0MzY2NSwiZXhwIjoxNjk0NTMwMDY1fQ.MgzUctvUHYByh2WRDTaPL5rAtb2GIYRF75HqhMQ_dPvsHg1Zsyosidla1HhiOdUqUsLqSXwO8La9iFd7R4H5KQ' \
-d '{"name": "Rahul", "landinAcres": 25, "age":55, "mobile": "9898989898", "address": "YSR", "defaultcrops": "Mango farms"}'

I would like to take this project further development, I will release more updated code with more features
