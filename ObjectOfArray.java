class Student{
    int roll;
    String name;
    int age;
}

public class ObjectOfArray {
    public static void main(String []args){
        Student s1 = new Student();
        s1.roll = 1;
        s1.name = "navin";
        s1.age = 22;
        Student s2 = new Student();
        s2.roll = 2;
        s2.name = "kaif";
        s2.age = 21;
        Student s3 = new Student();
        s3.roll = 3;
        s3.name = "reddy";
        s3.age = 23;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        for(int i = 0 ; i < students.length ; i++){
            System.out.println(students[i].name + " :" + students[i].roll);
        }


    }
}
