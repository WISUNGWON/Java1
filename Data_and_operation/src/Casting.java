//������ Ÿ���� ��ȯ
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1;
		System.out.println(b); // 1.0 : int���� 1�� �ڵ����� double�� converting ��
		
	//	int c = 1.1; can't convert from double to int 
		double d = 1.1;
		int e = (int) 1.1; //double�� 1.1�� ������(���������) int�� �ٲ� 
		System.out.println(e);
		
		// int to String
		String f = Integer.toString(1);
		System.out.println(f.getClass());
		
	}

}

/*
 * �ս��� �Ͼ ��� ��������� ������ Ÿ���� ��ȯ�ؾ� �Ѵ�.
 * ex) double���� 1.1�� int ���� 1�� �ٲ� ��� 0.1�� �ս��� �Ͼ�� 
 * ���α׷��� 0.1�� �ս��� ���� ���� �ڵ������� ������ ���� ��ȯ��Ű�� �ʰ� ������ �߻���Ų��
 * �̷� ��� ������ Ÿ���� �����ϱ� ���ؼ��� ��������� �ٲپ�� �Ѵ�.
 */


/*
 * Casting�̶�?
 * ������ Ÿ���� �̸� �����ϴ� Java�� ��� ������ ������Ÿ���� ��ȯ(convert)�� ���
 * ���� ������ Ÿ�����κ��� �ٲٷ��� ������ Ÿ������ ����(casting)�̶�� �Ѵ�.
 * Casting�� �ϱ� ���ؼ��� ���ͳݿ� �˻��ϸ� �������� ������ Ÿ���� ��ȯ��Ű�� �ڷ����
 * �����Ƿ� �������� 
 */
*/