package info.vladyslav.EPAM_WH_3_1111;

import java.util.Arrays;

public class T2RemoveValueInstancesInArray {


    public int run(int[] arr, int val) {

        int count = 0;
        int last = arr.length - 1;
        for (int i = 0; i < last; i++) {

            if (arr[i] == val) {
                while (arr[last] == val) {
                    last--;
                }

                arr[i] = arr[last];
                arr[last] = val;
            }
            count++;
        }
        System.out.println(Arrays.toString(arr));
        return count;
    }

}
