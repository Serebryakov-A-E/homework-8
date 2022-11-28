public class Main {
    public static void main(String[] args) {
        //task 1
        int[] intArray = {1, 2, 3};
        double[] doubleArray = {1.57, 7.654, 9.986};
        int[] array = new int[3];
        array[0] = 5;
        array[1] = 10;
        array[2] = 67;

        //task 2
        for (int i = 0; i < intArray.length; i++) {
            if (i == intArray.length - 1) {
                System.out.println(intArray[i]);
            } else {
                System.out.print(intArray[i] + ", ");
            }
        }

        for (int i = 0; i < doubleArray.length; i++) {
            if (i == doubleArray.length - 1) {
                System.out.println(doubleArray[i]);
            } else {
                System.out.print(doubleArray[i] + ", ");
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }

        //task 3
        for (int i = intArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(intArray[i]);
            } else {
                System.out.print(intArray[i] + ", ");
            }
        }

        for (int i = doubleArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(doubleArray[i]);
            } else {
                System.out.print(doubleArray[i] + ", ");
            }
        }

        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }

        //task 4
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 != 0) {
                intArray[i] += 1;
            }
            if (i == intArray.length - 1) {
                System.out.println(intArray[i]);
            } else {
                System.out.print(intArray[i] + ", ");
            }
        }
    }
}