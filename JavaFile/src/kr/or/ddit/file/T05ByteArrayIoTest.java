package kr.or.ddit.file;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class T05ByteArrayIoTest {
	public static void main(String[] args) {
		
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
//		outSrc = new byte[inSrc.length];
//		for (int i = 0; i <inSrc.length; i++) {
//			outSrc[i] = inSrc[i];
//		}
//		
		
		//Stream
		ByteArrayInputStream bais = new ByteArrayInputStream(inSrc);
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		int data =0;
		
		while((data=bais.read())!=-1) {
			baos.write(data);
		}
		
		outSrc = baos.toByteArray();
		
		System.out.println(Arrays.toString(inSrc));
		System.out.println(Arrays.toString(outSrc));
		try {
			bais.close();
			baos.close();
		} catch (Exception e) {
			
		}
		
		
		
	}
}
