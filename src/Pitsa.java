import java.util.Scanner;

public class Pitsa extends AddOrderList{
    public static void pitsaMenu(int id){

        Scanner scanner = new Scanner(System.in);

        System.out.println(" 1. \uD83D\uDE4D\u200D♂️ Kichkina.........................................: 25 ming so'm ");
        System.out.println(" 2. \uD83D\uDC6B O'rtacha.........................................: 35 ming so'm ");
        System.out.println(" 3. \uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC66 Katta............................................: 50 ming so'm ");
        System.out.println(" 4. \uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC67\u200D\uD83D\uDC66 Oilaviy..........................................: 70 ming so'm ");
        System.out.println(" 0. Orqaga");
        System.out.print(" >>> ");

        int n = scanner.nextInt();

        switch (n){
            case 0:
                Menu.menu(id);
                break;

            case 1:
                addOrderList(" Kichkina.........................................: ", 25000L, id);
                pitsaMenu(id);
                break;

            case 2:
                addOrderList(" O'rtacha.........................................: ", 35000L, id);
                pitsaMenu(id);
                break;

            case 3:
                addOrderList(" Katta............................................: ", 50000L, id);
                pitsaMenu(id);
                break;

            case 4:
                addOrderList(" Oilaviy..........................................: ", 70000L, id);
                pitsaMenu(id);
                break;

            default:
                System.out.println(" Siz mavjud bo'lmagan buyrug'ni tanladingiz! ");
                Menu.menu(id);
                break;
        }
    }
}
