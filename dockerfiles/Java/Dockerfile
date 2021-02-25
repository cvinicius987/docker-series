FROM openjdk:11-jdk-slim as builder
RUN mkdir -p /app/source
COPY . /app/source
WORKDIR /app/source
RUN ./mvnw clean package

FROM builder
COPY --from=builder /app/source/target/*.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java","${JAVA_OPTS}", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/app.jar"]