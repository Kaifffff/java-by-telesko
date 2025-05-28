
class Calculator{
    public int add(int a , int b){
        return a + b;
    }

    public int sub(int a , int b){
        return a - b;
    }
}

class AdsCalculator extends Calculator{

    public int mul(int a , int b){
        return a * b;
    }

    public int div(int a , int b){
        return a/b;
    }

}

class VeryAdsCal extends AdsCalculator{

    public double pow(int a , int b){
        return Math.pow(a, b);
    }
}


public class MultiLevelInheritance {
    public static void main(String[] args) {
        VeryAdsCal obj = new VeryAdsCal();
        System.out.println(obj.add(1, 3) + " " + obj.sub(3, 1) + " " + obj.mul(4, 4) + " " + obj.div(10, 5) + " " + obj.pow(2, 4));
    }
}
