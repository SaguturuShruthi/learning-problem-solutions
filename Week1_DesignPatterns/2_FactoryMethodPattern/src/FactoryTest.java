// File: FactoryTest.java
// This is the client code that uses the factories to create documents.
public class FactoryTest {
    public static void main(String[] args) {
        System.out.println("--- Factory Method Pattern Test ---");

        // Use the Word factory to create a Word document
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        System.out.println("\nUsing WordFactory:");
        wordDoc.open();
        wordDoc.save();

        // Use the PDF factory to create a PDF document
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        System.out.println("\nUsing PdfFactory:");
        pdfDoc.open();
        pdfDoc.save();

        // Use the Excel factory to create an Excel document
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        System.out.println("\nUsing ExcelFactory:");
        excelDoc.open();
        excelDoc.save();
    }
}