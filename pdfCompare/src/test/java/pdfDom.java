/* import org.apache.pdfbox.pdmodel.PDDocument;
import org.fit.pdfdom.PDFDomTree;
import org.w3c.dom.Document;

public class pdfDom {

    public static void main(String[] args) throws Exception {

        String filename="C:\\Users\\SOUMEN DEB\\Desktop\\pdf comparision\\doc1.pdf";

        // load the PDF file using PDFBox
        PDDocument pdf = PDDocument.load(new java.io.File(filename));
        // create the DOM parser
        PDFDomTree parser = new PDFDomTree();
        // parse the file and get the DOM Document
        Document dom = parser.createDOM(pdf);
    }
}

*/
