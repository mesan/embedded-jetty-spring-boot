package no.mesan.jetty;

import java.net.URL;
import java.security.ProtectionDomain;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * Used to start Jetty in a runnable war-file.
 *
 * URL: http://localhost:8080/hello
 *
 * @author Christian Ihle
 */
public final class EmbeddedJettyStarter {

    public static void main(final String[] args) throws Exception {
        startServer();
    }

    private static void startServer() throws Exception {
        final Server server = new Server(8080);

        final ProtectionDomain domain = EmbeddedJettyStarter.class.getProtectionDomain();
        final URL location = domain.getCodeSource().getLocation();

        final WebAppContext webapp = new WebAppContext();
        webapp.setContextPath("/");
        webapp.setWar(location.toExternalForm().replace("/WEB-INF/classes!", ""));
        webapp.setExtractWAR(true);

        server.setHandler(webapp);
        server.setStopTimeout(2000);
        server.setStopAtShutdown(true);

        server.start();
        server.join();
    }
}
