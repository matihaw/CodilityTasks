public class Main {
	
	  public static int[] solution(int[] A, int K) {
		  if(A.length==K || K==0 || A.length==0) {
			  return A;
		  }
		  if(K<A.length) {
			  int[] toReturn = new int[A.length];
			  for(int i=0;i<A.length;i++) {
				  if( (i+K)<A.length ) {
					  toReturn[i+K] = A[i];
				  }else {
					  int toEnd = A.length - i;
					toReturn[K - toEnd]= A[i];
				  }
			  }
			return toReturn;
		  }
		  int newK = K - A.length;
		  return solution(A, newK);
	    }
