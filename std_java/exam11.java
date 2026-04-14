package std_java;
// java 람다식 복습 예문
public class exam11 {
    public static void main(String[] args) {
        Func firstFunc = (num) -> {
            if (num > 2) {
                throw new Exception();
            }
            return num * 2;
        };
        Func secondFunc = (num) -> num + 9;
        System.out.println(perform(firstFunc) + perform(secondFunc));
    } // 메인함수 끝

    static interface Func {
        int execute(int value) throws Exception;
    } // 인터페이스 정의

    public static int perform(Func func) {
        try {
            return func.execute(3);
        } catch (Exception e) {
            return 7;
        }
    } // perform 함수
}