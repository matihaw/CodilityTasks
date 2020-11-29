public class Main {
	
	 public static int solution(int[] A) {
		 int[] counter = new int[1000000];
		 for(int i = 0; i<A.length; i++) {
			 if(A[i]>0) {
				 counter[A[i]-1]++;
			 }
		 }
		 for(int i = 0; i<counter.length;i++){
			 if(counter[i] == 0) {
				 return ++i;
			 }
		 }
		 return 1;
	}
  }
