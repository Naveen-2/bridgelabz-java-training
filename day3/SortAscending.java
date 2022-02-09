
public class SortAscending{
	
	public static void main (String[] args){
		System.out.println("Exercise 3.9: Program to sort the elements of an array in ascending order");
		int[] array = new int[] {1, 2, 14, -543, 3, 4, 5, 3, -20, 8, 8, 2, 2, -543, 2, 9, 0, 7 };  		
        System.out.print("Original array:");
		for(int i = 0; i < array.length; i++ ){
			System.out.print("  " + array[i]);
		}
		int temp = 0;
		for(int i = 0; i < array.length; i++){
			for(int j = i+1; j < array.length; j++){
				if(array[i] > array[j]){
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.print("\nSorted array:");
		for(int i = 0; i < array.length; i++ ){
			System.out.print("  " + array[i]);
		}
	}
}