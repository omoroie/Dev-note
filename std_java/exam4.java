package std_java;

public class exam4 {
    public static class B0 {
        public int v;
        public B0(int v) {
            this.v = v;
        }
    }
    public static void main(String[] args) {
        B0 a = new B0(1);
        B0 b = new B0(2);
        B0 c = new B0(3);
        B0[] arr = {a, b, c};
        B0 t = arr[0];
        arr[0] = arr[2]; // arr[0]이 arr[2]를 가리켜게 됨
        arr[2] = t;
        arr[1].v = arr[0].v; // arr[0]이 arr[2]를 가리켜므로 3이 arr[1]에 들어감
        System.out.println(a.v + "a" + b.v + "b" + c.v);
    }
}