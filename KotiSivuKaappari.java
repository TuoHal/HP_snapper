package kotisivukaappari;
import java.net.*;
import java.util.Scanner;
/**
 *
 * @author tuomas.halonen
 */
public class KotiSivuKaappari {


    public static void main(String[] args) {
        // Creation of variables
        
      String content = null;
      URLConnection connection;
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
System.out.println(content);
    }
    
}
