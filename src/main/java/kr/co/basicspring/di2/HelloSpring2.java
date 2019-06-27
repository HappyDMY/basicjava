package kr.co.basicspring.di2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloSpring2 {
	
	public static void main(String[] args) {
		//��ü(object�� �����ϴ� ���
		// 1-> POJO��� : NEW ������
		// 2-> �ڹٺ� : <jsp:useBean id="" class=""/>
		// 3-> �������� : XML�� �̿��� ��������(DI) ����
//		----------------------------------------------		
		// ������ ���� �̿��ؼ� ��ü ����
		
		Resource resource = new ClassPathResource("spring.xml"); //1) �������� ���� XML ��������
		BeanFactory factory = new XmlBeanFactory(resource); // 2)���������� ������ ���� ������ ��ü�� ������ �ش�
		//3) ������ ��ü ��������
		MessageKo2 korean = (MessageKo2)factory.getBean("msgKo");
		korean.sayHello("����");

		MessageEn2 english = (MessageEn2)factory.getBean("msgEn"); 
		english.sayHello("Jack");
	}//main end
	


}//class end
