
public class Review01 {

    public static void main(String[] args) {
        int price = 1500 ;
        int tax;
        tax = tax (price);
        System.out.println
        ( price + "円の商品の税込価格は" + (price + tax ) +"円（消費税は" +  tax + "円）です。");

    }
public static int tax (int price) {
    int zeiritsu = 10;
    double s =  (double)zeiritsu/100;
    double tax = s * price;
    return (int)tax
            ;
}}


