package prob5;

public class Sub {

	int result;

	public void setValue(int a, int b) {
		this.result = a - b;
	}

	public int calculate() {
		System.out.println(">> " + result);
		return result;
	}

}
