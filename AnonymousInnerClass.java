class A{
    public void show(){
        System.out.println("In original class");
    }
    public void display(){
        System.out.println("In  original display");
    }
}


public class AnonymousInnerClass {
    public static void main(String[] args) {

        A obj = new A()
        {                         // anonymous inner class
            public void show(){
                System.out.println("In Anonymous class");
            }         
        };


        obj.show();
        obj.display();


        // anonymous inner class is a class defined within a method
        // it has no name
        // it is used when you have to override a method of a class or interface
        // it is used when you have to perform some task only once


        // can we have multiple inner class in a single class?
        // yes, we can have multiple inner class in a single class
        // can we have inner class inside inner class?
        // yes, we can have inner class inside inner class
        
        
    }
    
}
