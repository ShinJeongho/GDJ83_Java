package com.winer.s4.io.ex1;

import java.util.List;

public class Ex1Main {

	public static void main(String[] args) {
		ReadStudy rs = new ReadStudy();
		try {
			List<MenuDTO> menuList = rs.read();
			for (MenuDTO menu : menuList) {
				System.out.println("Main Menu :" + menu.getMenuname());
				System.out.println("PRICE :" + menu.getPrice());
				System.out.println("KCAL :" + menu.getKcal());
				System.out.println("=================");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
