package kr.co.basicspring.di4;

import javax.swing.JOptionPane;

import kr.co.basicspring.di3.IHello;

public class MessegeKo4 implements IHello{
	public MessegeKo4() {
		System.out.println("MessegeKo4() ��ü ����");
	}
	@Override
	public void sayHello(String name) {
		JOptionPane.showMessageDialog(null, "�ȳ��ϼ���~"+name);
	}//sayHello end
}//MessegeKo3 end
