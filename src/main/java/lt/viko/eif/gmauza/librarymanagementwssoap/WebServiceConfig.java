package lt.viko.eif.gmauza.librarymanagementwssoap;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

/**
 * Configuration class for setting up a SOAP web service.
 */
@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
    /**
     * Creates a servlet registration bean for a message dispatcher servlet.
     *
     * @param applicationContext The ApplicationContext that the servlet should be associated with.
     * @return A ServletRegistrationBean instance for the servlet.
     */
    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }

    /**
     * Creates a default WSDL 1.1 definition for the web service.
     *
     * @param librariesSchema The schema of the web service.
     * @return A DefaultWsdl11Definition instance for the web service.
     */
    @Bean(name = "libraries")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema librariesSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("LibrariesPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://eif.viko.lt/librarymanagementwssoap");
        wsdl11Definition.setSchema(librariesSchema);
        return wsdl11Definition;
    }

    /**
     * Creates an XSD schema for defining the structure of the web service's messages and payloads.
     *
     * @return An XsdSchema instance for the web service's schema.
     */
    @Bean
    public XsdSchema librariesSchema() {
        return new SimpleXsdSchema(new ClassPathResource("libraries.xsd"));
    }
}
