class Phone{
       
        static String brand;

        public Phone(){
             String name;
             int price;
             System.out.println("in constructor");
        }
        // public void show(){
        //     System.out.println(name +":" + price + ":" + brand);
        //     // we got brand : phone for all output where brand is printed because static variable shared by all the objects 
        // }

        // public static void show1(Phone obj){
        //     System.out.println(obj.name +":" + obj.price + ":" + brand);
        // }
        static{
            System.out.println("static block");
        }
    }

public class StaticBlock {
    public static void main(String[] args) {
        // we can call variable with object but we shaould call static variable with class name 
       Phone obj1 = new Phone();
    //    obj1.name="Samsung";
    //    obj1.price = 1200;
    //    Phone.brand = "Phone";

       Phone obj2 = new Phone();
    //    obj2.name="apple";
    //    obj2.price = 1700;
    //    obj2.brand = "Phone";

    //    Phone obj3 = new Phone();
    //    obj3.name="vovo";
    //    obj3.price = 1000;
    //    obj3.brand = "Phone";

    //    obj1.show();
    //    obj2.show();
    //    obj3.show();

    //    Phone.show1(obj1);
    }
}
