import java.util.HashMap;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Bancarela {

    // SE SEI ARRIVATO QUI MERITI UN PREMIO MAN
    public static void 银行(String 用户) {

        stuff 东西 = new stuff();
        HashMap 支票 = 东西.支票();
        String 钱 = 支票.get(用户).toString();

        System.out.println("okay man adesso non so cosa vuoi visto che sei povero e hai "
                + 钱 + " YURAzz-dollari sul conto");

        System.out.println("vuoi fare un bonifico o vuoi prelevare? (cerca di scrivere bonifico o prelievo, GRAZIE)");

        Scanner 选择了 = new Scanner(System.in);
        String 选择 = 选择了.nextLine();

        Boolean 好的 = true;
        while (好的) {
            switch (选择) {
                case "bonifico":
                    System.out.println("okay signo' chi bonifichiamo?\n");
                    System.out.println(支票.keySet());
                    选择 = 选择了.nextLine();
                    System.out.println("e quanto bonifichiamo?");
                    String 嘘 = 选择了.nextLine();
                    if (支票.containsKey(选择)) {
                        operazione bonifico = new operazione();
                        bonifico.bonifico(选择, 用户, 嘘);
                        好的 = false;
                    }
                    break;
                case "prelievo":
                    System.out.println("okay signo quanto preveliamo?");
                    选择 = 选择了.nextLine();
                    operazione prelievo = new operazione();
                    prelievo.prelievo(选择, 用户);
                    好的 = false;
                    break;
                default:
                    System.out.println("你是个愚蠢的混蛋 \n riproviamo");
                    选择 = 选择了.nextLine();
                    break;
            }
        }
        选择了.close();
    }

}
