import java.util.LinkedList;

public class Partition{
	public static LinkedList<Integer> partition(LinkedList<Integer> list, int E){
		LinkedList temp = new LinkedList<Integer>();
		temp = (LinkedList<String>) list.clone();
		
		int p = 0;
		int 	q = 1;
		for(int i = 0; i < list.size(); i++)
			if(list.get(i) < E) {
				temp.set(p, list.get(i));
				p++;
			}else {
				temp.set(temp.size() - q, list.get(i));
				q++;
			}
		return temp;
	}
}