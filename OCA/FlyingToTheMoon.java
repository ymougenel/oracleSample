public class FlyingToTheMoon {

	public static void fly(int... args) {
		fly1(args,args);
	}

	// Would this compile if fly and fly1 had the same name?
	public static void fly1(int[] args1, int... args2) {
		System.out.println( (args1.length == args2.length)^true );
	}

	public static void main(String[] args) {
		fly(new int[3]);
		// Would this compile with an Integer array?
		// fly(new Integer[3]);
	}

}

/** Q: What is the output of the following code ?

[A] : The code does not copile with line 15 not commented
[B] : The code does copile with line 15 not commented
[C] : true is printed
[D] : false is printed
[F] : The code does not compile as it is

*/
