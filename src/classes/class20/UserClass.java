package classes.class20;

public class UserClass {
    /*
    Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
    Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
    Print users name, mobile number and address in userDetails method. Test your code.
     */

    String name, number;

    UserClass(String name, String number){
        this.name=name;
        this.number=number;
    }

}

class UserInfo extends UserClass {
    String address;

    UserInfo(String name, String number, String address){
        super (name, number);
        this.address=address;
    }

    void userDetails () {
        System.out.println("Name: "+name+", mobile number: "+number+", address: "+address);
    }
}