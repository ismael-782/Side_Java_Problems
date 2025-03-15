public class task {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {2, 3, 4, 5, 6};
        int[] arr3 = {2, 3, 4, 5, 6, 7};

        if (arr3[0] % 2 != 0) {
            int size = (int) Math.floor(arr3.length / 2);
            int adder = 0;
            for (int i = 0; i < size; i++) {
                adder++;
                arr3[i] = arr3[i] + adder;
            }
            for (int i = size; i < arr3.length; i++) {
                arr3[i] = arr3[i] - adder;
                adder--;
            }
        } else {
            int size = (int) Math.ceil(arr3.length / 2);
            int adder = 0;
            for (int i = 0; i < size ; i++) {
                arr3[i] = arr3[i] + adder;
                adder++;
            }
            for (int i = size; i < arr3.length; i++) {
                arr3[i] = arr3[i] - adder;
                adder--;
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            System.err.println( arr3[i] );
        }
    }
}
