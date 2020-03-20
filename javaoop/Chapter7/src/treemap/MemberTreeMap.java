package treemap;

import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {
    
    private TreeMap<Integer, Member> treeMap;
    
    public MemberTreeMap() {
        treeMap = new TreeMap<Integer, Member>();
    }
    
    public void addMember(Member member) {
        treeMap.put(member.getMemberId(), member);
    }
    
    public boolean removeMember(int memberId) {
        //cotansKey() : 해당 키가 hashMap에 존재하는지 확인
        if (treeMap.containsKey(memberId)) {
            treeMap.remove(memberId);
            return true;
        }
        System.out.println("회원 번호가 없습니다.");
        return false;
        
    }
    
    public void showAllmember() {
        
        //모든 key 객체를 set 타입으로 반환해줌
        Iterator<Integer> ir = treeMap.keySet().iterator();
        while (ir.hasNext()) {
            int key = ir.next();
            Member member = treeMap.get(key);
            System.out.println(member);
        }
        System.out.println();
        
        //.values().iterator() value는 중복된 값이 있을 수 있기 때문에, collection 타입으로 반환해줌
    }

}
