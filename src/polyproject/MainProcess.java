package polyproject;

import java.util.Scanner;

public class MainProcess {
	public static void main(String[] args){
		LinkedArr myList = new LinkedArr();
		int defSign = 1;
		System.out.println("**Polynomial calculation program**");
		Scanner scan = new Scanner(System.in); // to scan polynomial as a string
		while(true){
			String inString = scan.nextLine();
			/*if(inString.isEmpty())
				System.out.println("damn its empty");*/
			if(inString.length() == 1 && (inString.charAt(0) == '+')){
				defSign = 1;
			}
			else if(inString.length() == 1 && (inString.charAt(0) == '-')){
				defSign = -1;
			}
			else if(inString.length() == 1 && (inString.charAt(0) == '*')){
				defSign = 1; 
				String mulString = scan.nextLine();
				while (!(Input.checkInput(mulString))) {
					System.out.println("Sorry, your input is not correct \nPlease try again: ");
					mulString = scan.nextLine();
				}
				LinkedArr mulList = new LinkedArr();
				Input.getInput(mulString, mulList, defSign);
				//mulList.printList();
				myList.multiply(mulList);
			}
			else if(inString.charAt(0) == '#'){
				System.out.println("The answer is: ");
				myList.printList();
				break;
			}
			else if(Input.checkInput(inString)){
				Input.getInput(inString, myList , defSign);
			}
			else{
				System.out.println("Sorry, your input is not correct \nPlease try again: ");
			}
		}
		scan.close();
		
	}

}
