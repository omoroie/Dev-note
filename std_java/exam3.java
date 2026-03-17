package std_java;

public class exam3 {
    
        public static class Parent{
            public int x(int i) {return i+2;}
            public static String id() { return "P";}
        }

        public static class Child extends Parent {
            public int x(int i) { return i + 3; } // 오버라이딩
            public String x(String s) { return s + "R"; } // 오버로딩
            public static String id() { return "C"; } // 오버라이딩
        }

        public static void main(String[] args) {
            Parent ref = new Child();
            // 업캐스팅은 부모 클래스를 기반으로 호출한다 
            // 자식 클래스에서 오버로딩을 선언한 메소드는 호출이 불가능하고 Static(정적) 메소드는 오버라이딩을 했더라도 부모 클래스의 메소드를 호출한다.
            System.out.println(ref.x(2) + ref.id());
    }
}
