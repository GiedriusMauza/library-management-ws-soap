package lt.viko.eif.gmauza.librarymanagementwssoap;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;


import lt.viko.eif.librarymanagementwssoap.Library;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
@Component
public class LibraryRepository {

    private static final Map<String, Library> libraries = new HashMap<>();

    @PostConstruct
    public void initData() {
        Library central = new Library();
        central.setLibraryName("Central Library");
        central.setLibraryAddress("Gedimino pr.32");

        libraries.put(central.getLibraryName(), central);

    }

    public Library findLibrary(String name) {
        Assert.notNull(name, "The library name must not be null");
        return libraries.get(name);
    }
}
