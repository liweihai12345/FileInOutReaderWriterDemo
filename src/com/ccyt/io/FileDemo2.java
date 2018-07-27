package com.ccyt.io;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * 实现获取文件夹中文件列表(实现两个Fileter)
 * @author liweihai
 *
 */
public class FileDemo2 {
	public static void main(String[] args) {
		File file = new File("E:\\workspace\\Demo\\");
//		String[] filenames = file.list(new FilenameFilter() {
//
//			@Override
//			public boolean accept(File dir, String name) {
//				//System.out.println(dir + "\\" + name);
//				System.out.println(name.isEmpty());
//				return name.endsWith("java");
//			}
//		});
//		for (String string : filenames) {
//			System.out.println(string);
//		}
		File[] files = file.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {

				System.out.println(dir.isFile()+"=="+dir);
				System.out.println(dir+"\\"+name);
				return false;
			}
		});
//		File[] files=file.listFiles(new FileFilter() {
//			
//			@Override
//			public boolean accept(File pathname) {
//				System.out.println(pathname.getName());
//				return false;
//			}
//		});
	}
}
