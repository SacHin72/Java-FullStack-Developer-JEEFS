package com.cpg.lab5.Exercise2;

public class FibonacciSeries {

	int  usingRecursion(int number)
	{
	    if (number == 0) 
	        return 0;
	    else if(number==1 || number==2)
	    	return 1;
	    return usingRecursion(number-1) + usingRecursion(number-2);
	}


}
