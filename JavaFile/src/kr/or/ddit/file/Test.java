package kr.or.ddit.file;

import java.io.FileOutputStream;

public class Test {

	public static void main(String[] args) {
		// 스캐너로 입력받은 텍스트를 파일로 저장히시오.
		// 파일명 java.txt
		String str = ScanUtil.nextline("텍스트 입력");
				
		FileOutputStream fos = new FileOutputStream("java.txt");
				
		for(byte bte : str.getBytes()) {
			fos.write(bte);
		}
			fos.close();
		
	}
}
