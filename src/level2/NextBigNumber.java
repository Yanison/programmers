package level2;

public class NextBigNumber {
    /**
     * n보다 다음 큰 숫자는 n보다 큰 자연수
     * n의 다음 큰 숫자자와 n은 2진수로 변환했을 때 1의 갯수가 같다.
     * n의 다음 큰 숫자는 1,2를 만족하는 수 중 가낭 작은수
     *
     * 해결방법
     * 임이의 숫자 n을 이진수로 변환한 문자열 str
     * str.charAt(0)을 제외한 1을 제일 오른쪽으로 정렬
     * 2의0승자리의 1을 왼쪽으로 바꿔가면서 대소 구별.
     *
     * ->> 너무 복잡함.
     * 주어진 숫자보다 큰 숫자중 1의 갯수가 똑같은 숫자를 찾으면 더 간단하지 않을까?
     */
    public static void main(String[] args) {

    }
//    public static int nextBig(int n){
//        StringBuilder sb = new StringBuilder(n);
//        int howmanyone = 0;
//        for (int i = 0; i < sb.length(); i++) {
//            if(sb.charAt(i) == '1'){
//                howmanyone += 1;
//                sb.setCharAt(i,'0');
//            }
//        }
//
//        for (int e = 0; e < howmanyone; e++) {
//            sb.setCharAt(sb.length() - 1 - e,'1');
//        }
//
//        while(true){
//            if(n < Integer.parseInt(sb.toString())){
//                break;
//            }else {
//                sb.setCharAt(howmanyone+1,'1');
//            };
//        }
//    }

    public static int findNextBigInt(int count,int n){
        while(true){
            n++;
            int binaryCount = Integer.bitCount(n);
            if(binaryCount == count){
                return n;
            }
        }
    }
}
