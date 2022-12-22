import java.util.*;
import java.io.*;
import java.util.Random;

public class Test {
		static int size;
		static int [] array;
	
	public static void main (String[] args){
		
		//define scanner
		Scanner in =new Scanner(System.in);
		
		//Print out menu for type of data
		int choice1;
		do{
			System.out.println("1. InOrder \n" + "2. ReverseOrder \n" + "3. AlmostOrder \n" + "4. Random Order");
			choice1=in.nextInt();
			System.out.println();
			
		}while(choice1<=0 || choice1>4);
		
		
		//Print out menu for size of data
		int choice2;
		do{
			System.out.println("1. 5000 \n" + "2. 15000 \n" + "3. 50000");
			choice2=in.nextInt();
			System.out.println();
			
		}while(choice2<=0 || choice2>3);
		
		
		//Print out menu for type of sort
		int choice3;
		do{
			System.out.println("1. Insertion Sort \n" + "2. Selection Sort \n" + "3. Quick Sort \n" + "4. Merge Sort \n" + "5. Heap Sort \n" + "6. Radix Sort");
			choice3=in.nextInt();
			System.out.println();
			
		}while(choice3<=0 || choice3>6);
		
		
		//assign size of array based on user choice
		if(choice2==1){
			size=5000;
			System.out.println("Input Size: " + size);
		}
		if(choice2==2){
			size=15000;
			System.out.println("Input Size: " + size);
		}
		if(choice2==3){
			size=50000;
			System.out.println("Input Size: " + size);
		}
		
		
		//generate the appriopriate data based on user input
		//inorder options
		if (choice1==1){
			array=inOrder(size);
			System.out.println("Data Type: In Order");
		}
		
		//reverse order options
		if (choice1==2){
			array=reverseOrder(size);
			System.out.println("Data Type: Reverse Order");
		}
		
		//partial order options
		if (choice1==3){
			array=partialOrder(size);
			System.out.println("Data Type: Almost Order");
		}
		
		//random order options
		if (choice1==4){
			array=randomOrder(size);
			System.out.println("Data Type: Random Order");
		}
		
		
		//doing sorting based on user selection of algorithm
		if(choice3==1){
			System.out.println("Sort: Insertion Sort");
			InsertionSort.insertionSort(array);
		}
		
		if(choice3==2){
			System.out.println("Sort: Selection Sort");
			SelectionSort.selectionSort(array);
		}
		
		
		if(choice3==3){
			System.out.println("Sort: Quick Sort");
			QuickSort.quickSort(array);
		}
		
		
		if(choice3==4){
			System.out.println("Sort: Merge Sort");
			MergeSort.printMergeSort(array);
			
		}
		//gotta convert for this
		if(choice3==5){
			System.out.println("Sort: Heap Sort");
	 	   Integer[] newArray = new Integer[array.length];
		
	 		for (int i = 0; i < array.length; i++) {
	 			newArray[i] = Integer.valueOf(array[i]);
	 		}
	 		HeapSort.heapSort(newArray);
		}
		
		if(choice3==6){
			System.out.println("Sort: Radix Sort");
			int n = array.length;
			RadixSort.radixsort(array, n);
		
		}


		
		
	}
	
	//Data Generation
	//In order
	static int[] inOrder(int size){
		int[] arr= new int[size];
		for (int i=0;i<size;i++) {
			arr[i] = i;
		}
		
		return arr;
	}
	
	//reverse order
	static int[] reverseOrder(int size){
		int[] arr= new int[size];
		for (int i=0;i<size;i++) {
			arr[i] = size-i;
		}
		
		return arr;
	}
	
	//Partial Order
	static int[] partialOrder(int size){
		int[] arr= new int[size];
		//gonna order 70% of array only
		int more=(int)(0.7*size);
		for (int i=0;i<more;i++) {
			arr[i] = i;
		}
		
		Random rand = new Random();
		//randomize 30% of array only
		for (int i=more;i<size;i++) {
			arr[i] = rand.nextInt(size);
		}
		
		
		return arr;
	}
	
	//Random order
	static int[] randomOrder(int size){
		int[] arr= new int[size];
		Random rand = new Random();
		
		//randomize
		for (int i=0;i<size;i++) {
			arr[i] = rand.nextInt(size);
		}
		
		
		return arr;
	}
		
		
		
		
}//class