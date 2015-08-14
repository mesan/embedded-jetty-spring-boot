package no.mesan.jetty;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

/**
 * Hello world Jersey resource.
 *
 * @author Christian Ihle
 */
@Component
@Path("/hello")
@Produces(value = MediaType.APPLICATION_JSON)
public class HelloResource {

    @Inject
    private HelloService helloService;

    @GET
    public String sayHello() {
        return helloService.sayHello();
    }
}
