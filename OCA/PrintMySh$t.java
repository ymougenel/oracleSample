public class PrintMySh$t {
	public static void main(String [] args) {
		String helloWorld = " \tHello World  \t";
		for ( double i = 0; i < (( helloWorld.length() >= 16) ? 1f : 011); i++ ) {
			helloWorld.trim();
			System.out.print("... ");
		}

		System.out.print("-"+helloWorld+"-");
	}

}


/** Q: What is the output of the following code ?

[A] : The code doesn't compile
[B] : ... -Hello World-
[C] : ... - 	Hello World  	-
[D] : ... ... - 	Hello World  	-
[E] : The naming convention is bad and souldn't go on versionning control


// Note: As you already know (yet I've been tricked once or twice),
		compiling and running this code via Terminal requires to escape the $ character

*/
