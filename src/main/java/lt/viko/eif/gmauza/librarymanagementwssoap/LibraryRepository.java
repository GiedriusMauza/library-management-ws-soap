package lt.viko.eif.gmauza.librarymanagementwssoap;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import lt.viko.eif.librarymanagementwssoap.*;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class LibraryRepository {

    private static final Map<String, Library> libraries = new HashMap<>();

    @PostConstruct
    public void initData() {

        Item item = new Item();
        item.setAuthor("Edmundas Untulis");
        item.setTitle("Žvilgsnis iš maišo");
        item.setPublisher("2023");
        item.setProductionYear("Eglės leidykla");

        Borrowing borrowing = new Borrowing();
        borrowing.setBorrowDate("2023-01-05");
        borrowing.setReturnDate("2023-06-25");
        borrowing.setItem(item);

        Item item2 = new Item();
        item2.setAuthor("Arnoldas Jonulis");
        item2.setTitle("Žvilgsnis pro langą");
        item2.setPublisher("2022");
        item2.setProductionYear("Eridanas leidykla");

        Borrowing borrowing2 = new Borrowing();
        borrowing2.setBorrowDate("2023-02-08");
        borrowing2.setReturnDate("2023-05-15");
        borrowing2.setItem(item2);

        Borrowings borrowings = new Borrowings();
        borrowings.getBorrowing().add(borrowing);
        borrowings.getBorrowing().add(borrowing2);

        Subscriber subscriber = new Subscriber();
        subscriber.setSubscriberName("Benas");
        subscriber.setSubscriberLastName("Antanaitis");
        subscriber.setAddress("Kalno g. 66");
        subscriber.setEmail("benas@test.ff");
        subscriber.setPhone("+3705465654");
        subscriber.setBorrowings(borrowings);

        Subscribers subscribers = new Subscribers();
        subscribers.getSubscriber().add(subscriber);

        Librarian librarian = new Librarian();
        librarian.setLibrarianName("Jonas");
        librarian.setLastName("Petraitis");
        librarian.setLibrarianEmail("test@mail.ff");
        librarian.setPhoneNumber("+3706645654");

        Library central = new Library();
        central.setLibraryName("Central Library");
        central.setLibraryAddress("Gedimino pr.32");
        central.setWorkHours("09h.-18h.");
        central.setLibrarian(librarian);
        central.setSubscribers(subscribers);

        libraries.put(central.getLibraryName(), central);

    }

    public Library findLibrary(String name) {
        Assert.notNull(name, "The library name must not be null");
        return libraries.get(name);
    }
}
