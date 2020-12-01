public class Main {
	
	public static int solution(int[] A){
		int counter[] = new int[A.length+1];
		for(int i=0;i<A.length;i++) {
			if(A[i]>A.length) {
				return 0;
			}
			counter[A[i]]++;
		}
		for(int i=1;i<A.length;i++) {
			if(counter[i]==0 || counter[i]>1) {
				return 0;
			}
		}
		return 1;
    }
    }
