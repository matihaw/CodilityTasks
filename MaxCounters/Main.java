public static int[] solution(int N, int[] A) {
		int counters[] = new int[N];
 		int maxValue = 0;
 		int baseValue = 0;
		for(int i=0;i<A.length;i++) {
			if ( 1<=A[i] && A[i]<=N  ) {
				if(counters[A[i]-1] < baseValue) {
					counters[A[i]-1] = baseValue + 1;
				}else
					counters[A[i]-1]++;
				if(maxValue < counters[A[i]-1]) {
					maxValue = counters[A[i]-1];
				}
			}else if(A[i]>N){
				baseValue = maxValue;
			}
		}
		
		for(int i=0;i<counters.length;i++) {
			if(counters[i]<baseValue) {
				counters[i]=baseValue;
			}
		}
		return counters;
    }
