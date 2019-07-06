import de.redsix.pdfcompare.PdfComparator;

public class pdfCompare {

    public static void main(String[] args)throws Exception{

        String file1= "C:\\Users\\SOUMEN DEB\\Desktop\\pdf comparision\\doc1.pdf";
        String file2= "C:\\Users\\SOUMEN DEB\\Desktop\\pdf comparision\\doc2.pdf";
        String results="C:\\Users\\SOUMEN DEB\\Desktop\\pdf comparision\\results";

       //writing a result file with difference
        new PdfComparator(file1, file2).compare().writeTo(results);

       //retuns boolean value along with result file
        /* boolean isEquals = new PdfComparator(file1, file2).compare().writeTo(results);
        if (!isEquals) {
            System.out.println("Differences found!");
        } */


    }
}
