import java.text.NumberFormat;
import java.util.Locale;

public class Billing {
    private double price;
    private int quantity;
    private int coupon;
    private static double tax = 0.08;
    private String total;
    private NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);

    void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setCoupon(int coupon) {
        this.coupon = coupon;
    }

    public int getCoupon() {
        return coupon;
    }


    void computeBill(double price){
        price= (price*tax)+price;
        this.total = currencyFormat.format(price);
        System.out.println("Your total is:" + total);
    }
    void computeBill(double price, int quantity){
        price=  ((price*quantity)*tax)+price*quantity;
        this.total = currencyFormat.format(price);
        System.out.println("Your total is:"+ total);
    }
    void computeBill(double price, int quantity, int coupon){
        price=  ((((price*quantity)-coupon)*tax)+((price*quantity)-coupon));
        this.total = currencyFormat.format(price);
        System.out.println("Your total is:"+ total);
    }
}
