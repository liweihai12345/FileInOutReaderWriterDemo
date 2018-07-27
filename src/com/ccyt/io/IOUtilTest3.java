package com.ccyt.io;

import java.io.File;
import java.io.IOException;
/**
 * 文件复制。批量读取跟缓存读取写入
 * @author liweihai
 *
 */
public class IOUtilTest3 {

	public static void main(String[] args) {
//		long start =System.currentTimeMillis();
//		try {
//			IOUtil.copyFileByByte(new File("E:\\workspace\\Demo\\1.mp3"), new File("E:\\workspace\\Demo\\5.mp3"));
//			long end =System.currentTimeMillis();
//			System.out.println(end -start);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		try {
			long start = System.currentTimeMillis();
			IOUtil.copyFile(new File("E:\\workspace\\Demo\\1.mp3"),new File("E:\\workspace\\Demo\\2.mp3"));
			long end = System.currentTimeMillis();
			System.out.println(end-start);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
