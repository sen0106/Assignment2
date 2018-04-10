//Senichiro Umikawa

import static org.junit.Assert.*;

import org.junit.Test;

public class Assignment2 {	
	public static int[] partition(int[] list, int E) { 
		int[] pList = new int[list.length];
		int a = 0;
		int b = 0;
		for(int i = 0; i < list.length; i++) {
			if(list[i] < E) {
				pList[a] = list[i];
				a++;
			}else if(list[i] > E) {
				pList[list.length - 1 - b] = list[i];
				b++;
			}
		}
		return pList;
	}
	
	@Test
	public void testPartition() {
		int[] testList = {1, 4, 8, -2, 7, 6, 9};
		int e = 5;
		
		int count = 0;				//the number of number that is less than 5	
		for(int i = 0; i < testList.length; i++) {
			if(testList[i]<e) {
				count++;
			}
		}
		
		//check whether number less than e is in the Array's first e index 
		for(int j = 0; j < count; j++) {
			assertTrue(partition(testList, e)[j] < e);	
		}
		
		//check whether number greater than 5 is in the Array's last (Array.length - e) index
		for(int k = 0; k < testList.length - count; k++) {
			assertTrue(partition(testList, e)[testList.length - 1 - k] > e);
		}
	}
}
