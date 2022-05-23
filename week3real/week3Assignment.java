package week3real;

public class week3Assignment {

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
	
	static void step2() {
		String[] names = {
				"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"
		};
			for (String name : names) {
				System.out.println(name.length());
				
			}
	}
	
	/*
	 * 3.	How do you access the last element of any array?
	 *     
	 *     
	 *     
	 */
	
	public static void main(String[] aarg) {
		step1();  
		step2();
		
	}
	
	
}
