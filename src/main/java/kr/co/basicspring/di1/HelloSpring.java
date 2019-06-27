package kr.co.basicspring.di1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloSpring {
	
	public static void main(String[] args) {
		//��ü(object�� �����ϴ� ���
		// 1-> POJO��� : NEW ������
		// 2-> �ڹٺ� : <jsp:useBean id="" class=""/>
		// 3-> �������� : XML�� �̿��� ��������(DI) ����
//		----------------------------------------------
		
		// ������ ���� �̿��ؼ� ��ü ����
		//1) �������� ���� XML ��������
		Resource resource = new ClassPathResource("spring.xml");
		//2) ���丮�� 
		// -�ܺο��� �ۼ��� ���������� �����ͼ�
		// -���� ������ ��ü�� ������ �ش�
		BeanFactory factory = new XmlBeanFactory(resource);
		//3) ������ ��ü ��������
		Object objK = factory.getBean("msgKo");
		MessageKo korean = (MessageKo)objK;
		korean.sayHello("�����");
		

		Object objE = factory.getBean("msgKo");
		MessageKo english = (MessageKo)objE;
		english.sayHello("Tom");
	}//main end
	


}//class end
