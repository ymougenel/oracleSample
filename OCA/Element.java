public class Element {
	Element fear; //Element the beats us
	String type;

	public Element(String type) {
		this.type = type;
	}

	public void setRival(Element rival) {
		this.fear = rival;
	}

	protected void finalize() {
		if (!type.equals("el"))
			System.out.println(type+" has been collected");
	}

	public static void main(String[] args) {
		Element rock = new Element("rock");
		Element paper = new Element("paper");
		Element scissor = new Element("scissor");

		rock.setRival(paper);
		paper.setRival(scissor);
		scissor.setRival(rock);

		// System.gc runs
		// Code
	}
}

/** Q: What is the output of the following code ? (1 good Answer)

[A] : finalize is not called because it is protected
[B] : The code does not compile because finalize method
[C] : The Elements are collected line 27.
[D] : The Elements can not be collected line 27 due too cycle referencing
[E] : Spock beats lizard

*/
