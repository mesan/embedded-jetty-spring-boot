package no.mesan.jetty;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

/**
 * Jersey resource configuration.
 *
 * @author Christian Ihle
 */
public class JerseyApplication extends ResourceConfig {

    public JerseyApplication() {
        register(RequestContextFilter.class);
        register(HelloResource.class);
    }
}
