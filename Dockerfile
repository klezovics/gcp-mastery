# Use a base image with Java 17 and Alpine Linux
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container with a custom name
COPY build/libs/app.jar app.jar

# Specify the command to run your application
CMD ["java", "-jar", "app.jar"]
