package thread.sync.test;

/**
 * 문제3 - final 필드
 * 다음에서 value 필드(멤버 변수)는 공유 되는 값이다.
 * 멀티스레드 상황에서 문제가 될 수 있을까?
 */
public class Immutable {
    private final int value;

    public Immutable(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
