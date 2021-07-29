FROM openjdk:16-alpine3.13
WORKDIR /App
COPY .mvn ./.mvn
COPY pom.xml mvnw ./
EXPOSE 8089
COPY src ./src
CMD ["./mvnw","spring-boot:run"]