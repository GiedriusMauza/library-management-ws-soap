package lt.viko.eif.gmauza.librarymanagementwssoap;

import lt.viko.eif.librarymanagementwssoap.GetLibraryRequest;
import lt.viko.eif.librarymanagementwssoap.GetLibraryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * LibraryEndpoint is an endpoint class that handles requests related to libraries.
 * <p>
 * This class receives a request to get information about a library and returns the response with the requested information.
 */
@Endpoint
public class LibraryEndpoint {

    /**
     * The namespace URI for the SOAP request.
     */
    private static final String NAMESPACE_URI = "http://eif.viko.lt/librarymanagementwssoap";
    /**
     * Repository for handling library data.
     */
    private final LibraryRepository libraryRepository;

    /**
     * Constructor that creates a new instance of LibraryEndpoint.
     *
     * @param libraryRepository the repository used to fetch library data.
     */
    @Autowired
    public LibraryEndpoint(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    /**
     * Receives a request to get information about a library and returns the response with the requested information.
     *
     * @param request the GetLibraryRequest with the library name to fetch information for.
     * @return a GetLibraryResponse with the information for the requested library name.
     */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getLibraryRequest")
    @ResponsePayload
    public GetLibraryResponse getLibrary(@RequestPayload GetLibraryRequest request) {
        GetLibraryResponse response = new GetLibraryResponse();
        response.setLibrary(libraryRepository.findLibrary(request.getLibraryName()));

        return response;
    }
}
