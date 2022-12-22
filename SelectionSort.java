
public class SelectionSort {
	/** The method for sorting the numbers */
	public static void selectionSort(int[] list) { //int[] list?
		long startTime=System.currentTimeMillis();
		int swap=0;
		int comp=0;
		
		for (int i = 0; i < list.length -1; i++) {
			// Find the minimum in the list[i..list.length-1]
			int currentMin = list[i];
			int currentMinIndex = i;
			
			for (int j = i+1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
				comp++;
			}
			
			//	Swap list[i] wiht list[currentMinIndex[ if necessary
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
				swap++;
			}
		}
		long endTime=System.currentTimeMillis();
		System.out.println("Time (ms): " + (endTime - startTime));
		System.out.println("Number of Movements: " + swap);
		System.out.println("Number of Comparisons: " + comp);
	}
}
