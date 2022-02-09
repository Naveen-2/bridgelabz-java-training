
public class PrintEvenPosition{
	
	public static void main (String[] args){
		System.out.println("Exercise 3.5: Program to print the elements of an array present on an even position");
		int[] array = new int[] {1, 2, 14, 3, 4, 5, 3, -20, 8, 8, 2, 2, -543, 2, 9, 0, 7 };  		
        System.out.print("Elements in even position are: ");
        for (int i = 0; i < array.length; ) {  
            System.out.print(array[i] + "  ");
			i += 2;
        }	
	}
	
}