import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Billing billing = new Billing();
        Scanner scanner = new Scanner(System.in);

        //Creating a menu
        System.out.println();
        System.out.println("Harry potter |"+"pride and prejudice |"+"Ready Player one");
        System.out.println("  $23.00 "+"    |       $12.00 "+"      |      $9.00");
        System.out.println("Hi sir, which book do you want?(Choose with number 1,2 or 3)");
        int book = scanner.nextInt();
        switch (book){
            case 1:
                billing.setPrice(23.00);
                break;
            case 2:
                billing.setPrice(12.00);
                break;
            case 3:
                billing.setPrice(9.00);
                break;
        }
        System.out.println("Plz choose your quantity:");
        billing.setQuantity(scanner.nextInt());
        System.out.println("Do you have coupon?(y/n)");
        String answer = scanner.next();
        if (answer.equals("y")) {
            System.out.println("enter the value of your coupon");
            billing.setCoupon(scanner.nextInt());
        }

        if ( answer.equals("y")){
            billing.computeBill(billing.getPrice(),billing.getQuantity(),billing.getCoupon());
        } if (billing.getQuantity()!=1 && answer.equals("n")){
            billing.computeBill(billing.getPrice(),billing.getQuantity());
        } if (billing.getQuantity()==1 && answer.equals("n")){
            billing.computeBill(billing.getPrice());
        }






    }



}
