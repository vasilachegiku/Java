public class SelectiveIteration{
	public static void main(String[] args) {
		int num = 1500;
		
	for ( int i=0 ; i<1; i++){
		for (int j=0; j<num; j++){
			while(j!=num/3 & j!=(num+5)/7 ){
				continue;
			}
			System.out.println(j);
		}
	}

  }
}
