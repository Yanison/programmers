package level2;

import java.util.Arrays;

public class JadenCase {
    /**
     * 1.주어진 문자열은 배열로 변환
     * 2.배열의 각 원소를 또 배열로 변환후 첫번째 원소를 대문자로 변환
     */

    public static void main(String[] args) {
        String str = "qrEEEE1Wad      EEEEqE123     eWWWWaSxz21  ";
        System.out.println(upper2(str.split(" "))+"#");
        //System.out.println(upper(str.split(" "))+"#");
    }

    public static String upper1(String a){
        String[] words = a.split(" ");
        String word = "";
        String result = "";

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
            if(words[i] == ""){
                System.out.println(123);
            }
//            String[] str = words[i].split("");
//            word = str[0].toUpperCase();
//            for (int e = 1; e < str.length; e++) {
//                word += str[e].toLowerCase();
//            }
//            result += word;
//            if(i != words.length - 1){
//                result += " ";
//            }
        }
        return result;
    }

    public static String upper2(String[] a){
        System.out.println(Arrays.toString(a));
        String result = "";
        String[] word;
        String str ="";
        for(int i = 0; i < a.length ;i ++){
            if(a[i].length() == 0){
                System.out.println("emp");
                continue;
            }
            word =  a[i].split("");
            for(int e = 0 ; e< word.length; e++){
                if(e == 0){
                    str = word[e].toUpperCase();
                }else{
                    str += word[e].toLowerCase();
                }
            }
            result += str;
            if(i != a.length - 1){
                result += " ";
            }
        }
        return result;
    }
}
