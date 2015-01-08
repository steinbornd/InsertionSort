package insertionSort;

public class InsertionSort {
	public static void main(String[] args){
		int[] array = {3, 14, 7, 45, 12, 19, 6};
		printArray(array);
		long start = System.currentTimeMillis();
		insertionSort(array);
		long end = System.currentTimeMillis() - start;
		System.out.println();
		printArray(array);
		System.out.println();
		System.out.println(end);
	}
	
	public static void insertionSort(int[] data){
		for(int i = 1; i < data.length; i++){
			int key = data[i];
			int j = i-1;
			while(j>=0 && key < data[j]){
				data[j+1] = data[j];
				j--;
			}
			data[j+1] = key;
		}
	}
	
	public static void printArray(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
}
