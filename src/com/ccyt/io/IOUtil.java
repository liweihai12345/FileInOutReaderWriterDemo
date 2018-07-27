package com.ccyt.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOUtil {

	/**
	 *  ��ȡָ���ļ����ݣ�����16�������������̨
	 *  ����ÿ���10��byte����
	 * @param fileName
	 * @throws IOException
	 * ���ֽڶ�ȡ���ʺϴ��ļ������ļ�Ч�ʺܵ�
	 */
	public static void printHex(String fileName) throws IOException{
		// ���ļ���Ϊ�ֽ������ж�����
		FileInputStream in=new FileInputStream(fileName);
		int b;
		int i=1;
		while((b=in.read())!=-1){
			if(b <= 0xf){
				// ��λ��ǰ�油0
				System.out.print("0");
			}
			System.out.print(Integer.toHexString(b)+"  ");
			if(i++%10==0){
				System.out.println();
			}
		}
		in.close();
		
	}

	/**
	 * ������ȡ���Դ��ļ�����Ч�ʸߣ�Ҳ������õĶ��ļ��ķ�ʽ
	 * @param filename
	 * @throws IOException
	 */
	public static void printHexByByteArray(String filename) throws IOException{
		FileInputStream input=new FileInputStream(filename);
		byte [] buf= new byte[1024*1024];
		/*
		 *�� i��������ȡ�ֽڣ��ŵ�buf��������ֽ��С�
		 *��0��λ�ÿ�ʼ�ţ�����buf.length��
		 *���ص��Ƕ������ֽڵĸ��� 
		 */
		
//		int bytes=input.read(buf,0,buf.length);
//		int j=1;
//		for (int i = 0; i < bytes; i++) {
//			System.out.print(Integer.toHexString(buf[i] & 0xff)+" ");
//			if(j++%10==0){
//				System.out.println();
//			}
//		}
		int bytes=0;
		int j=1;
		while((bytes=input.read(buf,0,buf.length))!=-1){
			for (int i = 0; i < bytes; i++) {
				System.out.print(Integer.toHexString(buf[i] & 0xff)+"  ");
				if(j++%10==0){
					System.out.println();
				}
			}
		}
		input.close();
	}
	
	/**
	 *  �ļ��������ֽ�������ȡ
	 *  @param srcFile
	 *  @param destFile
	 *  @param IOException
	 * @throws IOException 
	 */
	
	public static void copyFile(File srcFile,File destFile) throws IOException{
		
		if(!srcFile.exists()){
			throw new IllegalArgumentException("�ļ���"+srcFile+"������");
		}
		FileInputStream in=new FileInputStream(srcFile);
		FileOutputStream out= new FileOutputStream(destFile);
		byte[] buf = new byte[8*1024];
		int b;
		while((b=in.read(buf, 0, buf.length))!=-1){
			out.write(buf, 0, b);
			out.flush(); //��ü���
		}
		in.close();
		out.close();
	}
	/**
	 *  �����ļ��Ŀ��������ô�������ֽ���
	 *  @param srcFile
	 *  @param destFile
	 *  @param IOException
	 * @throws IOException 
	 */
	public static void copyFileByBuffer(File srcFile,File destFile) throws IOException{
		if(!srcFile.exists()){
			throw new IllegalArgumentException("�ļ�"+srcFile+"������");
		}
		if(!srcFile.isFile()){
			throw new IllegalArgumentException(srcFile+"�����ļ�");
		}
		BufferedInputStream bis =new BufferedInputStream(new FileInputStream(srcFile));
		
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(destFile));
		byte[] buf = new byte[8*1024];
		int c;
		while ((c = bis.read(buf, 0, buf.length))!=-1) {
			bos.write(c);
			bos.flush();
		}
		bis.close();
		bos.close();
			
	}
	/**
	 * ���ֽڣ�������������ļ����� ����5M
	 * @param srcFile
	 * @param destFile
	 * @param IOException
	 * @throws IOException 
	 */
	public static void copyFileByByte(File srcFile,File destFile) throws IOException{
		
		if(!srcFile.exists()){
			throw new IllegalArgumentException("�ļ�"+srcFile+"������");
		}
		if(!srcFile.isFile()){
			throw new IllegalArgumentException(srcFile+"�����ļ�");
		}
		
		FileInputStream in =new FileInputStream(srcFile);
		FileOutputStream out =new FileOutputStream(destFile);
		int c;
		while((c= in.read())!=-1){
			out.write(c);
			out.flush();
		}
		in.close();
		out.close();
		
	}
}
