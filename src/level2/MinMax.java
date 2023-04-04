package level2;

public class MinMax {
    public static void main(String[] args) {
        String str = "3 1 4 2";
        String[] arr = str.split(" ");
        System.out.println(getMinAndMax(arr));

    }
    static String getMinAndMax(String[] arr){
        int min,max;
        max = Integer.parseInt(arr[0]);
        min = Integer.parseInt(arr[0]);
        for(int i = 1; i < arr.length; i ++){
            int num = Integer.parseInt(arr[i]);
            if(max < num ){
                max = num;
            }
            if(min > num){
                min = num;
            }
        }
        return min + " " + max;
    }
}
