public class SelectiveIteration{
	public static void main(String[] args) {
		int num = 1500;
		
	for ( int i=0 ; i<1; i++){
		for (int j=0; j<1500; j++){
			while(num!=num/3 & num!=(num+5)/7 ){
				continue;
			}
			System.out.println(j);
		}
	}

  }
}