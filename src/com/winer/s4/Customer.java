package com.winer.s4;

public class Customer {
	int don;
	int point;

	public void buy(Product product) {
		// 가진 돈에서 물건 값 뺴고 가진 포인트에서 물건의 포인트 더해야함
		if (don >= product.price) {
			don -= product.price;
			point += product.price;
			System.out.println("구매완료" + product.getClass().getSimpleName() + "-" + product.brand);
			System.out.println("남은 돈" + don + "포인트" + point);

		} else {
			System.out.println("돈이 부족합니다" + product.price + "현재 금액" + don);
		}

	}

}
