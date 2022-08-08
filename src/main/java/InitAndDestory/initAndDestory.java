package InitAndDestory;

import java.util.Arrays;

public class initAndDestory {

    public static void main(String[] args) {
        int[] arr = new int[8];
        for (int i : arr) {
            arr[i] = 2;
        }

        System.out.println(Arrays.toString(arr));
//        for(int i:arr){
//            System.out.println(arr[i]);
//        }
    }


}


