import java.util.Scanner;

public class Drinks extends AddOrderList{

    public static void drinksMenu(int id) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" 1. \uD83E\uDD64 Coca-Cola........................................: 10 ming so'm ");
        System.out.println(" 2. \uD83E\uDDC3 Olma sharbat.....................................: 15 ming so'm ");
        System.out.println(" 3. \uD83E\uDDCB Limon choy.......................................: 10 ming so'm ");
        System.out.println(" 4. \uD83C\uDF7E Chortoq gazlangan suvi...........................: 15 ming so'm ");
        System.out.println(" 0. Orqaga. ");
        System.out.print(" >>> ");

        int n = scanner.nextInt();

        switch (n) {
            case 0:
                Menu.menu(id);
                break;

            case 1:
                addOrderList(" Coca-Cola........................................: ", 10000L, id);
                drinksMenu(id);
                break;

            case 2:
                addOrderList(" Olma sharbat.....................................: ", 15000L, id);
                drinksMenu(id);
                break;

            case 3:
                addOrderList(" Limon choy.......................................: ", 10000L, id);
                drinksMenu(id);
                break;

            case 4:
                addOrderList(" Chortoq gazlangan suvi...........................: ", 10000L, id);
                drinksMenu(id);
                break;

            default:
                System.out.println(" Siz mavjud bo'lmagan buyrug'ni tanladingiz! ");
                Menu.menu(id);
                break;
        }
    }
}
