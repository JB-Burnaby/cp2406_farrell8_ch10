import java.util.*;
public class DemoPoems {

    public static void main(String[] args) {

        Poem poem = new Poem("efjdsf", 42);
        Couplet couplet = new Couplet("qwerty");
        Limerick limerick = new Limerick("uiop");
        Haiku haiku = new Haiku("asdfg");

        display(poem);
        display(couplet);
        display(limerick);
        display(haiku);
    }



    public static void display(Poem p) {
        System.out.println("Poem:" + p.getTitle() + " Lines: " + p.getLines());

    }
}
