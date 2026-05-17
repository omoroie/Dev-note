package std_java;
// 자바의 부모 자식 클래스 상속, 오버라이딩 예문
// super()는 강제로 부모 클래스의 메소드를 호출하고, 자식 클래스에 동일하게 선언된 메소드는 자동으로 Override가 되어 기본적으로는 자식 메소드를 호출 하게됨
public class exam15 {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.paint();
        shape.draw();
        new Circle().old();
    }
}

class Shape {
    public void paint() {
        System.out.print("S");
        draw();
    }
    public void draw() {
        System.out.print("T");
        draw();
    }
}

class Circle extends Shape {
    public void paint() {
        super.draw();
        System.out.print("U");
        this.draw();
    }
    public void draw() {
        System.out.print("V");
    }

    public void old() {
        System.out.println("N");
    }
}