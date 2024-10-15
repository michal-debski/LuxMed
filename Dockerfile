FROM eclipse-temurin:21
COPY target/luxmed-recruitment-0.0.1-SNAPSHOT.jar luxmed-recruitment.jar
ENTRYPOINT ["java", "-jar", "/luxmed-recruitment.jar"]
