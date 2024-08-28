FROM openjdk:21-slim

WORKDIR /app
COPY target/*.jar /app/expense-tracker.jar
COPY agents/lumigo-opentelemetry-0.14.0.jar /app/lumigo-opentelemetry.jar
ENV JAVA_TOOL_OPTIONS="-javaagent:/app/lumigo-opentelemetry.jar"

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "expense-tracker.jar"]