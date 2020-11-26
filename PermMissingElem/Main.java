public class Main {
	
	public static int solution(int[] A) {
		int sum = 0;
		int elements = 0;
		for(int i = 0; i<A.length; i++){
			elements += A[i];
			sum += (i+1);
		}
		sum += A.length + 1;
		return sum - elements ;
    }
}
