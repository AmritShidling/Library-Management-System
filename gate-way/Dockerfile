FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/gate-way-1.0.0.jar /app/gate-way-1.0.0.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "gate-way-1.0.0.jar"]
