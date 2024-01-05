FROM openjdk:17-ea-slim

# Copy binary application.
COPY target/*.jar app.jar

# Run application
ENTRYPOINT ["java","-jar","app.jar"]

