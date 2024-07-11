enum Laptop{
    DELL(1500), HP(1200), LENOVO(1800), APPLE(2200), ACER;

    private int price;

    private Laptop(){
        this.price = 1000;
    }


    private Laptop(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
};

public class AboutEnumClass2 {

    public static void main(String[] args) {
        Laptop lp= Laptop.DELL;

        // System.out.println(lp+" : "+lp.getPrice());
        
        lp.setPrice(1600);

        // System.out.println(lp+" : "+lp.getPrice());

        Laptop[] lps = Laptop.values();

        for (Laptop it : lps) {
            System.out.println(it+" : "+it.getPrice());
        }

        //  enum class -> it is almost like a class....it can have properties and methods
        //  enum class -> it can have constructors
        //  only difference -> it doesn't support inheritance  
       




    }

}
