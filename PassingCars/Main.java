public class Main {
	public static int solution(int[] A) {
		int sumPrefix[] = new int[A.length + 1];
		for(int i=0;i<A.length;i++) {
			sumPrefix[i+1] = sumPrefix[i] + A[i];
		}
		int sum=0;
		for(int i=0;i<A.length;i++) {
			if(sum>1000000000) {
				return -1;
			}
			if(A[i]==0){
				sum += sumPrefix[A.length] - sumPrefix[i];
			}
		}
		return sum;
    }
}
