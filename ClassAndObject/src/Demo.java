
class Calculator{
    public int add(int n1,int n2){
        int result = n1 + n2;
        return result ;
    }
}

public class Demo {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 4;

        Calculator cl = new Calculator();
        cl.add(num1 , num2);
    }
}