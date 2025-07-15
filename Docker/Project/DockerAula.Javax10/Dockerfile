FROM eclipse-temurin:17  
LABEL maintainer="contato@java10x.dev"
WORKDIR /app
COPY target/DockerAula.Javax10-0.0.1-SNAPSHOT.jar /app/aula-docker.jar
ENTRYPOINT [ "java", "-jar", "aula-docker.jar" ]
