/**
 * Package lt.viko.eif.gmauza.librarymanagementwssoap contains the main class for running the Spring Boot application.
 */
package lt.viko.eif.gmauza.librarymanagementwssoap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The LibraryManagementWsSoapApplication class is responsible for running the Spring Boot application.
 */
@SpringBootApplication
public class LibraryManagementWsSoapApplication {
    /**
     * The main method is responsible for starting the Spring Boot application.
     *
     * @param args An array of strings containing the command-line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(LibraryManagementWsSoapApplication.class, args);
    }

}
