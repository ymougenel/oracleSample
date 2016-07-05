public class ManyMains {

	public static void main(String[] args) {
	((Toto) null).main(new String[2]);

	}

}

class Toto {
	public static void main(String[] args) {
		System.out.println(args.length);
	}

}

/** Q: What is the output of the following code ? (1 good Answer)

[A] : NullPointerException is thrown at runtime
[B] : The code does not compile because of line 3
[C] : 2 is printed
[D] : The code does not compile because there are 2 main methods
[E] : Class names show a lack of imagination

*/
