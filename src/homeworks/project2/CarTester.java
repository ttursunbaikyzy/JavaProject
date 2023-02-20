package homeworks.project2;

public class CarTester {
    public static void main(String[] args) {
        Sedan sedan=new Sedan();
        System.out.println("The price of a sedan is "+sedan.calculateSalePrice(38000,15));

        Truck truck=new Truck();
        System.out.println("The price of a truck is "+truck.calculateSalePrice(89000,2200));
    }
}
