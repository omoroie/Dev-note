package std_java;
// 자바 오버라이딩과 오버로딩 예문, static 메소드와 인스턴스 메소드의 차이점 예문
public class exam12 {

    public static class Dog {
        public static void one() {
            System.out.println("멍멍");
        }
        public void two() {
            System.out.println("왈왈");
        }
    }

    public static class Animal extends Dog {
        public static void one() {
            System.out.println("동물");
        }
        public void two() {
            System.out.println("animal");
        }
    }
    public static void main(String[] args) {
        Dog dog = new Animal();
        dog.one();
        dog.two();
    }

}