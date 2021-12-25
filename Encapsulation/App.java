package Encapsulation;

class People{
    public int a=1;
    protected int b=2;
    private int c=3;

    public void hahaha(){
        System.out.println(this.a);
        System.out.println(this.b);
        System.out.println(this.c);
    }

}

class Tim extends People{
    public void lalala(){
        System.out.println(this.a);
        System.out.println(this.b);
        
    }
}
public class App {

    public static void main(String... args) throws Exception {
        People Owen = new People(); 
        Tim Tim = new Tim();
        Owen.hahaha();
        Tim.lalala();
        
    }

}