public class UsingTernaryOperator{
	public static void main(String[] args) {
		int num = 1560000;

		String message = num<=0 ? "Small" 
						: num>=1000000 ? "Large" : " ";
		System.out.println(message);
		
	}
}