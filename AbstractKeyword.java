abstract class Car {
    public abstract void  drive();
    public abstract void  fly();

    public void playMusic(){
        System.out.println("Playing music");
    }
}

abstract class Mercedes extends Car{
    public void drive(){
        System.out.println("Driving ");
    }
}

class UpdatedMercedes extends Mercedes{  // concrete class
    public void fly(){
        System.out.println("Flying ");
    }

}

class AbstractKeyword{
    public static void main(String[] args) {
        // Car obj= new Car(); // we can't create object of a abstract class

        // About abstract class -> 
        // 1. Abstract class can have abstract methods and non-abstract methods
        // 2. Abstract class can't be instantiated
        // 3. Abstract class can have constructor
        // 4. Abstract class can have main method


        // About abstract methods ->
        // 1. Abstract methods can't have body
        // 2. Abstract methods must be implemented by the subclass
        // 3. Abstract methods must be declared in abstract class
        // 4. Abstract methods can't be private
        // 5. Abstract methods can't be final


        // About abstract keyword ->
        // 1. Abstract keyword is used to declare abstract class
        // 2. Abstract keyword is used to declare abstract methods

        Car obj1= new UpdatedMercedes();

        obj1.drive();
        obj1.playMusic();
        obj1.fly();






    }
}