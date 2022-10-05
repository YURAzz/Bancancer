import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class loginMaQuelloVero {

  public void login() {

    System.out.println("BITCONNNECCCCCT BENVENUTO IN TUA BANCARELA TU ESERE POVERO USARE YURAZ-BANK");
    System.out.println("Inserisci il tuo username: ");
    //login e logins fanno cose completamente diverse e nessuna delle due fa quello che dice
    Scanner login = new Scanner(System.in);
    HashMap logins = new HashMap<String, String>();

    //questa parte forse è scritta bene
    try {
      File file = new File("Login_credentials.txt");
      Scanner read = new Scanner(file);
      Boolean i = true;
      String user = null;
      while (read.hasNextLine()) {
        String data = read.nextLine();
        if (i) {
          user = data;
          i = false;
        } else {
          String pass = data;
          i = true;
          logins.put(user, pass);
        }
      }

    /*stacco pubblicitario
    ringraziamo lo sponsor di questo codice NordVpn

    This code is sponsored by NordVPN. Staying safe online is an ever growing 
    difficulty and you could be exploited by hackers. NordVPN allows you to change 
    your IP address, making you harder to track, securing your privacy. 
    Check out the link in the description (theres no description tho) to get 20% off 
    for the first two months and thank you to NordVPN for sponsoring this code.*/













      logins.clear();
          stuff stuff = new stuff();
          logins = stuff.stuff();
          System.out.println(logins);
      String MahNonSapevoComeChiamarloEAlloraSiChiamaInQuestoModoStupido = login.nextLine();

      boolean kkk = true;
      boolean ss = true;
      while (kkk)

        if (logins.containsKey(MahNonSapevoComeChiamarloEAlloraSiChiamaInQuestoModoStupido)) {
          System.out.println("OKAY U BOI ADESSO DAME PASSEWORDE");
          String SIGNORAILIMONIIIIIIIII = login.nextLine();

          while (ss) {
            if ((logins.get(MahNonSapevoComeChiamarloEAlloraSiChiamaInQuestoModoStupido).equals(SIGNORAILIMONIIIIIIIII))) {
              kkk = false;
              ss = false;

              //E ANDIAMO A BANCARELA
              Bancarela bancarela = new Bancarela();
              bancarela.银行(MahNonSapevoComeChiamarloEAlloraSiChiamaInQuestoModoStupido);
            } else {
              System.out.println(
                  "stavo pensando di farti rimmetere l'username perche sono pigro ma dai sono un dio generoso \npassword:");
              SIGNORAILIMONIIIIIIIII = login.nextLine();
            }
          }
        } else {
          System.out.println("HMMM RETRY");
          MahNonSapevoComeChiamarloEAlloraSiChiamaInQuestoModoStupido = login.nextLine();
        }

    } catch (FileNotFoundException e) {
      System.out.println("AAAA THIS NOT SUPPOSED TO OCCUR :/");
      e.printStackTrace();
    }
  }
}
