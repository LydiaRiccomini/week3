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
		
	}
	
	
	
	public static void main(String[] aarg) {
		step1();  
		
	}
	
	
}
