FROM tomcat:9.0-jre8-alpine

COPY target/docker-spotify*.war $CATALINA_HOME/webapps/docker-spotify.war

HEALTHCHECK --interval=1m --timeout=3s CMD wget --quiet --tries=1 --spider http://localhost:8080/docker-spotify/ || exit 1
