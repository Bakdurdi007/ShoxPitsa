import java.util.Scanner;

public class Registration {

    public static int counts = 0;
    public static void registration(){
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Ismingizni kirting: ");
        String UserName = scanner.nextLine();

        System.out.print(" Telefon raqamingizni kirting: ");
        String UserPhoneNumber = scanner.nextLine();

        System.out.print(" Manzilingizni kirting: ");
        String UserLocation = scanner.nextLine();

        Baza baza = new Baza();

        baza.setUserName(UserName, counts);
        baza.setUserPhoneNumber(UserPhoneNumber, counts);
        baza.setUserLocation(UserLocation, counts);

        System.out.println(" \uD83D\uDCDD Ma'lumotlaringiz yozib olindi!!! ");

        Menu.menu(counts);

        counts++;
    }
}
