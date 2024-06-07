package com.winer.s2.util.collections.ex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ProductService {

	private StringBuffer sb;
	private Scanner sc;

	public ProductService() {
		sb = new StringBuffer();
		sb.append("50000,아이폰,50,");
		sb.append("45000,갤럭시,100,");
		sb.append("30000,노키아,20");
		sc = new Scanner(System.in);
	}

	// init 메서드 만들고 위에 애들을 분리해서 분리는 StringTokenizer사용 productdto에 맞는 값을 넣어줘야함
	// arraylist에 만들어서 리턴

	public ArrayList<ProductDTO> init() {
		ArrayList<ProductDTO> ar = new ArrayList<ProductDTO>();
		String datas = sb.toString();

		StringTokenizer st = new StringTokenizer(datas, ",");
		while (st.hasMoreTokens()) {
			ProductDTO productDTO = new ProductDTO();
			productDTO.setPrice(Integer.parseInt(st.nextToken().trim()));
			productDTO.setName(st.nextToken().trim());
			productDTO.setStock(Integer.parseInt(st.nextToken().trim()));
			ar.add(productDTO);
		}

		return ar;

	}

	public void addProduct(ArrayList<ProductDTO> ar) {

		ProductDTO newproduct = new ProductDTO();
		System.out.println("상품명 입력");
		newproduct.setName(sc.next());
		System.out.println("가격 입력");
		newproduct.setPrice(sc.nextInt());
		System.out.println("재고 입력");
		newproduct.setStock(sc.nextInt());
		ar.add(newproduct);
	}

	public int removeProduct(ArrayList<ProductDTO> ar) {
		System.out.println("삭제할 상품명 입력");
		String name = sc.next();
		int result = 0;
		for (int i = 0; i < ar.size(); i++) {
			if (name.equals(ar.get(i).getName())) {
				ar.remove(i);
				result = 1;
				break;
			}
		}
		return result;

	}

	// 기존 주소를 이용해서 삭제하려고하는데 물건의 이름을 입력받아서 일치하는 것을 삭제하려고함
}
