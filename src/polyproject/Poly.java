package polyproject;

public class Poly {
	char sign;
	double num;
	int xPow;
	int yPow;
	public Poly(double number,int xPower, int yPower){
		num = number;
		if(num >=0)
			sign = '+';
		else
			sign = '-';
		xPow = xPower;
		yPow = yPower;
		
	}

}
