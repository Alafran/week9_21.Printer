
import java.io.File;
import java.util.Scanner;


public class Printer {
    
    private Scanner reader;
    private File f;
    
    public Printer(String fileName) throws Exception {
        this.f = new File(fileName);
        
    }
    
    public void printLinesWhichContain(String word) throws Exception {
        this.reader = new Scanner(f);
        while(reader.hasNextLine()) {
            String line = reader.nextLine();

            if(line.contains(word)) {
                System.out.println(line);
            }
   
        }
    }
    
}
