import java.util.*;

public class VowelOrConsonant{
	
	public static void main (String[] args){
		System.out.println("Exercise 2.4.1: Program to Check Vowel or Consonant");
		System.out.print("Enter an alphabet: ");
		Scanner input = new Scanner(System.in);
		boolean isVowel=false;;
		char letter=input.next().charAt(0); 
		switch(letter)
		{
		    case 'a' :
		    case 'e' :
			case 'i' :
		    case 'o' :
		    case 'u' :
		    case 'A' :
		    case 'E' :
		    case 'I' :
		    case 'O' :
		    case 'U' : 
				isVowel = true;
		}
		if(isVowel == true) {
			System.out.println(letter+" is  a Vowel.");
		}
		else {
			if((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z'))
				System.out.println(letter+" is a Consonant.");
		    else
				System.out.println("Entered character is not an alphabet.");		
		}
	}
	
}