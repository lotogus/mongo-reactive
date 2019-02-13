# mongo-reactive

## run

mongodb setup

    docker-compose up


build jar
    
    ./gradlew clean build

run jar app

    java -jar build/libs/*.jar
    
### find all

    curl -X GET \
      http://localhost:8080/api/persons 

### create
    
    curl -X POST \
      http://localhost:8080/api/persons \
      -H 'content-type: application/json' \
      -d '{
    "name": "titi",
    "age": 23
    }'

### update

    curl -X PUT \
      http://localhost:8080/api/persons/5c64a6418b7fdf2599ddd55b \
      -H 'content-type: application/json' \
      -d '{
        "name": "titi",
        "age": 66,
        "id": "5c64a6418b7fdf2599ddd55b",
        "version": 0
    }'