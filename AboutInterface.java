interface A {
    
    int age=23;   // by default -> final and static
    String area="Mumbai";

    void display();
    void config();    // by default -> public and abstract
}

interface X{
    void run();
}

interface Y extends X {

}




class B implements A,Y { // it must be concrete class (not an abstract class)

    public void display() {
        System.out.println("Display...."+age);
    }

    public void config() {
        System.out.println("Config..."+area);
    }
    public void run(){
        System.out.println("running....");
    }
}

public class AboutInterface {

    public static void main(String[] args) {
        B obj = new B();
        obj.display();
        obj.config();
        obj.run();

        // obj.area="Pune"; // error: cannot assign a value to final variable area

        A obj2;
        obj2= new B();

        obj2.display();
        obj2.config();
        // obj2.run();  // error-> this method is not in A  interface

        System.out.println(A.area);  // we cam directly access it since it is static


        Y obj3;

        obj3= new B();

        obj3.run();   // running....
        // obj3.display();  // error: cannot find symbol

    }

}
