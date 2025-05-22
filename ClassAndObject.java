class Calculator{
    public int add(int n1 , int n2){
        int result = n1 + n2;
        return result;
    }
}

public class ClassAndObject {
    public static void main(String []args){
        int num1 = 4;
        int num2 = 3;

        Calculator cl = new Calculator();
        int result = cl.add(num1,num2);
        System.out.println(result);
    }
}
