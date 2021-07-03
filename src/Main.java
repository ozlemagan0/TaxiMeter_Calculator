import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double way, perKm=2.20, frstPrice=10.0, price, fee;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the km value:");
        way=input.nextDouble();

        price=(frstPrice+(way*perKm));

        boolean result= price<20;
        fee= result ? (price=20.0) : (price);
        System.out.println("Fee you have to pay: " +price +"₺");
    }
}
