import java.util.Scanner;

public class AddOrderList {
    public static void addOrderList(String Name, long Summa, int id){
        Scanner scanner = new Scanner(System.in);
        Baza baza = new Baza();

        int count = baza.getOrederCounts();

        System.out.println(" Nechta dona buyurtma qilmoqchisiz? ");
        System.out.print(" Soni =  ");
        long Soni = scanner.nextInt();


        baza.setUserOrderList(String.valueOf(count), count, 0);
        baza.setUserOrderList(String.valueOf(id), count, 1);
        baza.setUserOrderList(Name, count, 2);
        baza.setUserOrderList(String.valueOf(Soni), count, 3);
        baza.setUserOrderList(String.valueOf(Soni * Summa), count, 4);

        count++;

        baza.setOrederCounts(count);
    }
}
