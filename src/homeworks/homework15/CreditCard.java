package homeworks.homework15;

public class CreditCard {
    /*Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.*/

    double balance;
    double interest;

    void calculateInterest (){
        System.out.println((balance*interest)/100);
    }
}

class Visa extends CreditCard{

}

class AX extends CreditCard{
    int time;
    void calculateInterest (){
        System.out.println((balance*interest*time)/100);
    }
}

class BankClient {
    public static void main(String[] args) {
    CreditCard cc = new CreditCard();
    cc.balance=5000;
    cc.interest=10.5;
    cc.calculateInterest();

    Visa v=new Visa();
    v.balance=4500;
    v.interest=5.75;
    v.calculateInterest();

    AX ax = new AX();
    ax.balance=7500;
    ax.interest=3.3;
    ax.time=12;
    ax.calculateInterest();

}
}