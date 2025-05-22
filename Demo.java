
class Overloading{
    public int add(int n1 , int n2){
        return n1 + n2;
    }

    public int add(int n1 , int n2 , int n3){
        return n1 + n2 + n3;
    }

    public double add(double n1 , int n2){
        return n1 + n2;
    }
}

public class Demo {
    public static void main(String []args){
        Overloading obj = new Overloading();
        int result1 = obj.add(10 ,11);
        int result2 = obj.add(10,10,10);
        double result3 = obj.add(10 , 10);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
