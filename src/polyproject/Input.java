package polyproject;
import java.lang.String;
public class Input {
	//method to check input
	public static boolean checkInput(String rawInput){
		char[] operative = new char[rawInput.length()];
		//check the correction of the input
		for (int i = 0 ; i < rawInput.length() ; i++){
			operative[i] = rawInput.charAt(i); // cast string to an char[]
			if( operative[i] != ' ' && operative[i] != '(' &&
				operative[i] != ')' && operative[i] != '^' &&
				operative[i] != '+' && operative[i] != '-' &&
				!(operative[i] == 'x' || operative[i] == 'X')&&
				!(operative[i] == 'y' || operative[i] == 'Y')&&
				!(operative[i] >= '0' && operative[i]<='9')){
				return false; // if the input isn't correct
			}	
		}
		return true;
	}
	// method to get the input
	public static void getInput(String rawInput, LinkedArr myLinkedArr,int genSign){
		char[] operative = new char[rawInput.length()];
		//check the correction of the input
		for (int i = 0 ; i < rawInput.length() ; i++){
			operative[i] = rawInput.charAt(i); // cast string to an char[]	
		}
		/*for (int i = 0 ; i<rawInput.length() ; i++) // testing
			System.out.print(operative[i]);
		*/
		char sign = '+';
		char[] temp = new char[30];
		if(operative[0] == '-')
			temp[0] = '-';
		else
			temp[0] = '+';
		for (int i = 0 , j = 1; i < rawInput.length() ; i++){
			if(operative[i] == '+' || operative[i]== '-'){
				sign = operative[i];
				if(i != 0){
					temp[j] = '$';
					setIn(temp,myLinkedArr,genSign);
					temp = null;
					temp = new char[30];
					temp[0] = sign;
					j = 1;
				}
			}
			else{	
				temp[j] = operative[i];
				j++;
			}
			if( i == rawInput.length()-1){
				temp[j] = '$';
				setIn(temp, myLinkedArr, genSign);
				
			}
		}
	}
		//method to explore and save poly
		public static void setIn(char[] pol, LinkedArr mArr, int finSign){
			int xpower = 0 , ypower = 0;
			int sign;
			int number = 0;
			boolean numCal = false;
			
			if(pol[0] == '+')
				sign = 1;
			else
				sign = -1;
			int i = 1;
			while(pol[i]!= '$'){
				if('0' <= pol[i] && pol[i]<= '9' && pol[i-1] != '^'){
					int charToNum =  Character.getNumericValue(pol[i]);
					number *= 10;
					number += charToNum;
					numCal = true;
				}
				if(pol[i] == 'x' || pol[i] == 'X'){
					if(pol[i+1] == '^' && ('0' <= pol[i+2] && pol[i+2]<= '9')){
						i += 2; int getX =0;
						while(('0' <= pol[i] && pol[i]<= '9')){
							getX = Character.getNumericValue(pol[i]);
							xpower *= 10;
							xpower += getX;
							i++;
						}
						continue;
					}
					else
						xpower = 1;		
				}
				if(pol[i] == 'y' || pol[i] == 'Y'){
					if(pol[i+1] == '^' && ('0' <= pol[i+2] && pol[i+2]<= '9')){
						i += 2; int getY =0;
						while(('0' <= pol[i] && pol[i]<= '9')){
							getY = Character.getNumericValue(pol[i]);
							ypower *= 10;
							ypower += getY;	
							i++;
						}
						continue;
					}
					else
						ypower = 1;
				}
				i++;
			}

			number *= sign * finSign;
			if(numCal == false)
				number = 1 * sign * finSign;
			//testing
			/*System.out.println("for this phrase number: " + number + " xpower is : " 
			+ xpower + " ypower is : " + ypower);
			*/
			Poly temp = new Poly(number, xpower, ypower);
			mArr.checkAdd(temp);
	}
}
