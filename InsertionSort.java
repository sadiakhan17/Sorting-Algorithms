
public class InsertionSort {
	
	/**The method for sorting the numbers */
	public static void insertionSort(int[] list) {
		long startTime=System.currentTimeMillis();
		
		int comp=0;
		int swap=0;
		
		for (int i = 1; i < list.length; i++) {
			/** Insert list[i] into a sorted sublist list[0..i-1] so that 
			 * 	list[0..i] is sorted
			 */
		
			int currentElement = list[i];
			int k;
			for (k = i-1; k>= 0 && list[k] > currentElement; k--) {
				list[k+1] = list[k];
				swap++;
				comp++;
			}
			
			//insert the current element into list[k + 1]
			list[k + 1] = currentElement;
			comp++;
	
		}
		
		long endTime=System.currentTimeMillis();
		System.out.println("Time (ms): " + (endTime - startTime));
		
		System.out.println("Number of Movements: " + swap);
		System.out.println("Number of Comparisons: " + comp);
	}
}
