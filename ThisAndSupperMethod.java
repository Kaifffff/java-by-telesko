 //every class extends Object class by default if you dont mension or mention 
 class A extends Object{

    public A(){
        //every constructor has super method by default 
        super();
        System.out.println("In a");
    }
    public A(int n){
        super();
        System.out.println("in a int");
    }
 }
 
 class B extends A{
    public B(){
        super();
        System.out.println("in b");
    }
    public B(int n){
        //this() will execute the constructor of same class 
        this();
        // super(n);
        System.out.println("in b int");
    }
 }
 
 
 class ThisAndSupperMethod {
    public static void main(String []args){
        B obj = new B(3);
    }
}
