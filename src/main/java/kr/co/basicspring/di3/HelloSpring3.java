package kr.co.basicspring.di3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import kr.co.basicspring.di2.MessageEn2;
import kr.co.basicspring.di2.MessageKo2;

public class HelloSpring3 {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("spring2.xml"); //1) �������� ���� XML ��������
		BeanFactory factory = new XmlBeanFactory(resource); // 2)���������� ������ ���� ������ ��ü�� ������ �ش�
		//3) ������ ��ü ��������
		IHello hello = null;
		hello = (IHello)factory.getBean("msgKo");
		hello.sayHello("����");
		
		hello = (IHello)factory.getBean("msgEn");
		hello.sayHello("Infinity");

	}// main end
}//class end
