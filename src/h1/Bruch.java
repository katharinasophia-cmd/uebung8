package h1;

public class Bruch {
	
	//Attribute:
	
	int zaehler;
	int nenner;

	//Konstruktor:
	
	public Bruch (int zaehler, int nenner) {
		
		this.zaehler = zaehler;
		this.nenner = nenner;
	
	}
	
	//Methoden:
	
	private int ggT (int x, int y) {
		
		x = Math.abs(x);
		y = Math.abs(y);
		
		if (x<y) {
			int temp_x = x;
			x = y;
			y = temp_x;
		}
		
		int r = 1;
		
		do {
			r = x % y;
			
			x = y;
			y = r;
		}
		
		while (r>0);
		
		return x;
	}
	
	public void shorten () {
		
		int temp_zaehler = zaehler;
		
		zaehler = zaehler / ggT(zaehler,nenner);
		nenner = nenner / ggT(temp_zaehler,nenner);
		
		System.out.println (zaehler + "/" + nenner);
	}
	
	public boolean hasSameValueAs (Bruch b) {
		
		b.shorten();
		
		if (b.zaehler == zaehler && b.nenner == nenner) {
			System.out.println("true");
			return true;
		}
		else {
			System.out.println("false");
		    return false;
		}
	}	

}
