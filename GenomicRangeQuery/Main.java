
public class Main {
	public static  int[] solution(String S, int[] P, int[] Q) {
		final char[] DNA = S.toCharArray();
		int prefixA[] = new int[S.length()+1];
        int prefixC[] = new int[S.length()+1];
        int prefixG[] = new int[S.length()+1];
        int prefixT[] = new int[S.length()+1];
 
        for(int i=0;i<DNA.length;i++) {
        	switch(DNA[i]) {
        		case 'A':
        			prefixA[i+1] = prefixA[i] + 1;
        			break;
        		case 'C':
        			prefixC[i+1] = prefixC[i] + 1;
        			break;
        		case 'G':
        			prefixG[i+1] = prefixG[i] + 1;
        		case 'T':
        			prefixT[i+1] = prefixT[i] + 1;
        		
        	}
        }
        int sumOfPrefA = 0;
    	int sumOfPrefC = 0;
    	int sumOfPrefG = 0;
    	int res[] = new int[P.length];
        for(int i=0;i<P.length;i++) {
        	sumOfPrefA = prefixA[Q[i] + 1] - prefixA[P[i]];
        	sumOfPrefC = prefixC[Q[i] + 1] - prefixC[P[i]];
        	sumOfPrefG = prefixG[Q[i] + 1] - prefixG[P[i]];
        	if(sumOfPrefA>0) {
        		res[i] = 1;
        		continue;
        	}else if(sumOfPrefC > 0) {
        		res[i] = 2;
        		continue;
        	}else if(sumOfPrefG > 0) {
        		res[i] = 3;
        		continue;
        	}else {
        		res[i] = 4;
        	}
        }
		
		return res;
		
	}
}
