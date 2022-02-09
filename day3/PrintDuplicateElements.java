
public class PrintDuplicateElements{
	
	public static void main (String[] args){
		System.out.println("Exercise 3.8: Program to print the duplicate elements of an array");
		int[] array = new int[] {1, 2, 14, -543, 3, 4, 5, 3, -20, 8, 8, 2, 2, -543, 2, 9, 0, 7 };  		
        int[] frequency = new int[array.length];
        for (int i = 0; i < array.length; i++) {  
            int count = 1;  
            for(int j = i+1; j < array.length; j++){  
                if(array[i] == array[j]){  
                    count++;  
                    frequency[j] = -1;  
                }  
            }  
            if(frequency[i] != -1)  
                frequency[i] = count;  
        }  
		System.out.print("Duplicate elements in the array are:");
		for(int i = 0; i < frequency.length; i++){  
            if(frequency[i] != -1)  
				if(frequency[i] > 1){
					System.out.print(" " + array[i]);  
				}              
        }  
	}
	
}