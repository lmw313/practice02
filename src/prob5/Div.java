package prob5;

public class Div {

	double result;

	public void setValue(int a, int b) {
		this.result = a / b;
	}

	public double calculate() {
		System.out.println(">> " + result);
		return result;
	}
}
