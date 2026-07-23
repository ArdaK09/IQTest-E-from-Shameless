import java.util.Scanner;

public class RetardTest{
	
	private static boolean yesNo(String input){
		if (input == null) throw new IllegalArgumentException();

		String lower = input.toLowerCase();
		boolean answer;

		if(lower.equals("y") || lower.equals("yes")){
			answer = true;
		}
		else if(lower.equals("n") || lower.equals("no")){
			answer = false;	
		}
		else{
			throw new IllegalArgumentException();
		}

		return answer;
	}
	
	public static boolean getAnswer(Scanner scanner){
		while(true){
			String input = scanner.nextLine();
			try{
				return yesNo(input);
			} catch(IllegalArgumentException e){
				System.out.print("It's a yes/no question dummy. Maybe you don't need to keep going. But yeah, try again: ");	
			}
		}
	}

	public static void main(String[] args) {
		int yes_count = 0;

		Scanner scanner = new Scanner(System.in);

		// Question 1
		System.out.print("1. Have you ever burnt yourself playing with matches? ");
		if (getAnswer(scanner)) yes_count++;

		// Question 2
		System.out.print("2. Do all your clothes have food stains? ");
		if (getAnswer(scanner)) yes_count++;

		// Question 3
		System.out.print("3. Do you ever smack yourself in the face for no reason? ");
		if (getAnswer(scanner)) yes_count++;

		// Question 4
		System.out.print("4. Have your ever electrocuted yourself? ");
		if (getAnswer(scanner)) yes_count++;

		// Question 5
		System.out.print("5. Are you having trouble reading these questions? ");
		if (getAnswer(scanner)) yes_count++;

		// Question 6
		System.out.print("6. Were your parents on drugs when you were conceived? ");
		if (getAnswer(scanner)) yes_count++;

		// Question 7
		System.out.print("7. Have you ever failed art, gym, or a music class? ");
		if (getAnswer(scanner)) yes_count++;

		// Question 8
		System.out.print("8. Were you dropped on your head as a child? ");
		if (getAnswer(scanner)) yes_count++;

		// Question 9
		System.out.print("9. Have you ever crashed a car? ");
		if (getAnswer(scanner)) yes_count++;

		// Question 10
		System.out.print("10. Have you ever made friends with an inanimate object like a lamp or a chair? ");
		if (getAnswer(scanner)) yes_count++;

		int rate = (int) (100 * ((float) yes_count / 10));

		if (rate < 60) {
			System.out.println("Congrats! You're only " + rate + "% retarded.");
		} else {
			System.out.println("SORRY! You're " + rate + "% RETARDED.");
		}
	}
}
