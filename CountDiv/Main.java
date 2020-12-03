public class Main {
	
	public static int solution(int A, int B, int K) {
		int totalToB = B/K;
		int totalToA = A/K;
		int res = totalToB - totalToA;
		res += A%K==0 ? 1 : 0;
		return res;
		
	}
}  
