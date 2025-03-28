FROM openjdk:17.0.1-jdk-slim

LABEL authors="dipdeepcode"

COPY target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]