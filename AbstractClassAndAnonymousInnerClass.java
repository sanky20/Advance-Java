abstract class A{
    public abstract void display();

}

public class AbstractClassAndAnonymousInnerClass {
    public static void main(String[] args) {

        A obj= new A(){
            public void display(){
                System.out.println("Anonymous Inner Class");
            }
        };

        obj.display();
        
    }
    
}
