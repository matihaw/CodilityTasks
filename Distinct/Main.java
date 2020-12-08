
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static int solution(int[] A) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i: A) {
			a.add(i);
		}
		Collections.sort(a);
		int res = 0;
		if(a.size()>0) {
			res++;
			int cumrrnt = a.get(0);
			for(int i:a) {
				if(i!=cumrrnt) {
					cumrrnt = i;
					res++;
				}
			}
		}
		return res;
    }
}
