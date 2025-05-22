class Demo1{

    public void Music(){
        System.out.println("playing music...");
    }

    public String GiveMePen(int cost){
        if(cost>=10){
            return "pen";
        }
        return "Nothing";
    }
}


public class Methods {
    public static void main(String []args){
        Demo1 obj1 = new Demo1();
        obj1.Music();
        String result = obj1.GiveMePen(10);
        System.out.println(result);
    }
}
