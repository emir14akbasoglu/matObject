package matObject;

public class Math {
	public Object extraction;

	public int sum(int n1, int n2) {
		int result;
		result = n1 + n2;
		return result;
	}

	public int sub(int n1, int n2) {
		int result;
		result = n1 - n2;
		return result;
	}

	public int multiply(int n1, int n2) {
		int result;
		result = n1 * n2;
		return result;
	}

	public double divide(double n1, double n2) {
		double result;
		result = n1 / n2;
		return result;
	}

	public double pi;

	public Math() {
		this.pi = 3.14785;
	}

	public double getpi() {
		return pi;

	}

	public double areOfCirle(double r) {
		return this.getpi() * r * r;
	}

	public double volemOfSphere(double r) {
		return this.getpi() * r * r * r * 4 / 3;
	}

	public double areaOfRectangularPrism(double a, double b, double h) {
		double result;
		result = a * b * h;
		return result;
	}

	public double calculatingTheAreaofaRightTriangle(double a, double b, double n1) {
		double result;
		result = a * b / 2;
		return result;
	}

	public double interiorAngleOfManyGenes(double n) {
		double result;
		result = (n - 2) / n * 180;
		return result;

	}

	public int fakctoriyol(int f) {
		int result = 1;
		for (int i = 1; i <= f; i++) {
			result = result * i;
		}
		return result;
	}

	public int sumOfSmallNumbers(int a) {
		int result = 0;
		for (int i = 1; i < a; i++) {
			result = result + i;
		}
		return result;
	}

	public int sumOfBetweenNumber(int a, int b) {
    	    int result=0;
    	     for(int i=a+1;i<b;i++) {
    	    	 result+=i;
    	    }
			return result;
    	  
       }
}
