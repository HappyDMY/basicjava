package kr.co.basicspring.di3;

public class HelloPOJO3 {

	public static void main(String[] args) {
		// POJO(Plain Old Java Object) ���� �ڹ��ڵ� ���
		IHello hello = null;

		hello = new MessegeKo3();
		hello.sayHello("������");

		hello = new MessegeEn3();
		hello.sayHello("HAHAHA");
	}// main end
}//class end
