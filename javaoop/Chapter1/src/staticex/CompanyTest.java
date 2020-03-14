package staticex;

import java.util.Calendar;

//유일한 인스턴스를 만드는 싱글톤 패턴.
public class CompanyTest {

    public static void main(String[] args) {
        
        Company company = Company.getInstance();
        
        Company company2 = Company.getInstance();
        
        System.out.println(company);
        System.out.println(company2); // company와 company2는 동일한 address를 지니고 있음.
        
        // 대표적인 싱글톤 패턴의 예로, Calendar 객체가 있다.
        Calendar calendar = Calendar.getInstance();

    }

}
