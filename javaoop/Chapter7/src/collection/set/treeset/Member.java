package collection.set.treeset;

import java.util.Comparator;

public class Member implements Comparator<Member> {
    
    private int memberId;
    private String memberName;
    
    public Member() {}
    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }
    public int getMemberId() {
        return memberId;
    }
    
    public String getMemberName() {
        return memberName;
    }
    
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
    
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
    
    
    public String toString() {
        return memberName + "회원님의 아이디는 " + memberId + "입니다.";
    }
    
    //Hash의 특성 적용하기 , memberId를 비교하여 중복허용 X
    //Hashset이 equals와 hashCode를 확인하여 같은 값을 허용하지 않는다(?)
    @Override
    public boolean equals(Object obj) {
        
        if (obj instanceof Member) {
            Member member = (Member)obj;
            return (this.memberId == member.memberId);
        }
        
        return false;
    }
    
    @Override
    public int hashCode() {
        return memberId; //같은 맴버일때 같은 memberId를 반환하면 됨.
    }
    
    
    //첫번째 매개변수가 this, 두 번째 매개변수가 넘어온 member값
    public int compare(Member member1, Member member2) {
        return (member1.memberId - member2.memberId);
    }
    
   /* //this와 넘어온 member의 맴버변수를 비교한다.
    @Override
    public int compareTo(Member member) {
        return (this.memberId - member.memberId); //양수이면 오름차순 정렬
        // return (this.memberId = member.memberId) * (-1); 내림 차순 정렬
//        return this.memberName.compareTo(member.getMemberName()); 문자열 오름차순 정렬
        
    }*/
    
    
    

}
