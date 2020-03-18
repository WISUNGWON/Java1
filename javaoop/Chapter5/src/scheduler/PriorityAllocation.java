package scheduler;

public class PriorityAllocation implements Scheduler {
    
    public void getNextCall() {
        System.out.println("고객등급이 높은 고객의 call을 먼저 가져옵니다.");
    }
    
    public void sendCallToAgent() {
        System.out.println("업무 숙력도가 높은 상담원에게 먼저 배분합니다.");
    }

}
