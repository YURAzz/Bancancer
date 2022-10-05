import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class stuff {

    // mah dai se sei arrivato qua questo file non è cancro (forse)

    public static HashMap stuff() {
        HashMap logins = new HashMap<>();
        try {
            File file = new File("random.txt");
             Scanner read = new Scanner(file);
                    Boolean i = true;
        String user = null;
while (read.hasNextLine()) {
                String data = read.nextLine();
          if (i) {
                        user = data;
                                i = false;    } else {   String pass = data;
                    i = true;
                    logins.put(user, pass);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("AAAA THIS NOT SUPPOSED TO OCCUR :/"); //si l ho copiato dal file
            //di 
            //prima
            e.printStackTrace();
        }
        return logins;
    }   


    //l'ho scombussolato prima di testarlo e debuggarlo è stato cancro puro
public HashMap 支票() {
                                                                   HashMap MONEY = new HashMap<>();
                            try {
    File file = new File("Login_credentials.txt");
             Scanner read = new Scanner(file);
                    Boolean i = true;
                                           String user = null;
      String mon = null;
  String data = null;
  
  for (int x = 0;x<300;x++){
    data = read.nextLine();
}
while (read.hasNextLine()) {
    
            data = read.nextLine();
          if (i) {
                        user = data;
                                i = false;    } else {   mon = data;
                    i = true;
                    MONEY.put(user, mon);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("AAAA THIS NOT SUPPOSED TO OCCUR :/"); //si l ho copiato dal file
            //di 
            //prima
            e.printStackTrace();
        }
        return MONEY;
    }   

}
