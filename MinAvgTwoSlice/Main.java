public class Main {
	public static int solution(int[] A) {
		double sliceOf2 = 0d;
		double sliceOf3 = 0d;
 		double minAvg = Double.MAX_VALUE; 
 		int index = 0;
		for(int i=0;i<A.length-2;i++) {
			sliceOf2 = (A[i+1] + A[i]);
			sliceOf3 = sliceOf2 + A[i+2];
			sliceOf2 /=2;
			sliceOf3 /=3;
			if(sliceOf2 < sliceOf3) {
				if(sliceOf2<minAvg) {
					minAvg = sliceOf2;
					index = i;
				}
			}else {
				if(sliceOf3<minAvg) {
					minAvg = sliceOf3;
					index = i;
				}
			}
		}
		int missingAvg2 = (A[A.length-1] + A[A.length-2]) / 2;
		if(missingAvg2 < minAvg) {
			index = A.length-2;
		}
		
		return index;
	}
}
