package kr.co.basicspring.di3;

public class MessegeKo3 implements IHello{
	public MessegeKo3() {
		System.out.println("MessegeKo3() ��ü ����");
	}
	@Override
	public void sayHello(String name) {
		System.out.println("�ȳ��ϼ���~"+name);
	}//sayHello end
}//MessegeKo3 end
