package com.ccyt.io;

import java.io.IOException;

/**
 * ������ȡ�������ֽڶ�ȡЧ��
 * @author liweihai
 *
 */
public class IOUtilTest1 {

	public static void main(String[] args) {
		try {
			IOUtil.printHex("E:\\workspace\\Demo\\ccyt5.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long start = System.currentTimeMillis();
//		try {
//			IOUtil.printHexByByteArray("E:\\workspace\\Demo\\1.mp3");
//			//IOUtil.printHex("E:\\workspace\\Demo\\1.mp3");
//			System.out.println();
//			long end = System.currentTimeMillis();
//			System.out.println(end - start);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
