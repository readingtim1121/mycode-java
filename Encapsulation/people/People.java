package encapsulation.people;

public class People {
    public int a = 1;
    protected int b = 2;
    int d = 4;
    private int c = 3;

    public static void main(String... args) throws Exception {
        People p = new People();

        System.out.println(p.a);
        System.out.println(p.b);
        System.out.println(p.c);
        System.out.println(p.d);
    }

}