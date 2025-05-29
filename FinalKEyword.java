//final keyword
//variable : we use final keyword for make variable constant 
//method : we use final keyword for stop method overriding 
//class : we use final keyword for stop inheritance 
class X{
    public final void show(){
        System.out.println("by kaif");
    }

    public void add(int a , int b){
        System.out.println(a+b);
    }
}

class Y extends X{
    //  public void show(){                  // it gives error
    //     System.out.println("by jon");
    // }
}

public class FinalKEyword {
    public static void main(String[] args) {
        Y obj = new Y();
        obj.show();
        obj.add(2, 3);
    }
}
