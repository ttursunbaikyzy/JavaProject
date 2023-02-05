package classes.class19;

public class Test {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.accountNumber=784543543455l;
        ba.money=1000;
        ba.deposit();

        System.out.println(ba.accountNumber);
        System.out.println(ba.money);

        // ba.transfer();  methods defined inside child class not available to the parent class

        System.out.println("--Creating an Object of the Checking account");
        // features from parent
        Checking check=new Checking();
        check.accountNumber=5765;
        check.money=780;
        // features from check class itself
        check.interest=0;

        check.deposit(); // from parent
        check.transfer(); // from child

        System.out.println("---Creating an Object of Savings account");

        Savings save=new Savings();
        save.accountNumber=54354687545465l;
        save.money=7657;
        save.profit=100;
        // save.interest=0; siblings features are not available

        save.deposit(); // from parent
        save.takeProfit(); //comes from savings
        //save.transfer(); not available

        //HW: finish creating SuperSavings object and see which feature available to that class

        SuperSavings superSave=new SuperSavings();
        superSave.accountNumber=546843867415l;
        superSave.money=10000;
        superSave.profit=2000;
        superSave.deposit();
        superSave.takeProfit();
        // superSave.transfer(); not available
        superSave.superSaving();

    }
}
