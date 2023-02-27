package homeworks.homework18;

import java.util.ArrayList;
import java.util.Iterator;

public class Task6 {
    public static void main(String[] args) {
        /*
        Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as
        getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as
        carModel and Class Pet has petType attribute. Create 3 objects of the sub classes and store them in ArrayList.
        Using for loop/advanced for loop/ iterator access all methods of the class.
         */

        ArrayList<Insurance> insurance=new ArrayList<>();
        insurance.add(new Car("Geico","Hyundai"));
        insurance.add(new Pet("Petco","dog"));
        insurance.add(new Health("Aetna"));

        for (int i = 0; i < insurance.size(); i++) {
            Insurance ins=insurance.get(i);
            ins.getQuote();
            ins.cancelInsurance();
            System.out.println();
        }
        System.out.println("***************************************");

        for (Insurance ins:insurance){
            ins.getQuote();
            ins.cancelInsurance();
            System.out.println();
        }
        System.out.println("***************************************");

        Iterator<Insurance>iterator=insurance.iterator();
        while (iterator.hasNext()){
            Insurance i=iterator.next();
            i.getQuote();
            i.cancelInsurance();
            System.out.println();
        }

        System.out.println("***************************************");
        insurance.forEach(i->i.getQuote());
        insurance.forEach(i -> i.cancelInsurance());

    }
}
abstract class Insurance{
    String insuranceName;
    public abstract void getQuote();
    public abstract void cancelInsurance();
}
class Car extends Insurance{
    String carModel;
    Car(String insuranceName, String carModel){
        super.insuranceName=insuranceName;
        this.carModel=carModel;
    }

    @Override
    public void getQuote() {
        System.out.println("The insurance coverage will cost $250 for your "+this.carModel+" with "+super.insuranceName);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("There is no penalty to cancel coverage with "+super.insuranceName);
    }
}
class Pet extends Insurance{
    String petType;
    Pet(String insuranceName, String petType){
        super.insuranceName=insuranceName;
        this.petType=petType;
    }
    @Override
    public void getQuote() {
        System.out.println("The insurance coverage will cost $50 for your "+this.petType+" with "+super.insuranceName);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("There is a $25 charge to cancel coverage with "+super.insuranceName);
    }
}
class Health extends Insurance{
    Health(String insuranceName){
        super.insuranceName=insuranceName;
    }
    @Override
    public void getQuote() {
        System.out.println("The insurance coverage will cost $850 with "+super.insuranceName);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("There is a waiting period that has to be met before you can cancel coverage with "+super.insuranceName);
    }
}