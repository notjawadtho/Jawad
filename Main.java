class CodeReuse {
    // Method to add two matrices

    public int[][] matrixAddition(int[][] matrixA, int[][] matrixB, int rows, int columns) {
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }

    // Method to sort an array in ascending order

    public void sortAscending(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j] > array[j+1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    // Method to calculate maximum, minimum, and average of an array
    public double[] calculateStats(int[] array) {
        int max = array[0];
        int min = array[0];
        double sum = 0;
        for (int i : array) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
            sum += i;
        }
        double average = sum / array.length;
        return new double[]{max, min, average};
    }

    public static void main(String[] args) {

        CodeReuse c1 = new CodeReuse();
//        c1.sortAscending();
//        c1.matrixAddition();
//        c1.calculateStats();
    }


}