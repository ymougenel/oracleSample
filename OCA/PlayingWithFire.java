class PlayingWithFire {

    public static void throwFireBall() throws Fireball {
        throw new Fireball();
    }

    public static void transferFireBall() {
        throwFireBall();
    }

    public static void main(String[] args) {
        try {
            throwFireBall();
        } catch (Fireball e) {
            System.out.print("Fireball received");
        }

        System.out.println("... Everything is under control");
    }
}

class Fireball extends Error {}

/** Q: What is the output of the following code ?

    [A] : The code doesn't compile
    [B] : The code compiles if main doesn't catch the Fireball (no try/catch aroud the call)
    [C] : The code compiles if transferFireBall throws a Fireball Exception
    [D] : Fireball reveived... Everything is under control
    [F] : Error seems to follow the RuntimeException rules

    */
