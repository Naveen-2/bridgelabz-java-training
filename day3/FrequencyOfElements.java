
public class FrequencyOfElements{
	
	public static void main (String[] args){
		System.out.println("Exercise 3.2: Program to find the frequency of each element in the array");
		int[] array = new int[] {1, 2, 3, 4, 5, 3, 8, 8, 2, 2, 2, 9, 0, 7 };  
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
		for(int i = 0; i < frequency.length; i++){  
            if(frequency[i] != -1)  
                System.out.println("Element " + array[i] + " appeared " + frequency[i] + " times.");  
        }  
	}
	
}