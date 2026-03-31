package std_java;
// 재귀 함수
public class exam9 {
        public static String rf(String str, int index, boolean[] seen) {
        if(index < 0) return "";
        char c = str.charAt(index);
        String result = rf(str, index-1, seen); // 재귀 함수에 의해 index < 0 의 조건을 만족할때 까지 index값은 앞으로 감, return문이 시행되면 8번줄 코드를 index값이 낮은순서로 return을 반복함
        if(!seen[c]) {
            seen[c] = true;
            return c + result;
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "abacabcd";
        int len = str.length();
        boolean[] seen = new boolean[256];
        System.out.println(rf(str, len-1, seen));
    }
}