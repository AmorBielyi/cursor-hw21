FROM adoptopenjdk/openjdk13:x86_64-alpine-jdk-13.0.2_8
EXPOSE 8080
ARG ARTIFACT_NAME=db-app-0.0.1-SNAPSHOT.jar
COPY ${ARTIFACT_NAME} artifact.jar
ENTRYPOINT ["java", "-jar", "artifact.jar"]