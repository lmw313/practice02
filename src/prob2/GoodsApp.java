package prob2;

import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		final int COUNT_GOODS = 3;
		Goods[][] arrayGoods = new Goods[COUNT_GOODS][COUNT_GOODS];

		for (int i = 0; i < COUNT_GOODS; i++) {
				String info = scanner.nextLine();
				String[] infos = info.split(" ");
				System.out.println(infos[0] + "(가격:" + infos[1] + "원)이 " + infos[2] + "개 입고 되었습니다.");
		}
		

	}

}
