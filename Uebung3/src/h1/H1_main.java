package h1;

public class H1_main 
{
	// Attribute
	static double guthaben = -100;
	static double monEingang = 200;

	static int rating = -2;

	static boolean warnhinweis = false;
	static boolean negativ = true;

	public static void main(String[] args)
	{
		if (guthaben < 0) {
			negativ = true;
		} else {
			negativ = false;
		}
		
		
		if (guthaben > 0) {
			rating += 3;
		}
		
		if (guthaben == 0) {
			rating += 2;
		}
		
		if ((guthaben < 0) && (Math.abs(monEingang) >= Math.abs(guthaben))) {
			rating += 1;
		}
		
		if ((guthaben < 0) && (Math.abs(monEingang) < Math.abs(guthaben))) {
			rating -= 1;
		}
		
		if ((guthaben < 0) && (Math.abs(monEingang) < Math.abs(guthaben)) && (rating < 0)) { 
			warnhinweis = true;
		} else {
			warnhinweis = false;
		}
		
		System.out.println("rating: " + rating);
		System.out.println("warnhinweis: " + warnhinweis);
		System.out.println("negativ: " + negativ);
	}
}
	
	

