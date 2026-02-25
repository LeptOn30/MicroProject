# Use a Java 22.0.1 base image
FROM openjdk:22-jdk

# Add the application's JAR file to the Docker image
ARG JAR_FILE
COPY ${JAR_FILE} app.jar

# Define the entry point for running the application
ENTRYPOINT ["java", "-jar", "/app.jar"]
