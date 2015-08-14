## Embedded Jetty in runnable war

Using Spring Boot only for starting our own main class, and nothing more.
Avoids extracting all jars into the war.

```console
mvn clean package
java -jar target/embedded-jetty-spring-boot-0.1-SNAPSHOT.war
```
