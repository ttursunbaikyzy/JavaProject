package homework.homework7;

public class PhoneTester {
    public static void main(String[] args) {

        Phone phone1 = new Phone();

        phone1.brand="iPhone";
        phone1.model="13";
        phone1.color="black";
        phone1.memoryGB=512;

        System.out.println(phone1.brand+" "+phone1.model);
        phone1.call();
        phone1.text();
        phone1.camera();
        phone1.music();
        phone1.games();


        Phone phone2 = new Phone();

        phone2.brand="Pixel";
        phone2.model="7 Pro";
        phone2.color="white";
        phone2.memoryGB=128;

        System.out.println();
        System.out.println(phone2.brand+" "+phone2.model);
        phone2.call();
        phone2.text();
        phone2.camera();
        phone2.music();
        phone2.games();


        Phone phone3 = new Phone();

        phone3.brand="Samsung";
        phone3.model="Galaxy S22";
        phone3.color="Pink";
        phone3.memoryGB=256;

        System.out.println();
        System.out.println(phone3.brand+" "+phone3.model);
        phone3.call();
        phone3.text();
        phone3.camera();
        phone3.music();
        phone3.games();


    }
}
