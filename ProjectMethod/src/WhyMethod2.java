//�� �޼��忡 �Ű�����(parameter)�� �ʿ��ұ�?

public class WhyMethod2 {

	public static void printTwoTimesA() {
		
		  System.out.println("_");
		  System.out.println("A");
		  System.out.println("A");
		
	}
	
	//2-1) �Ű������� �����Ͽ� ���ڰ��� �޴� �޼���
	public static void printTwoTimes(String text) {
		
		  System.out.println("_");
		  System.out.println(text);
		  System.out.println(text);
	}
	
	//3-1) �Ű������� 2���� �޼ҵ�                            //�Ű����� parameter
	public static void printTwoTimes1(String text, String delimiter) {
		
		  System.out.println(delimiter);
		  System.out.println(text);
		  System.out.println(text);
	}
	
	
	public static void main(String[] args) {
		
		printTwoTimesA();
		/*1)�� �ڵ��� �ƽ������� B�� ����ϰ� ���� �� �ؿ�ó��,
		 public static void printTwoTimesB() {
		
		  System.out.println("_");
		  System.out.println("B");
		  System.out.println("B");
		  
		 ���� �޼�Ʈ�� �ϳ� �� ����� ��� �Ѵٴ� ���̰� C�� ����ϰ� ���� ���� ...Z�� ����ϰ� ���� ���� ���������̴�.
		 */
					//����, argument (�޼��� �ȿ� ������ ��ü���� ��) 
		printTwoTimes("B");
		printTwoTimes("C");
		/*
		 * 2) �̷��� �Է� ���� �����ϴ� �޼ҵ�(2-1)�� ������ �ָ�, ���� �޼ҵ带 ���� �ʿ� ����
		 * �޼��忡 ���ڰ��� �־��־�  ���ϴ� ���� ���� �� �ִ�
		 */
		
		//3) �Ű������� 2���� �޼ҵ嵵 ���갡��
		printTwoTimes1("D", "-");
   }

}
