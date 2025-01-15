FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/user-service-1.0.0.jar /app/user-service-1.0.0.jar

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "user-service-1.0.0.jar"]
