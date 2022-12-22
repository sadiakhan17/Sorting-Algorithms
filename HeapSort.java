
public class HeapSort {
	/** Heap sort method */
	static int swap=0;
	static int comp=0; 
	public static <E extends Comparable<E>> void heapSort(E[] list) {
		long startTime=System.currentTimeMillis();
		//	Create a Heap of integers
		Heap<E> heap = new Heap<>();
		
		//	Add elements to the heap
		for (int i = 0; i < list.length; i++)
			heap.add(list[i]);
		
		//	Remove elements from the heap
		for (int i = list.length -1; i >= 0; i--)
			list[i] = heap.remove();
		
		long endTime=System.currentTimeMillis();
		System.out.println("Time (ms): " + (endTime - startTime));
		
		System.out.println("Number of Movements: " + swap);
		System.out.println("Number of Comparisons: " + comp);
	}
	
	
	
	
 	/**	A test method */
	/*
	public static void main(String[] args) {
		Integer[] list = {-44, -5, -3, 3, 3, 1, -4, 0, 1, 2, 4, 5, 53};
		heapSort(list);
		for(int i = 0; i < list.length; i++)
			System.out.println(list[i] + " ");
	}*/
	
}
