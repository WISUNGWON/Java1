package classpart;

public class OrderTest {

	public static void main(String[] args) {
		
		Order order1 = new Order();
		
		order1.OrderNumber = 201907210001L;
		order1.ID = "anb123";
		order1.Date = "2019�� 7�� 21��";
		order1.Name = "ȫ���";
		order1.OrderID = "PD0345-12";
		order1.Address = "����� �������� ���ǵ��� 20����";
		
		order1.showInfo();
	}

}
