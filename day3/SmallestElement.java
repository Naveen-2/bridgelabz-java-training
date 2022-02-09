
public class SmallestElement{
	
	public static void main (String[] args){
		System.out.println("Exercise 3.4: Program to print the smallest element in an array");
		int[] array = new int[] {1, 2, 14, 3, 4, 5, 3, -20, 8, 8, 2, 2, -543, 2, 9, 0, 7 };  		
        int min = array[0];  
        for (int i = 0; i < array.length; i++) {  
            if(array[i] < min)  
				min = array[i];  
        }
		System.out.println("Smallest element in this array is " + min);		
	}
	
}