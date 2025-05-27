class Student{
    //this keyword is represent the current object of a class in this 
    // case class Student. object of student is obj 

    private String name ;
    private int age ;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

public class ThisKeword {
     public static void main(String[] args) {
        Student obj = new Student();
        obj.setAge(21);
        obj.setName("kaif");
        System.out.println(obj.getName()+ " : " + obj.getAge());
    }
}
