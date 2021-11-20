import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double tutar;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the price that calculate the KDV: " );

        tutar = inp.nextDouble();

        if ((tutar<1000) && (tutar>0)) {
            System.out.println("Your tax rate is: %18");
            double tax1 = (tutar*18)/100;
            double withTax= tutar+tax1;
            System.out.println("Price that without KDV tax: "+ tutar );
            System.out.println("KDV tax: "+ tax1 );
            System.out.println("Price that with KDV tax: "+ withTax );
        }
        else {
            System.out.println("Your tax rate is: %8");

            double tax2 = (tutar*8)/100;
            double withTax= tutar+tax2;
            System.out.println("Price that without KDV tax: "+ tutar );
            System.out.println("KDV tax: "+ tax2 );
            System.out.println("Price that with KDV tax: "+ withTax );
        }











    }
}
