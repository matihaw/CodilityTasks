public class Main {
	public int solution(int[] A) {
		int sum = 0;
		for(int i: A) {
			sum += i;
		}
		int firstArraySum = 0;
		int diff = Integer.MAX_VALUE;
		int rest;
		for(int P = 1; P < A.length; P++) {
			firstArraySum += A[P-1];
			rest = sum - firstArraySum;
			if(diff > (Math.abs(rest - firstArraySum))) {
				diff = Math.abs(rest - firstArraySum);
			}
		}
		return diff;
	}

}
