//method overrideing 
//same method name same parameters in defferent class 

class Calcs{
    public int add(int a , int b){
        return a + b;
    }
}

class AdvCalcs extends Calcs{
    //add method overrides the add method of parent class 
    public int add(int a , int b){
        return a + b + 1;
    }
}


class MethodOverriding {
    public static void main(String[] args) {
        AdvCalcs obj = new AdvCalcs();
        int res = obj.add(2, 3);
        System.out.println("addition is :" + res);
    }
}
