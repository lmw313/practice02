package prob2;

import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		final int COUNT_GOODS = 3;
		Goods[] arrayGoods = new Goods[COUNT_GOODS];
		
		

		for (int i = 0; i < COUNT_GOODS; i++) {
			Goods goods = new Goods();
			String info = scanner.nextLine();
			String[] infos = info.split(" ");
			
		    goods.setName(infos[0]);
		    goods.setPrice(infos[1]);
		    goods.setCountStock(infos[2]);
		    arrayGoods[i] = goods;
		}
		
		for(Goods a : arrayGoods){
			System.out.println(a.getName() + "(가격:" + a.getPrice() + "원)이 " + a.getCountStock() + "개 입고 되었습니다.");
		}
		

	}

}
