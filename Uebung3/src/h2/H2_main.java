package h2;

public class H2_main {

	static int jahr = 2025;
	static boolean schalt = true;
		
		
	public static void main(String[] args) {
			
		if (((jahr % 4 == 0) && (!(jahr % 100 == 0)) || (jahr % 400 == 0))) {
			schalt = true;
		} else {
			schalt = false;				
		}
	System.out.println(jahr + "ist ein Schaltjahr: " + schalt);
	}	
	
}
