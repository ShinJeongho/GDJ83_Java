package com.winer.s2.util.collections.ex;

import java.util.ArrayList;

public class ProductMain {

	public static void main(String[] args) {
		ProductService productService = new ProductService();// 서비스쓰려면 객체생성
		ArrayList<ProductDTO> ar = productService.init();// 서비스의 init 메서드호출해서 제품리스트 가져옴
		// productService.addProduct(ar);
		int result = productService.removeProduct(ar);

		if (result > 0) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}
//		for (int i = 0; i < ar.size(); i++) { // 검색하면 기존상품에 새로추가한 상품도 나오게
//			System.out.println(ar.get(i).getPrice());
//			System.out.println(ar.get(i).getName());
//			System.out.println(ar.get(i).getStock());
//		}

	}
}