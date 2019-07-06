import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.text.PDFTextStripperByArea;

import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;

public class pdfBox {

    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\SOUMEN DEB\\Desktop\\pdf comparision\\";
        String filename = "doc1.pdf";
        int pageNumber = 0;


       // public String TextByRegion (path, pageNumber,filename)  {
            File file = new File(path + filename);
            PDDocument document = PDDocument.load(file);
            /* Rectangle2D region = new Rectangle2D.Double(x,y,width,height); */
            Rectangle2D region = new Rectangle2D.Double(0, 0, 500, 1000);
            String regionName = "region";
            PDFTextStripperByArea stripper;
            PDPage page = document.getPage(pageNumber + 0);
            stripper = new PDFTextStripperByArea();
            stripper.addRegion(regionName, region);
            stripper.extractRegions(page);
            String text = stripper.getTextForRegion(regionName);
            System.out.println(text);


        }
    }
//}
/* } */