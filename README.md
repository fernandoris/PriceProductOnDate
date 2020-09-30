# PriceProductOnDate

> Microservice to consult prices


[![Build Status](http://img.shields.io/travis/badges/badgerbadgerbadger.svg?style=flat-square)](https://travis-ci.org/badges/badgerbadgerbadger) 
## How to start
To run the microservice you must first make sure that your port 8080 is not in use. Then navigate in the console to the project folder and launch the following command.
```shell
$mvn clean install && docker-compose up
```
## JUnit and Coverage report
After executing the command indicated in the previous section, all the tests will have been executed and the coverage report generated.
However, if we wish to generate it again, we would only have to use the following command.
```shell
$mvn verify
```
To access the coverage report you only have to access the folder 
```shell
./target/site/jacoco/index.html
```
and open the file index.html with the browser of your preference.
![alt text](https://github.com/fernandoris/PriceProductOnDate/blob/master/example.png?raw=true)
## Swagger
You can consult the swagger in http://localhost:8080/swagger-ui.html
, the file "swagger.json" or in SwaggerHub https://app.swaggerhub.com/apis/fernandoris/PriceProductOnDate/1.0.0
## Tests 
Once the microservice is up, to run the tests you can import the postman collection in the file `PriceProductOndate.postman_collection.json` or execute the following commands in the console

### Test 1. 
```bash
curl --location --request GET 'http://localhost:8080/prices?date=2020-06-14-10.00.34&productId=35455&brandId=1'
```
### Test 2. 
```bash
curl --location --request GET 'http://localhost:8080/prices?date=2020-06-14-16.00.34&productId=35455&brandId=1'
```
### Test 3. 
```bash
curl --location --request GET 'http://localhost:8080/prices?date=2020-06-14-21.00.34&productId=35455&brandId=1'
```
### Test 4. 
```bash
curl --location --request GET 'http://localhost:8080/prices?date=2020-06-15-10.00.34&productId=35455&brandId=1'
```
### Test 5. 
```bash
curl --location --request GET 'http://localhost:8080/prices?date=2020-06-16-21.00.34&productId=35455&brandId=1'
```
---
