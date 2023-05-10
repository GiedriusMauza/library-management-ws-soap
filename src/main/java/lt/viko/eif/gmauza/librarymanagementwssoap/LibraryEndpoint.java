package lt.viko.eif.gmauza.librarymanagementwssoap;

import lt.viko.eif.librarymanagementwssoap.GetLibraryRequest;
import lt.viko.eif.librarymanagementwssoap.GetLibraryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class LibraryEndpoint {

    private static final String NAMESPACE_URI = "http://eif.viko.lt/librarymanagementwssoap";

    private final LibraryRepository libraryRepository;

    @Autowired
    public LibraryEndpoint(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getLibraryRequest")
    @ResponsePayload
    public GetLibraryResponse getLibrary(@RequestPayload GetLibraryRequest request) {
        GetLibraryResponse response = new GetLibraryResponse();
        response.setLibrary(libraryRepository.findLibrary(request.getLibraryName()));

        return response;
    }
}
