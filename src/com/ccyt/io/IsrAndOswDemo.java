package com.ccyt.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IsrAndOswDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream in =new FileInputStream("E:\\workspace\\Demo\\ccyt1.txt");
		InputStreamReader isr =new InputStreamReader(in,"utf-8");//Ĭ����Ŀ���룬������ʱ��Ҫд�ļ�����ı����ʽ
		FileOutputStream out =new FileOutputStream("E:\\workspace\\Demo\\ccytutf81.txt");
		OutputStreamWriter osw =new OutputStreamWriter(out,"utf-8");
//		int c;
//		while((c=isr.read())!=-1){
//			System.out.print((char)c);
//		}
		char [] buffer =new char[8*1024];
		int c;
		/*
		 * ������ȡ������buffer����ַ����飬�ӵ�0��λ�ÿ�ʼ���ã�����buffer.length�����ص��Ƕ������ַ��ĸ���
		 */
		while((c= isr.read(buffer,0,buffer.length))!=-1){
			String s =new String(buffer,0,c);
			System.out.print(s);
			osw.write(buffer,0,c);
			osw.flush();
		}
		isr.close();
		osw.close();
		
	}
}
