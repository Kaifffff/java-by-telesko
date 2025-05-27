
class Mobile{
        String name;
        int price;
        static String brand;
        public void show(){
            System.out.println(name +":" + price + ":" + brand);
            // we got brand : phone for all output where brand is printed because static variable shared by all the objects 
        }
    }
public class StaticVariable {
    
    public static void main(String[] args) {
        // we can call variable with object but we shaould call static variable with class name 
       Mobile obj1 = new Mobile();
       obj1.name="Samsung";
       obj1.price = 1200;
       Mobile.brand = "Phone";

       Mobile obj2 = new Mobile();
       obj2.name="apple";
       obj2.price = 1700;
       obj2.brand = "Phone";

       Mobile obj3 = new Mobile();
       obj3.name="vovo";
       obj3.price = 1000;
       obj3.brand = "Phone";

       obj1.show();
       obj2.show();
       obj3.show();
    }
}
