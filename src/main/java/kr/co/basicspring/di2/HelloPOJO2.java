package kr.co.basicspring.di2;

public class HelloPOJO2 {

	public static void main(String[] args) {
		// POJO(Plain Old Java Object) ���� �ڹ��ڵ� ���
		// 1) ��ü ���� : new������
		MessageKo2 korean = new MessageKo2();
		korean.sayHello("�迬��");
		
		MessageEn2 english = new MessageEn2();
		english.sayHello("Jhone");
		
	}// main end
}//class end
