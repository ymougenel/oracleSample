public class Baloon {
	String color;

	public Baloon(String color) {
		super();
		this.color = color;
	}
	public static void switchReferences(Object o1,Object o2) {
		Object temp = o1;
		o1 = o2;
		o2 = temp;
	}

	public static void main(String[] args) {
		Baloon red = new Baloon("Red");
		Baloon blue = new Baloon("Blue");

		switchReferences(red, blue);

		System.out.println(new StringBuilder("Color: ") + red.color);
	}

}

/** Q: What is the output of the following code ?

[A] : The code does not compile because of line 5
[B] : The code does not compile because of line 20
[C] : "Color: Red" is printed
[D] : "Color: Blue" is printed
[E] : Baloon follows the Encapsulation convention

*/
