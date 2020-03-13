package classpart;

public class OrderTest {

	public static void main(String[] args) {
		
		Order order1 = new Order();
		
		order1.OrderNumber = 201907210001L;
		order1.ID = "anb123";
		order1.Date = "2019년 7월 21일";
		order1.Name = "홍길순";
		order1.OrderID = "PD0345-12";
		order1.Address = "서울시 영등포구 여의도동 20번지";
		
		order1.showInfo();
	}

}
