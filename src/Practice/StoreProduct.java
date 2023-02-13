package Practice;

class StoreProduct {
    String label;
    double price;
    String category;
    boolean hasExpiration=false;
    int stock;

    StoreProduct(String label, double price, String category, boolean hasExpiration, int stock){
        this.label=label;
        this.price=price;
        this.category=category;
        this.hasExpiration=hasExpiration;
        this.stock=stock;
    }

    StoreProduct(String label, double price, int stock){
        this.label=label;
        this.price=price;
        this.stock=stock;
    }

    StoreProduct(String label, double price){
        this.label=label;
        this.price=price;
    }

    void display () {
        System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
    }
}

class Main{

    public static void main(String [] args){
        StoreProduct p1= new StoreProduct("Eggs",3,"Produce",true,10);
        p1.display();
        StoreProduct p2= new StoreProduct("Paper Towels",2,24);
        p2.category="misc";
        p2.display();
        StoreProduct p3= new StoreProduct("Paper Towels",2);
        p3.display();
    }
}
