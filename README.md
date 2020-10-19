# PolyNomial Calculator
>Developed by Seyedali Miramirkhani (std Num: 953618043010) in 2016/8/26
>in eclipse IDE

## Functionality
- This program can calculate polynomials by the "+" and "-" and "*" operators

- Only "x" or "X" and "y" or "Y" are permitted and any variable out of these two variable is not accepted.
	>for example:  
	>"25(z^2)(y^21)" IS NOT ACCEPTABLE because "z" is not defined.


- This program is NOT sensitive to parentheses "(" and ")" however it will work with parentheses too.
	>for example:  
	>		22x^2y^23 - 4 + 15x^32y^8 + 15xy - xy^2  
	>		is equal to :  
	>		22(x^2)(y^23) - 4 +15(x^32)(y^8) + 15(x)(y) - (x)(y^2)  
	>		and for sure you can use the both of them.

- This program can automatically detect the number "1" and you can ignore to write it in input
	>for example:  
	>		xy^2 is equal to 1xy^2

- To get the simplest answer, it does not print 1 in the output.

- There is no limitation on the number for the power or the factor.
	>	for example:  
	>			232(x^24)(y^95) is accepted.

- It can also work with zero powers and lonely factors like (x^0) and +25


- In each line you are allowed to enter polynomial like this:  
	>" 2(x^2)(y^4) +15 - 35(x) -(y^2) "  
	>or operators like "+ and - and * " and

- **REMEMBER that operator should be in SINGLE character and** 
	- "+ "
	- " +"
	- " + "  
**Are wrong inputs and, "+" is the right way.**

- After you finished entering your input, you can enter "#" to end the program and see the result.

-You can run the program on the `Mainproccess` class which contain the `MAIN` method.

## Here is a simple example of working with the program:
```
	**Polynomial calculation program**
	24(x^2)(y^5) -25 +2(x^12) -4xy
	-
	5xy + 20x^2y^2 -5 + 3x^0 +y
	*
	4x^2y - 5
	#
	The answer is: 
	 + 96(x^4)(y^6) - 120(x^2)(y^5) - 92(x^2)(y) + 115 + 8(x^14)(y) - 10(x^12) - 36(x^3)(y^2) + 45(x)(y) - 80(x^4)(y^3) + 96(x^2)(y^2) + 5(y)
```
