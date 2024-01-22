import java.util.Scanner;

public class Sweets extends AddOrderList{

    public static void sweetsMenu(int id){
        Scanner scanner = new Scanner(System.in);

        System.out.println(" 1. \uD83E\uDD6E Keks tort........................................: 15 mimg so'm ");
        System.out.println(" 2. \uD83C\uDF70 To'rt bo'lagi 300g...............................: 20 ming so'm ");
        System.out.println(" 3. \uD83C\uDF6B Shokaland........................................: 25 ming so'm ");
        System.out.println(" 4. \uD83C\uDF68 Muzqaymoq........................................: 10 ming so'm ");
        System.out.println(" 5. \uD83C\uDF30 Asalli bo'lichka.................................: 15 ming so'm ");
        System.out.println(" 0. Orqaga. ");
        System.out.print(" >>> ");

        int n = scanner.nextInt();

        switch (n){
            case 0:
                Menu.menu(id);
                break;

            case 1:
                addOrderList(" Keks tort........................................: ", 15000L, id);
                sweetsMenu(id);
                break;

            case 2:
                addOrderList(" To'rt bo'lagi 300g...............................: ", 20000L, id);
                sweetsMenu(id);
                break;

            case 3:
                addOrderList(" Shokaland........................................: ", 25000L, id);
                sweetsMenu(id);
                break;

            case 4:
                addOrderList(" Muzqaymoq........................................: ", 10000L, id);
                sweetsMenu(id);
                break;

            case 5:
                addOrderList(" Asalli bo'lichka.................................: ", 15000L, id);
                sweetsMenu(id);
                break;

            default:
                System.out.println(" Siz mavjud bo'lmagan buyrug'ni tanladingiz! ");
                Menu.menu(id);
                break;
        }
    }
}
