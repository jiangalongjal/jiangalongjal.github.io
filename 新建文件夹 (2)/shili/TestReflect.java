package com.shili;

public class TestReflect {
	public static void main(String[] arge) throws Exception{
//		TestReflect testReflect = new TestReflect();
//		System.out.println(testReflect.getClass().getName());
		Class<?> class1 = null;
		Class<?> class2 = null;
		Class<?> class3 = null;
		class1 = Class.forName("com.shili.TestReflect");
		class2 = new TestReflect().getClass();
		class3 = TestReflect.class;
		System.out.println("������  "+class1.getName());
		System.out.println("������  "+class2.getName());
		System.out.println("������  "+class3.getName());
	}
	
}
