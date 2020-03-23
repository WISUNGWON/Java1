package lambda;

@FunctionalInterface //메서드를 1개만 선언하도록 에너테이션 지정
public interface MyMaxNumber {
    int getMaxNumber(int x, int y); //1)구현할 메서드 선언
    // 함수형 인터페이스에는 메서드를 2개 이상선언할 수 없음.
    /* 익명 함수를 사용하는 함수형 인터페이스의 특성상
     * 매개변수의 숫자가 같은 경우, 어떤 함수를 처리해야 할 지 모르는 상황이 있기 때문에
     * @FunctionalInterface를 사용하여 메서드를 1개만 선언하도록함.
     */

}
