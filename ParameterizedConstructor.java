class Boy{
    private int age ;
    private String name;
    public Boy(int a , String n ){
        name = n;
        age = a;
    }

    public Boy(){
        age = 21;
        name = "kaif";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class ParameterizedConstructor {
    public static void main(String []args){
        Boy obj = new Boy();
        Boy obj1 = new Boy(12 , "MD");
        System.out.println(obj.getName()+ " : " + obj.getAge());
        System.out.println(obj1.getName()+ " : " + obj1.getAge());
}
}
