public class Main {

	 public static int solution(int X, int[] A) {
		 int[] leaves = new int[X+1];
		 for(int i = 0; i<leaves.length;i++) {
			 leaves[i] = -1;
		 }
		 int jumpCounter = X;
		 for(int i=0;i<A.length;i++) {
			 if(jumpCounter == 0) {
				 return i;
			 }
			if(A[i] <= X) {
				if( leaves[A[i]] == -1 ) {
					jumpCounter--;
					if(jumpCounter==0) {
						return i;
					}
					leaves[ A[i] ] = A[i];
				}
			}
		 }
		 return -1;
	 }

}
