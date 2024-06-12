package com.winer.s4.io;

import java.io.File;

public class FileMain2 {

	public static void main(String[] args) {
		// study2 폴더 삭제하려고함
		// 먼저 파일 지우고 폴더삭제하기
		File folder = new File("C:\\study2");
		if (folder.exists() && folder.isDirectory()) {
			for (File file : folder.listFiles()) {
				file.delete();
			}

			if (folder.delete()) {
				System.out.println("폴더 삭제 성공");
			} else {
				System.out.println("폴더 삭제 실패");
			}

		} else {
			System.out.println("폴더가 없거나 디렉토리가아닙니다");
		}
	}
}