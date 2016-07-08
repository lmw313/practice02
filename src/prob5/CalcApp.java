package prob5;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print(">> ");
			String input = scanner.nextLine();
			if (input.equals("quit") == true) {
				break;
			}

			String[] tokens = input.split(" ");

			switch (tokens[1]) {
			case "+":
				Add add = new Add();
				add.setValue(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[2]));
				add.calculate();
				break;
				
			case "-":
				Sub sub = new Sub();
				sub.setValue(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[2]));
				sub.calculate();
				break;
				
			case "*":
				Mul mul = new Mul();
				mul.setValue(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[2]));
				mul.calculate();
				break;
				
			case "/":
				Div div = new Div();
				div.setValue(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[2]));
				div.calculate();
				break;	
			}

		}

	}

}
