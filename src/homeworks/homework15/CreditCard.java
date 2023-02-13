package homeworks.homework15;

public class CreditCard {
    /*Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.*/

    double balance;
    double interest;

    CreditCard(double balance, double interest){
        this.balance=balance;
        this.interest=interest;
    }
    public void calculateInterest (){
        System.out.println("Interest "+(balance*interest)/100);
    }
}

class Visa extends CreditCard{
    // the child class must have a constructor if the parent class does
    public Visa(double balance, double interest) {
        super(balance, interest);
    }
}

class AX extends CreditCard{
    int time;
    public AX(double balance, double interest, int time) {
        super(balance, interest);
        this.time = time;
    }

    public void calculateInterest (){
        System.out.println("Interest "+(balance*interest*time)/100);
    }

}

class BankClient {
    public static void main(String[] args) {
    CreditCard cc = new CreditCard(100,10);
    cc.calculateInterest();

    Visa v=new Visa(100,10);
    v.calculateInterest();

    AX ax = new AX(100,10,12);
    ax.calculateInterest();
}
}