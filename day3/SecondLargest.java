
public class SecondLargest{
	
	public static void main (String[] args){
		System.out.println("Exercise 3.10: Program to find 2nd Largest Number in an Array");
		int[] array = new int[] {1, 2, 14, 3, 4, 5, 3, -20, 8, 8, 2, 2, -543, 2, 9, 0, 7 };  		
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
		System.out.print("Second Largest Element in this array is: " + array[array.length - 2]);
	}
}