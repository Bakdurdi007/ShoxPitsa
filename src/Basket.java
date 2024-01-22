import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Basket {

    public static void Check(int id){
        Baza baza = new Baza();

        long Summa = 0;

        System.out.println("\t\t\t\t\t\t\tRO'YXAT ");
        System.out.println(" Ismi....................................................: " + baza.getUserName(id));
        System.out.println(" Telefon raqami..........................................: " + baza.getUserPhoneNumber(id));
        System.out.println(" Manzil..................................................: " + baza.getUserLocation(id));
        for (int i = 0; i < 10000; i++) {
            if(baza.getUserOrderList(i, 2) == null){
                break;
            }
            if(i < 9){
                if(baza.getUserOrderList(i, 1).equals(String.valueOf(id))){
                    System.out.println(" 0" + (i + 1)  + " -> " + baza.getUserOrderList(i, 2) + baza.getUserOrderList(i, 3) + " ta " + baza.getUserOrderList(i, 4) + " so'm ");
                    Summa += Long.parseLong(baza.getUserOrderList(i, 4));
                }
            }else {
                if(baza.getUserOrderList(i, 1).equals(String.valueOf(id))){
                    System.out.println(" " + (i + 1)  + " -> " + baza.getUserOrderList(i, 2) + baza.getUserOrderList(i, 3) + " ta " + baza.getUserOrderList(i, 4) + " so'm ");
                    Summa += Long.parseLong(baza.getUserOrderList(i, 4));
                }
            }

        }
        Time();
        System.out.println(" JAMI SUMMA..............................................: " + Summa + " so'm \n\n");

        Menu.menu(id);
    }

    public static void Time(){
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println(" Ro'yxatga olingan vaqti.................................: " + formattedDate);
    }
}
