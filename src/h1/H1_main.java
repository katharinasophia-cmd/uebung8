package h1;

public class H1_main {
	public static void main(String[] args) {
		
		Bruch objekt1 = new Bruch (18,21);
		Bruch b = new Bruch (6,7);
		
		objekt1.shorten();
		objekt1.hasSameValueAs(b);
	}

}
