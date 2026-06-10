# Use a lightweight JRE base image to minimize final image size
FROM eclipse-temurin:17-jre-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the built JAR file into the container and rename it to app.jar
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# Expose the default port Spring Boot runs on
EXPOSE 8080

# Command to execute the application
ENTRYPOINT ["java", "-jar", "app.jar"]
