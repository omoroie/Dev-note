package std_java;
// 정처기 실기 준비(간단한 boolean, 홀/짝수 조건식 함수)

public class exam8 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9};
        OENumber OE = new OENumber();
        System.out.print(OE.sum(a, true) + ", " + OE.sum(a, false));
    }
}

interface Number {
    int sum(int[] a, boolean odd);
}

class OENumber implements Number {
    public int sum(int[] a, boolean odd){
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            if ((odd && a[i] % 2 != 0) || (!odd && a[i] % 2 == 0)) // true일때, &&(and) a[i]의 값을 2로 나눈 나머지가 0이 아닐때(홀수) || false일때 && 나머지가 0일때(짝수)
                result += a[i];
        }
        return result;
    }
}
