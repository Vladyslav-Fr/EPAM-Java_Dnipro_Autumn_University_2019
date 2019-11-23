package info.vladyslav.EPAM_WH_3_1111;

public class T5FindDuplicatesInArray {

    boolean run(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

}
