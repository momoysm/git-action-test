# Base image
FROM openjdk:17-jre-slim

# Set the working directory
WORKDIR /app

# Copy the JAR file
COPY build/libs/sycls-user-api-0.0.1-SNAPSHOT.jar app.jar

# Expose the port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
