import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public int solution(int[] A) {
		List<Integer> list = new ArrayList<Integer>();
		for(int a: A) {
			list.add(a);
		}
		Collections.sort(list);
		int listSize = list.size();
		int resOption1 = list.get(listSize - 1) * list.get(listSize - 2) * list.get(listSize - 3);
		int resOption2 = list.get(0) * list.get(1) * list.get(listSize - 1);
		int res = resOption1 > resOption2 ? resOption1: resOption2;
		return res;
    }
}
