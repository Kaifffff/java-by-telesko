class Calc{


    public int add(int a , int b){
        return a + b;
    }

    public int sub(int a , int b){
        return a - b;
    }
}

class AdvCal extends Calc{

    public int mul(int a , int b){
        return a * b;
    }

    public int div(int a , int b){
        return a / b;
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Calc obj = new Calc();
        AdvCal obj1 = new AdvCal();

        System.out.println(obj1.add(10,10) + " " + obj1.sub(5,1) + " " + obj1.mul(2,3) + " " + obj1.div(10, 2) );

    }
}
