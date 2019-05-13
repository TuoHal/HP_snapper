package kotisivukaappari;
import java.net.*;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author tuomas.halonen
 */
public class KotiSivuKaappari {


    public static void main(String[] args) throws FileNotFoundException {
        // Creation of variable to store content and for the url
        
      String content = null;
      URLConnection connection;
      //try - catch for connection. 
            try {
                    connection =  new URL("https://vita.fi/laboratoriokasikirja/tutkimus/270").openConnection();
                    Scanner scanner = new Scanner(connection.getInputStream());
                    scanner.useDelimiter("\\Z");
                    content = scanner.next();
                    scanner.close();
                }
            catch ( Exception ex ) {
                    ex.printStackTrace();
                }
            PrintWriter txt = new PrintWriter("tekstina.txt");
            txt.println(content);
    }
    
}
