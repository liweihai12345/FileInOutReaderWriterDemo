package com.ccyt.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * ���л����뷴���л�
 * �����л���ʵ�������ʵ�����л��ӿ� ���� java.io.NotSerializableException ���л��쳣
 * �������л��� �����෴���л������ø��๹�죬��֮����
 * @author liweihai
 *
 */
public class ObjectSeriaDemo2 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//		ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("E:\\workspace\\Demo\\obj1.dat"));
//		Foo2 foo2 =new Foo2();
//		oos.writeObject(foo2);
//		oos.flush();
//		oos.close();
		// �������л��� �����෴���л������ø��๹��
		// �����л��Ƿ��ǵݹ���ø���Ĺ��캯��
//		ObjectInputStream ois= new ObjectInputStream(new FileInputStream("E:\\workspace\\Demo\\obj1.dat"));
//		
//		Foo2 foo2=(Foo2)ois.readObject();
//		System.out.println(foo2);
//		ois.close();
		
//		ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("E:\\workspace\\Demo\\obj1.dat"));
//		Bar2 bar2 =new Bar2();
//		oos.writeObject(bar2);
//		oos.flush();
//		oos.close();
		ObjectInputStream ois =new ObjectInputStream(new FileInputStream("E:\\workspace\\Demo\\obj1.dat"));
		Bar2 bar2 =(Bar2)ois.readObject();
		System.out.println(bar2);
		ois.close();
		
		/*
		 * �����������з����л�����ʱ��
		 * ����丸��û��ʵ�����л��ӿ�
		 * ��ô�丸��Ĺ��캯���ᱻ����
		 */
		
		
		
	}

}
class Foo implements Serializable{
	public Foo(){
		System.out.println("Foo...");
	}
}
class Foo1 extends Foo{
	public Foo1(){
		System.out.println("foo1...");
	}
}
class Foo2 extends Foo1{
	public Foo2(){
		System.out.println("foo2...");
	}
}
class Bar{
	public Bar(){
		System.out.println("bar");
	}
}
class Bar1 extends Bar{
	public Bar1(){
		System.out.println("bar1..");
	}
}
class Bar2 extends Bar1 implements Serializable{
	public Bar2(){
		System.out.println("bar2...");
	}
}
