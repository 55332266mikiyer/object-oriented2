package sample.Package2;

import sample.Electrical;
import sample.PC;
import sample.TV2;

public class Polymorphism3 {
    public static void main(String[] args) {
        TV2 tv = new TV2();

        PC pc = new PC();

        use(tv);
        use(pc); 

    }
    public static void use(Electrical eleItem) {
        eleItem.power();
    }

}
