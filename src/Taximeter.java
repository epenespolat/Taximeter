import java.util.Scanner;

public class Taximeter {

    public static void main(String[] args) {

        double km, perKmPrice=2.2,minPrice = 20, startPrice=10, finalPrice;

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter the KM gone: ");
        km = input.nextDouble();

        finalPrice= (km * perKmPrice) + startPrice;
        double roundFinalPrice = finalPrice < 20 ? minPrice : finalPrice;

        double result = km == 0 ? minPrice : roundFinalPrice;

        System.out.println("The price to pay: "+ result + " TRY");





    }

}
