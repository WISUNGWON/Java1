package treemap;

public class MemberTreeMapTest {

    public static void main(String[] args) {
        
        MemberTreeMap manager = new MemberTreeMap();
        
        Member memberLee = new Member(100, "Lee");
        Member memberKim = new Member(200, "Kim");
        Member memberPark2 = new Member(400, "Parks");
        Member memberPark = new Member(300, "Park");
 
        manager.addMember(memberPark2);
        manager.addMember(memberLee);
        manager.addMember(memberKim);
        manager.addMember(memberPark);
        //member의 key값이 integer이기 때문에 정렬이 잘 돼있다.
        //즉, interger안에 comparable이 구현되어 있다.
   
        
        manager.showAllmember();
        
        manager.removeMember(200);
        manager.showAllmember();

    }

}
