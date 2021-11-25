public class Lesson2 {

    public static void main(String[] args) {
        int[] a = {1, 1, 0, 0, 0, 1, 0, 1, 1, 0};
        int[] numbers = new int[8];
        int[] arrayX2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] arrayDiagonal = new int[5][5];
        int[] arrayBalance = {2, 2, 2, 1, 2, 2, 10, 1};


        outputArray(zeroToOne(a));
        outputArray(addNumbers(numbers));
        outputArray(x2(arrayX2));
        outputArray(maxAndMin(arrayX2));
        System.out.println(halfBalance(arrayBalance));
        outputArray(shiftArray(arrayX2, -15));
        for (int i = 0; i < arrayDiagonal.length; i++) {
            for (int j = 0; j < arrayDiagonal[0].length; j++) {
                System.out.print(" " + diagonal(arrayDiagonal)[i][j] + " ");
            }
            System.out.println();
        }


    }

    static void outputArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    static int[] zeroToOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        return arr;
    }

    static int[] addNumbers(int[] arr) {

        int ratio = 3;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                arr[i] = 0;

            } else {
                arr[i] = i * ratio;
            }
        }
        return arr;
    }

    static int[] x2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        return arr;
    }

    static int[][] diagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j || i + j == arr.length - 1) {
                    arr[i][j] = 1;
                }
            }

        }
        return arr;
    }

    static int[] maxAndMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        int minAndMax[] = {min, max};
        return minAndMax;
    }

    static boolean halfBalance(int[] arr) {

        int leftSum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int rightSum = 0;
            leftSum += arr[i];
            for (int j = arr.length - 1; j > i; j--) {
                rightSum += arr[j];
            }
            if (leftSum == rightSum) return true;
        }
        return false;
    }


    static int[] shiftArray(int[] arr, int shift) {
        int a = -shift;
        if (shift > arr.length) {
            shift = shift - arr.length;
        } else if (shift < 0 && a > arr.length) {
            shift = shift + arr.length;
        }
        if (shift > 0) {
            for (int i = 0; i < shift; i++) {
                int lastElem = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = lastElem;
            }
        } else {
            for (int i = shift; i < 0; i++) {
                int firstElem = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = firstElem;
            }
        }
        return arr;
    }
}
