public class Main{
	public static void main(String[] args) {
		int x = -1;
		boolean xResult1 = x<100 && x++ >=0;
		boolean xResult2 = x<100 & x++ >0;

		
		System.out.println("Primul rezultat=" + xResult1);
		System.out.println("Al doilea rezultat=" + xResult2);
	}
}