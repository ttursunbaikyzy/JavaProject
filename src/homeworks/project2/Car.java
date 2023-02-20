package homeworks.project2;

public class Car {
    double carPrice;
    String carColor;
    double calculateSalePrice(double carPrice){
        return carPrice;
    }
}
class Sedan extends Car{
    double length;
    double calculateSalePrice(double carPrice, double length){
        if(length>20){
            return carPrice*0.95;
        }else {
            return carPrice*0.9;
        }
    }

}
class Truck extends Car{
    double weight;
    double calculateSalePrice(double carPrice, double weight){
        if(weight>2000){
            return carPrice*0.9;
        } else {
            return carPrice*0.8;
        }
    }
}

