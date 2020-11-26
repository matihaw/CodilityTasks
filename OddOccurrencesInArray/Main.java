public class Main {
	
	 public static int solution(int[] A) {
		 int B[] = new int[A.length-1];
		 for(int a=0; a<A.length;a++) {
			 for(int i=a+1 ;i<A.length;i++) {
				if(A[a]>=0) { 
					if(A[a]==A[i]) {
						A[a] = -1;
						A[i] = -1;
						break;
					}
				}
				
			 }
		 }
		 for(int c: A) {
			 if(c>=0) {
				 return c;
			 }
		 }
		 return -1;
		 }	
}
