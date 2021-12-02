package sorting;

public class selSort {



	public void selectionSort(int arr[] ) {
		int size = arr.length;
		
		
		for (int i = 0; i < size - 1; i++) {
			int minIndex = i;
			
			for (int j = i + 1; j < size; j++) {
				
				if (arr[minIndex] >  arr[j] ) {
					
					minIndex = j;
				}
				printArr(arr);
			}
			
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		
	}
	
	
 public void printArr(int arr[]) {
	 
	 int size = arr.length;
	 for(int i = 0; i < size; i++) {
		 
		 System.out.print(arr[i] + " ");
	 }
	 
	 
 }
	
	
	public static void main() {
		
		selSort numbers = new selSort();
		int arr2[] = {12,35,2,67,100};
		
		numbers.selectionSort(arr2);
		numbers.printArr(arr2);
	}
	

}



