// File: DocumentFactory.java
// This is the abstract "Creator" class. It declares the factory method.
public abstract class DocumentFactory {

    // This is the "Factory Method". Subclasses must implement this method
    // to create the specific type of document they are responsible for.
    public abstract Document createDocument();
}