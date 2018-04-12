import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class PartitionTest {

	@Test
	void testPartition() {
		LinkedList list = new LinkedList<Integer>();
		list.add(1);
		list.add(8);
		list.add(3);
		list.add(6);
		list.add(2);
		
		int e = 5;
		int count = 0;			//the number of number that is less than 5
		
		for(int i = 0; i < list.size(); i++) {
			if((int)list.get(i) < 5) {
				count++;
			}	
		}
		
		//check whether number less than e is in the Array's first e index 
		for(int j = 0; j < count; j++) {
			assertTrue((int)Partition.partition(list, e).get(j) < e);	
		}
		
		//check whether number greater than 5 is in the Array's last (Array.length - e) index
		for(int k = 0; k < list.size() - count; k++) {
			assertTrue((int)Partition.partition(list, e).get(list.size() - 1 - k) > e);
		}
	}
}
