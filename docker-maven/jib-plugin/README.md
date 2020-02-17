## Docker Jib Maven Plugin

#### Gerando e Publicando a Imagem:

```
mvn compile jib:build -DsendCredentialsOverHttp=true -Djib.httpTimeout=0
```