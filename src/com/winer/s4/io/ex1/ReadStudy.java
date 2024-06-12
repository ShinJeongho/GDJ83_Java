package com.winer.s4.io.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadStudy {

	public List<MenuDTO> read() throws Exception {
		// info.txt파일 읽어오기
		// 1.항목별로 파싱 후 출력 예)라면,3500,500 제육,9000,850
		// 2.DTO를 메뉴수대로 만든다음에 리턴
		List<MenuDTO> menuList = new ArrayList<MenuDTO>();

		File file = new File("C:\\study", "info.txt");

		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		while (true) {
			String s = br.readLine();
			if (s == null) {
				break;
			}
			String[] items = s.split(",");
			if (items.length == 3) {
				MenuDTO menu = new MenuDTO();
				menu.setMenuname(items[0].trim());
				menu.setPrice(Integer.parseInt(items[1].trim()));
				menu.setKcal(Integer.parseInt(items[2].trim()));
				menuList.add(menu);
			}
		}

		br.close();
		fr.close();

		return menuList;
	}

}
