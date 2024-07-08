class Outer {
    public int age = 10;

    public void show() {
        System.out.println("Outer class");
    }

    class Inner {
        int marks=80;
        public void display() {
            System.out.println("Inner class");
        }
    }

    static class Inner2 {
        public void find() {
            System.out.println("Inner class 2");
        }
    }
}

class InnerClass {
    public static void main(String[] args) {

        Outer obj = new Outer();
        obj.show();

        // obj.display(); // error-> method not defined for outer class

        // Inner obj2= new Inner(); // can't be resolved

        Outer.Inner obj2 = obj.new Inner(); // for non static class

        obj2.display();
        

        Outer.Inner2 obj3= new Outer.Inner2(); // for static class

        obj3.find();
     
     


        // explain Inner class -> inner class is a class defined within another class
    
      







    }
}