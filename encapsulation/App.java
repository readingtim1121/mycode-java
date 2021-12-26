package encapsulation;

import encapsulation.people.People;

class Tim extends People {
    public void lalala() {
        System.out.println(this.a);
        System.out.println(this.b);

    }
}

public class App {

    public static void main(String... args) throws Exception {
        Tim tim = new Tim();

        tim.lalala();

    }

}