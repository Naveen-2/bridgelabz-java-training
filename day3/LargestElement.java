
public class LargestElement{
	
	public static void main (String[] args){
		System.out.println("Exercise 3.3: Program to print the largest element in an array");
		int[] array = new int[] {1, 2, 14, 3, 4, 5, 3, 8, 8, 2, 2, 2, 9, 0, 7 };  		
        int max = array[0];  
        for (int i = 0; i < array.length; i++) {  
            if(array[i] > max)  
				max = array[i];  
        }
		System.out.println("Largest element in this array is " + max);		
	}
	
}