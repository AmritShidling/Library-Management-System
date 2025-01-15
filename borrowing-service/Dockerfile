FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/borrow-service-1.0.0.jar /app/borrow-service-1.0.0.jar

EXPOSE 8083

ENTRYPOINT ["java", "-jar", "borrow-service-1.0.0.jar"]
