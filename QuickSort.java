public class QuickSort {
	static int swap=0;
	static int comp=0;
	
	public static void quickSort(int[] list) {
		long startTime=System.currentTimeMillis();
		quickSort(list, 0, list.length-1);
		long endTime=System.currentTimeMillis();
		System.out.println("Time (ms): " + (endTime - startTime));
		System.out.println("Number of Movements: " + swap);
		System.out.println("Number of Comparisons: " + comp);
		
	}
	
	public static void quickSort(int[] list, int first, int last) {
		if (last > first) {
			int pivotIndex = partition(list, first, last);
			quickSort(list, first, pivotIndex -1);
			quickSort(list, pivotIndex + 1, last);
		}
	}
	
	/** Partition the array list[first..last] */
	public static int partition(int[] list, int first, int last) {
		int pivot = list[first]; // Choose the first element as the pivot
		int low = first + 1; // Index for forward search
		int high = last; //Index for backward search
		
		while (high > low) {
			// Search forward from left
			while (low <= high && list[low] <= pivot){
				low++;
				comp++;
			}
			
			// Search backward from right
			while (low <= high && list[high] > pivot){
				high--;
				comp++;
			}
			
			//	Swap two elements in the list
			if (high > low) {
				int temp = list[high];
				list[high] = list[low];
				list[low] = temp;
				swap++;
			}
			comp++;
		}
		
		while (high > first && list[high] >= pivot){
			high--;
			comp++;
		}
		
		//	Swap pivot with list[high]
		if (pivot > list[high]) {
			comp++;
			swap++;
			list[first] = list[high];
			list[high] = pivot;
			return high;
		}
		else {
			return first;
		}
	}
	
	
	
}
