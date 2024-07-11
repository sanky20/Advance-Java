interface Computer {
    void code();

}

class Laptop implements Computer{
    public void code(){
        System.out.println("Code,compile,run...");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Code,compile,run...Fasterrrr...");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {

        Computer developer1= new Laptop();
        developer1.code();
        Computer developer2= new Desktop();  
        developer2.code();
    } 
}
