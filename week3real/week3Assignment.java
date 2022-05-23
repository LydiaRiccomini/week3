package week3real;

import java.util.Arrays;
import java.util.Scanner;

public class week3Assignment {
//question 1
	static void step1(){
		int[] ages = {
				3,9,23,64,2,8,28,93
		};
		
		System.out.println(ages[ages.length -1] - ages[0]);
		
		int[] newAges = {
				3,9,23,64,2,8,28,93,42
		};
		
		
		System.out.println(newAges[newAges.length - 1] - newAges[0]);
		
		int i;
		int totalAge = 0;
		
		for(i = 0; i < ages.length; i++) {
			totalAge += ages[i];
		}
		
		System.out.println(totalAge / ages.length);
		
	}
//question 2
	static void step2() {
		String[] names = {
				"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"
		};
		
		
			for (String name : names) {
				System.out.println(name.length());
			}
/*
* Question 3	How do you access the last element of any array?
* String first = names[0];
* System.out.println(last);			
* 
* Question 4	How do you access the first element of any array?
* String last = names[names.length - 1];
* System.out.println(first);    
*     
*/
			
			
//Question 5:
			
			
			int[] namesLengths = new int[names.length];
				for(int  i = 0; i < names.length; i++) {
					namesLengths[i] = names[i].length();
				}
				System.out.println(Arrays.toString(namesLengths));
				
				int sum = 0;
				for (int i = 0; i < namesLengths.length; i++) {
					sum = sum + namesLengths[i];
				}
				System.out.println(sum);
			
			}
//Question 6
	static void step3() {
		String word = "Hello";
		int amount = 3;
		
		for (int i = 0; i < amount; i++) {
			System.out.print(word);
		}
		}
	
	
// Question 7 + 8


	static void step4() {
		String firstName = "Lydia";
		String lastName = "Riccomini";
		String fullName = firstName + " " + lastName;
		System.out.println(" "); // stops full name from printing on same line as "hellohellohello"
		System.out.println(fullName);
	
		
	}
	
//question 9
	
	static void step5() {
		int hundredMore[] = {
				24,4,18,31,56,78
		};
		int sum = 0;
		for (int i = 0; i < hundredMore.length; i++) {
			sum = sum + hundredMore[i];
		}
		if (sum < 100) {
			System.out.println(false);
		}
		else{
			System.out.println(true);
		}
	}
	
	
//Question 10 + 11	
	
	static void step6() {
		double array1[] = {
				23.3,45,1.1,8,19
		};
		double total = 0;
		for (int i = 0; i < array1.length; i++) {
			total = total + array1[i];
		}
		double average = total / array1.length;
		System.out.println(average);
		double array2[] = {
			73, 84, 2, 9, 15, 63
		};
		for (int i = 0; i < array2.length; i++) {
			total = total + array2[i];
		}
		double average2 = total / array2.length;
		if(average < average2) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
	
	
//Question 12	
	
	static void step7() {
		boolean isHotOutside = true;
		double moneyInPocket = 12.25;
		
		if (isHotOutside = true && moneyInPocket > 10.50) {
			boolean willBuyDrink = true;
			System.out.println(willBuyDrink);
		}
		else {
			boolean willBuyDrink = false;
			System.out.println(willBuyDrink);
		}
	}
	
//Question 13	
	
	static void step8() {
/* decide whether to go outside! if the temp is below or = to 65, don't go outside
 * if the temp is over 65, feel free!
 */
		int temp = 84;
		if(temp <= 65) {
			System.out.println("Don't go outside");
		}
		else{
			System.out.println("Go outside!");
		}
		
		
	}
	
	
	
	public static void main(String[] aarg) {
		step1();  
		step2();
		step3();
		step4();
		step5();
		step6();
		step7();
		step8();
	}
	
	
}
