
class A{
    public void show(){
        System.out.println("In A Show");
    }
}

class B extends A{
    public void show(){
        System.out.println("In A Show");
    }
}

class C extends A{
    public void show(){
        System.out.println("In A Show");
    }
}


class DynamicMethodDispatch {
    public static void main(String[] args) {

       //same object which is obj is behaving defferently  with different object 
        //this is polymorphism 
        A obj = new A();
        obj.show();   //In A Show

        obj = new B();
        obj.show();  //In B Show

        obj = new C();
        obj.show();  //In C Show
    }    
}
