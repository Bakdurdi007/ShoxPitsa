import java.util.Scanner;

public class Menu {

    public static void menu(int id) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" 1. \uD83C\uDF55 Pitsa buyurtma berish. ");
        System.out.println(" 2. \uD83C\uDF5F Snack buyurmat berish. ");
        System.out.println(" 3. \uD83E\uDD64 Ichimliklar buyurmat berish. ");
        System.out.println(" 4. \uD83C\uDF69 Shirinliklar buyurmat berish. ");
        System.out.println(" 5. \uD83D\uDC94 Buyurtmani bekor qilish. ");
        System.out.println(" 6. \uD83D\uDED2 Savatga o'tish. ");
        System.out.println(" 0. \uD83D\uDD19 Orqaga.  ");
        System.out.print(" >>> ");
        int n = scanner.nextInt();

        switch (n) {
            case 0:
                Baza baza = new Baza();
                Registration.registration();
                baza.setOrederCounts(0);
                break;

            case 1:
                // Pitsa buyurtma berish
                Pitsa.pitsaMenu(id);
                break;

            case 2:
                // Snack buyurmat berish.
                Snack.snackMenu(id);
                break;

            case 3:
                // Ichimliklar buyurmat berish
                Drinks.drinksMenu(id);
                break;

            case 4:
                // Shirinliklar buyurmat berish.
                Sweets.sweetsMenu(id);
                break;

            case 5:
                // Buyurtmani bekor qilish.
                System.out.println(" Barcha buyurtmalar bekor qilindi! ");
                Baza baza2 = new Baza();
                for (int i = 0; i < 10000; i++) {
                    baza2.setUserOrderList(null, i, 0);
                    baza2.setUserOrderList(null, i, 1);
                    baza2.setUserOrderList(null, i, 2);
                    baza2.setUserOrderList(null, i, 3);
                    baza2.setUserOrderList(null, i, 4);
                }
                menu(id);
                break;

            case 6:
                // Savatga o'tish.
                Basket.Check(id);
                break;

            default:
                System.out.println(" Siz mavjud bo'lmagan buyrug'ni tanladingiz. ");
                menu(id);
                break;
        }
    }

}
