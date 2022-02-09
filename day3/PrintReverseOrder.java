
public class PrintReverseOrder{
	
	public static void main (String[] args){
		System.out.println("Exercise 3.6: Program to print the elements of an array in reverse order");
		int[] array = new int[] {1, 2, 14, 3, 4, 5, 3, -20, 8, 8, 2, 2, -543, 2, 9, 0, 7 };  		
        System.out.print("Elements in reverse order: ");
        for (int i = array.length-1; i >= 0; i--) {  
            System.out.print(array[i] + "  ");
        }	
	}
	
}