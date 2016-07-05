import java.util.*;

class Steve {

}

class Bill {

}

class Linus {

}

interface God {}

class WhoIsYourGod {
    public static void main(String[] args) {

        List<God> gods = new ArrayList();
        addGod(gods);

        for (God god : gods) {
            System.out.println("Thank you");
        }

    }
    public static void addGod(List gods) {
        gods.add(new Linus());
    }

}

/** Q: What is the output of the following code ?

[A] : The code does not compile
[B] : The code would compile if lines 20-30 where removed
[C] : A ClassCastException is raised at runtime
[D] : 2 classes should implement God
[E] : 3 classes should implement God

*/
