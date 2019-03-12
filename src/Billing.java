import java.text.NumberFormat;
import java.util.Locale;

public class Billing {
    private NumberFormat price = NumberFormat.getCurrencyInstance(Locale.US);
    private int quantity;
    private int coupon;
    private static double tax = 0.08;

    public void setPrice(NumberFormat price) {
        this.price = price;
    }

    public NumberFormat getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
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

    void computeBill(int price){
        price= (int) (price*tax+price);
        System.out.println("Your total is:" + price);
    }
    void computeBill(int price,int quantity){
        price= (int) ((price*quantity)*tax+(price*quantity));
        System.out.println("Your total is:"+ price);
    }
    void computeBill(int price,int quantity,int coupon){
        price= (int) (((price*quantity)-coupon)*tax+((price*quantity)-coupon));
        System.out.println("Your total is:"+ price);
    }
}
