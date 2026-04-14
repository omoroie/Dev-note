package std_java;
// 자바 배열과 참조형 변수의 차이점 예문
public class exam12 {
    public static void main(String[] args) {
        String[] arr = {"A"};
        String str = "B";
        func(arr, str);
        System.out.println(arr[0] + str);
    }

    public static void func(String[] arr, String str) {
        arr[0] = "C";
        str = "D";
    }

}