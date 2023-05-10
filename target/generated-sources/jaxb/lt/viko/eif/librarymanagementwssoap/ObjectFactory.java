//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.10 at 10:06:49 AM EEST 
//


package lt.viko.eif.librarymanagementwssoap;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lt.viko.eif.librarymanagementwssoap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lt.viko.eif.librarymanagementwssoap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLibraryRequest }
     * 
     */
    public GetLibraryRequest createGetLibraryRequest() {
        return new GetLibraryRequest();
    }

    /**
     * Create an instance of {@link GetLibraryResponse }
     * 
     */
    public GetLibraryResponse createGetLibraryResponse() {
        return new GetLibraryResponse();
    }

    /**
     * Create an instance of {@link Library }
     * 
     */
    public Library createLibrary() {
        return new Library();
    }

    /**
     * Create an instance of {@link Librarian }
     * 
     */
    public Librarian createLibrarian() {
        return new Librarian();
    }

    /**
     * Create an instance of {@link Borrowing }
     * 
     */
    public Borrowing createBorrowing() {
        return new Borrowing();
    }

    /**
     * Create an instance of {@link Borrowings }
     * 
     */
    public Borrowings createBorrowings() {
        return new Borrowings();
    }

    /**
     * Create an instance of {@link Subscriber }
     * 
     */
    public Subscriber createSubscriber() {
        return new Subscriber();
    }

    /**
     * Create an instance of {@link Subscribers }
     * 
     */
    public Subscribers createSubscribers() {
        return new Subscribers();
    }

    /**
     * Create an instance of {@link ItemType }
     * 
     */
    public ItemType createItemType() {
        return new ItemType();
    }

}