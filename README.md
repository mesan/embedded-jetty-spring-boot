## Embedded Jetty in runnable war

Using Spring Boot to start our own main class, and nothing more.
Avoids extracting the contents of all the jars into the war.

```console
mvn clean package
java -jar target/embedded-jetty-spring-boot-0.1-SNAPSHOT.war
```

Go to [http://localhost:8080/hello](http://localhost:8080/hello) to see the result.
