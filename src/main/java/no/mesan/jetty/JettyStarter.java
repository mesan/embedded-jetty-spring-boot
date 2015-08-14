package no.mesan.jetty;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * Used to start Jetty in the IDE.
 *
 * URL: http://localhost:8080/hello
 *
 * @author Christian Ihle
 */
public final class JettyStarter {

    public static void main(final String[] args) throws Exception {
        startServer();
    }

    private static void startServer() throws Exception {
        final Server server = new Server(8080);

        final WebAppContext webapp = new WebAppContext();
        webapp.setContextPath("/");
        webapp.setResourceBase("src/main/webapp");

        server.setHandler(webapp);
        server.start();
        server.join();
    }
}
