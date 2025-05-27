class Mob{
        String name;
        int price;
        static String brand;
        public void show(){
            System.out.println(name +":" + price + ":" + brand);
            // we got brand : phone for all output where brand is printed because static variable shared by all the objects 
        }

        public static void show1(Mob obj){
            System.out.println(obj.name +":" + obj.price + ":" + brand);
        }
    }

public class StaticMethod {
     public static void main(String[] args) {
        // we can call variable with object but we shaould call static variable with class name 
       Mob obj1 = new Mob();
       obj1.name="Samsung";
       obj1.price = 1200;
       Mob.brand = "Phone";

       Mob obj2 = new Mob();
       obj2.name="apple";
       obj2.price = 1700;
       obj2.brand = "Phone";

       Mob obj3 = new Mob();
       obj3.name="vovo";
       obj3.price = 1000;
       obj3.brand = "Phone";

    //    obj1.show();
    //    obj2.show();
    //    obj3.show();

       Mob.show1(obj1);
    }
}
