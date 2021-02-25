## Criação para aplicações baseadas em Spring Boot

### Usando Buildpack (Spring 2.3.0 ou superior)

#### pom.xml
```sh
<plugin>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-maven-plugin</artifactId>
	<configuration>
		<layers>
			<enabled>true</enabled>
		</layers>
	</configuration>
</plugin>
```
##### Execução
```sh
./mvnw spring-boot:build-pack
ou
mvn spring-boot:build-pack
```

### Usando Dockerfile e Layered jar

#### Execução
```sh
./mvnw clean package
```
```sh
docker build -t <image_name>:<image_tag> .
```