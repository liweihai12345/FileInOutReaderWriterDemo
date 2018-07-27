package com.ccyt.io;

import java.io.IOException;
import java.io.Serializable;

public class Student implements Serializable{
	private String stuname;
	private String stuno;
	private transient int stuage;
	
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getStuno() {
		return stuno;
	}
	public void setStuno(String stuno) {
		this.stuno = stuno;
	}
	public int getStuage() {
		return stuage;
	}
	public void setStuage(int stuage) {
		this.stuage = stuage;
	}
	public Student(String stuname, String stuno, int stuage) {
		super();
		this.stuname = stuname;
		this.stuno = stuno;
		this.stuage = stuage;
	}
	@Override
	public String toString() {
		return "Student [stuname=" + stuname + ", stuno=" + stuno + ", stuage="
				+ stuage + "]";
	}

	private void writeObject(java.io.ObjectOutputStream out) throws IOException{
		out.defaultWriteObject();
		out.writeInt(stuage);
	}
	private void readObject(java.io.ObjectInputStream input) throws IOException, ClassNotFoundException{
		input.defaultReadObject();
		this.stuage = input.readInt();
		
	}
	

}
