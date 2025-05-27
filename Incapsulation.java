class Human{
    //binding data with methods is known as incapsulation

    private String name ;
    private int age ;

    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

public class Incapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(21);
        obj.setName("kaif");
        System.out.println(obj.getName()+ " : " + obj.getAge());
    }
}
