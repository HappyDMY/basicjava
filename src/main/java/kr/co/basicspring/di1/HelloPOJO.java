package kr.co.basicspring.di1;

public class HelloPOJO {

	public static void main(String[] args) {
		// POJO(Plain Old Java Object) ���� �ڹ��ڵ� ���
		// 1) ��ü ���� : new������
		MessageKo korea = new MessageKo();
		korea.sayHello("������");
		
		MessageEn english = new MessageEn();
		english.sayHello("Tom");
		
	}// main end
}//class end
