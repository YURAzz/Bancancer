import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

//sto morendo dentro
public class operazione {

    




    public void bonifico(String 选择, String 用户, String 嘘) {

        HashMap Money = Money();
        Object newValue = Money.get(用户);
        newValue = Integer.parseInt(newValue.toString()) - Integer.parseInt(嘘);
        Money.replace(用户, newValue);
        Object friendMoneda = Money.get(选择);
        friendMoneda = Integer.parseInt(friendMoneda.toString()) - Integer.parseInt(嘘);
        Money.replace(选择, friendMoneda);

        System.out.println("Adeso tu avere questi soldini: " + Money.get(用户)
        + "\n e tuo amigo avere " + Money.get(选择));
    }

    public static void prelievo(String 选择, String 用户) {
        HashMap Money = Money();
        Object newValue = Money.get(用户);
        newValue = Integer.parseInt(newValue.toString()) - Integer.parseInt(选择);
        Money.replace(用户, newValue);
        System.out.println("Adeso tu avere questi soldini: " + Money.get(用户));
    }

    public static HashMap Money() {
        HashMap MONEY = new HashMap<>();
            try
            {
                File file = new File("Login_credentials.txt");
                Scanner read = new Scanner(file);
                Boolean i = true;
                String user = null;
                String mon = null;
                String data = null;
        
                for (int x = 0; x < 300; x++) {
                    data = read.nextLine();
                }
                while (read.hasNextLine()) {
        
                    data = read.nextLine();
                    if (i) {
                        user = data;
                        i = false;
                    } else {
                        mon = data;
                        i = true;
                        MONEY.put(user, mon);
                    }
                }
            }catch(
            FileNotFoundException e)
            {
                System.out.println("AAAA THIS NOT SUPPOSED TO OCCUR :/"); // si l ho copiato dal file
                // di
                // prima
                e.printStackTrace();
            }
        return MONEY;
    }

}
