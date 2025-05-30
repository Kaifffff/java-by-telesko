abstract  class Car{
    abstract public void drive();

    protected abstract void fly();
}

abstract class WagonR extends Car{
    public void drive(){
        System.out.println("drive car....");
    }

    // abstract public void fly();
}

class UpdatedWagonR extends WagonR{
     public void fly(){
        System.out.println("car can fly...");
    }
}

public class AbstractKeyword {
    public static void main(String[] args) {
        Car obj = new UpdatedWagonR();
        obj.drive();
        obj.fly();
    }
}
