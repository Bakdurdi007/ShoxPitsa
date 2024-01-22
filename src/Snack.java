import java.util.Scanner;

public class Snack extends AddOrderList{
    public static void snackMenu(int id){
        Scanner scanner = new Scanner(System.in);

        System.out.println(" 1. \uD83E\uDD54 Jaydari kartoshka...............................: 15 ming so'm ");
        System.out.println(" 2. \uD83E\uDD6B ShoxPitsa sousidagi qanotchalar.................: 25 ming so'm ");
        System.out.println(" 3. \uD83C\uDF64 Pishloqli tovuq qanotchalar.....................: 25 ming so'm ");
        System.out.println(" 4. \uD83C\uDF5F Kartoshka fri...................................: 20 ming so'm ");
        System.out.println(" 5. \uD83C\uDF57 Tovuq nagets 6 ta dona..........................: 30 ming so'm ");
        System.out.println(" 6. \uD83C\uDF57 Tovuq nagets 9 ta dona..........................: 45 ming so'm ");
        System.out.println(" 0. Orqaga. ");
        System.out.print(" >>> ");

        int n = scanner.nextInt();

        switch (n){
            case 0:
                Menu.menu(id);
                break;

            case 1:
                addOrderList(" Jaydari kartoshka................................: ", 15000L, id);
                snackMenu(id);
                break;

            case 2:
                addOrderList(" ShoxPitsa sousidagi qanotchalar..................: ", 25000L, id);
                snackMenu(id);
                break;

            case 3:
                addOrderList(" Pishloqli tovuq qanotchalar......................: ", 25000L, id);
                snackMenu(id);
                break;

            case 4:
                addOrderList(" Kartoshka fri....................................: ", 20000L, id);
                snackMenu(id);
                break;

            case 5:
                addOrderList(" Tovuq nagets 6 ta dona...........................: ", 30000L, id);
                snackMenu(id);
                break;

            case 6:
                addOrderList(" Tovuq nagets 9 ta dona...........................: ", 45000L, id);
                snackMenu(id);
                break;

            default:
                System.out.println(" Siz mavjud bo'lmagan buyrug'ni tanladingiz! ");
                Menu.menu(id);
                break;
        }
    }
}
