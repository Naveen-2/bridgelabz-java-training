public class GenericInterfaces{
	
	public static void main (String[] args){
		
		System.out.println("Exercise 5.3: Program that demonstrates the Generic Interfaces");
		                  
        Integer intArray[] = { 2,4,98,12,-23 };
        Character charArray[] = { 'N', 'a', 'V', 'e', 'E', 'n'};
		
        MinClassImpl<Integer> intMinValue = new MinClassImpl<Integer>(intArray);
        MinClassImpl<Character> charMinValue = new MinClassImpl<Character>(charArray);
		
        System.out.println("Minimum value in Integer Array: " + intMinValue.minValue());
        System.out.println("Minimum value in Character Array: " + charMinValue.minValue());
	}	
}

interface MinInterface<M extends Comparable<M>>{
     M minValue();
}
 
class MinClassImpl<M extends Comparable<M>> implements MinInterface<M> {
     M[] array;
     MinClassImpl(M[] o) {
         array = o;
     }
 
     public M minValue() {
         M v = array[0];
 
         for (int i = 1; i <array.length; i++) {
             if (array[i].compareTo(v) < 0) {
                  v = array[i];
             }
         }
          return v;
     }
}
