
class A{

    public A(){
        System.out.println("object created");
    }

    public void show(){
        System.out.println("in the show ");
    }

}

public class AnonymousObject {
    public static void main(String[] args) {
        new A().show(); // anonymous object // created new object
        new A().show();
    }
}
