# Expense Tracker REST API

This repository contains source code which is used in the "Build REST API with Spring Boot" Ebook

Sample project that is used for showcase integration with *lumigo* observability platform.   
In order to integrate it's required to containerize application and run with the following commands:
1) build image:
```
docker build -t expense-tracker .
```

2) run container based on image respectively:
```
docker run -d -p 8080:8080 --name expense-tracker -e LUMIGO_TRACER_TOKEN=${LUMIGO_TOKEN} -e OTEL_SERVICE_NAME=expense-tracker [expense-tracker]
```
last option is optional - it's just container name

