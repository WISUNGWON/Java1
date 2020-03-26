package hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
    
    private HashMap<Integer, Member> hashMap;
    
    public MemberHashMap() {
        hashMap = new HashMap<Integer, Member>();
    }
    
    public void addMember(Member member) {
        hashMap.put(member.getMemberId(), member);
    }
    
    public boolean removeMember(int memberId) {
        //cotansKey() : 해당 키가 hashMap에 존재하는지 확인
        if (hashMap.containsKey(memberId)) {
            hashMap.remove(memberId);
            return true;
        }
        else {
            System.out.println("회원 번호가 없습니다.");
            return false;
        }
    }
    
    public void showAllmember() {
        
        //모든 key 객체를 set 타입으로 반환해줌
        Iterator<Integer> ir = hashMap.keySet().iterator();
        while (ir.hasNext()) {
            int key = ir.next();
            Member member = hashMap.get(key);
            System.out.println(member);
        }
        System.out.println();
        
        //.values().iterator() value는 중복된 값이 있을 수 있기 때문에, collection 타입으로 반환해줌
    }

}
