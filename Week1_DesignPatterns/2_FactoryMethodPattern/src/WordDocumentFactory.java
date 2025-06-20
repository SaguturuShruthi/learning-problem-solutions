// File: WordDocumentFactory.java
// This is a "Concrete Creator" that knows how to create a WordDocument.
public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}