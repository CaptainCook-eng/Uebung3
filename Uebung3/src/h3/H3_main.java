package h3;

public class H3_main {

	static int max = 5;
	static int fix = 2;
	static int wartend = 2; 
	static boolean istVoll = true;
	
	public static void main(String[] args) {
		
		// solange wartend und fix äquivalent sind, ist die Negation von entweder wartend = 0 oder fix = 0 (wenn man davon ausgeht, dass wartend, fix >= 0)
		
		while ((wartend > 0) == (fix < max)) {
			wartend--;
			fix++;
		}
		if (fix == max) {
			istVoll = true;
		} else {
			istVoll = false;
		}
		System.out.println("fix: " + fix);
		System.out.println("wartend: " + wartend);
		System.out.println("istVoll: " + istVoll);
		
	}
 


}
