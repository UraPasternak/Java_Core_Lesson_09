package ua.lviv.lgs.hw9.zavdania2;

public class Methods {
	
	void localException(double a, double b) throws IllegalAccessException, ArithmeticException, MyException {
		if (a<0 && b<0)
			throw new IllegalArgumentException("a<0 and b<0");
		else if (a == 0 && b != 0)
			throw new ArithmeticException("a=0 and b!=0");
		else if (a != 0 && b == 0)
			throw new ArithmeticException("a!=0 and b=0");
		else if (a == 0 && b == 0)
			throw new IllegalAccessException("a=0 and b=0");
		else if (a>0 && b>0)
			throw new MyException("a>0 and b>0");
	}
	
	double plus(double a, double b) throws IllegalAccessException, ArithmeticException, MyException {
		localException(a,b);
		return a + b;
	}

	double minus(double a, double b) throws IllegalAccessException, ArithmeticException, MyException {
		localException(a,b);
		return a - b;
	}

	double mnogenia(double a, double b) throws IllegalAccessException, ArithmeticException, MyException {
		localException(a,b);
		return a * b;
	}

	double dilenia(double a, double b) throws IllegalAccessException, ArithmeticException, MyException {
		localException(a,b);
		return a / b;
	}
}
