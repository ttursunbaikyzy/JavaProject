package videos.videos8;

public class DogConstructor {
    String name;
    int age;

    public DogConstructor (String name, int age) {
        this.name=name;
        this.age=age;
    }


    public static void main(String[] args) {
        DogConstructor dog=new DogConstructor("Nickou",7);
        System.out.println(dog.name+" "+dog.age);
    }

}
