//inner class without declared static 

class P{
    public void show(){
        System.out.println("In show");
    }

    class Q{

        public void conflig(){
            System.out.println("in conflig");
        }
    }
}

// static inner class 

//we can not make C class as static it gives error
// class C{

//     public void show(){
//         System.out.println("In show");

//     } 

//     static class D{

//         public void conflig(){
//             System.out.println("in conflig");
//         }
//     }
// }


public class InnerClass {
    public static void main(String[] args) {
        P obj = new P();
        obj.show();

        P.Q obj1 = obj.new Q();   
        // we have created object of B. B class inside of A
        // class So that we first access object of A then with referance of A object we have created object of B 

        obj1.conflig();

        //if inner class is static then

        // C obj2 = new C();
        // obj2.show();

        //if inner class is static we dont need to get refrance of object of class C
        // C.D obj3 = new C.D();
        // obj3.conflig();
    }
}
