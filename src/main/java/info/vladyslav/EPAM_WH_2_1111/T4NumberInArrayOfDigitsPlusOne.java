package info.vladyslav.EPAM_WH_2_1111;

public class T4NumberInArrayOfDigitsPlusOne {

    int[] run(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if ((arr[i] + 1) != 10) {
                arr[i] = arr[i] + 1;
                break;
            } else if (i > 0) {
                arr[i] = 0;
            } else {
                int[] arrExtended = new int[arr.length + 1];
                for (int j = 0; j < arrExtended.length; j++) {
                    if (j == 0) {
                        arrExtended[j] = 1;
                    } else {
                        arrExtended[j] = 0;
                    }
                }
                return arrExtended;
            }
        }
        return arr;
    }

}
