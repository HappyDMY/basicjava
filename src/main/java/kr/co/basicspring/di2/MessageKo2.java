package kr.co.basicspring.di2;

import javax.swing.JOptionPane;

public class MessageKo2 {
	public MessageKo2() {
		System.out.println("MessageKo2() ��ü ����");
	}// messsageKo ������
	public void sayHello(String name) {
		JOptionPane.showMessageDialog(null, "�ȳ��ϼ��� '"+name+"' ��");
	}
}// class end
