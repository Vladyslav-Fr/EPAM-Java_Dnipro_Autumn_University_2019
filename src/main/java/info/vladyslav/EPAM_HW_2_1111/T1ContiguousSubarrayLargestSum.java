package info.vladyslav.EPAM_HW_2_1111;

public class T1ContiguousSubarrayLargestSum {

    int run(int[] arr) {
        int maxSum = 0,  currSum = 0;
        for (int i = 0; i < arr.length; ++i) {
            currSum += arr[i];

            if (currSum > maxSum) {
                maxSum = currSum;
            }

            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
}
