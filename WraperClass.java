public class WraperClass {
    public static void main(String[] args) {
        int num = 3;

        // Integer is object and num1 in type of object 
        //we are storing num into object type it is called boxing  
       // Integer num1 = new Integer(num);  // boxing 
       Integer num1 = num; // auto-boxing 

       // if we stored object type int integer it is called unboxing 
       int num2 = num1; //auto-unboxing
       System.out.println(num1);

       String str = "12";
       int num3 = Integer.parseInt(str);
       System.out.println(num3);

    }
}
