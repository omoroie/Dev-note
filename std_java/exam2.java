package std_java;

public class exam2 {
/*
정보처리기사 실기 대비: 람다식과 예외 처리 이해하기
1. 함수형 인터페이스 (메서드가 하나뿐인 인터페이스)
2. 람다식 (->)을 이용한 메소드 오버라이딩
3. try-catch를 이용한 예외 흐름 제어
*/

public class Main {
// 1. 함수형 인터페이스 정의 (apply라는 이름의 약속된 버튼)
    static interface F {
        int apply(int x) throws Exception;
    }

    // 2. 인터페이스를 매개변수로 받는 실행 함수
    public static int run(F f) {
        try {
            return f.apply(3); // 전달받은 함수(f)에 숫자 3을 넣어서 실행해본다
            
        } catch (Exception e) {
            return 7; // 실행 중 에러가 발생하면 무조건 7을 돌려준다
        }
    }

    public static void main(String[] args) {
        // [Part A] 2보다 큰 숫자가 들어오면 폭탄(Exception)을 던지는 함수
        F f = (x) -> {
            if (x > 2) {
                throw new Exception();
            }
            return x * 2;
        };

        // [Part B] 단순히 9를 더해주는 착한 함수
        // (int n) -> n + 9는 람다식 축약형(Method Override)
        
        // 결과 계산: run(f)는 3을 넣어 폭탄이 터지므로 7 반환
        //           run(n+9)는 3+9를 정상 수행하므로 12 반환
        int result = run(f) + run((int n) -> n + 9);

        // 최종 출력: 7 + 12 = 19
        System.out.print(result);
    }
}
}
