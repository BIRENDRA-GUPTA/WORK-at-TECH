 class missing_number_in_array {
        

    int MissingNumber(int array[], int n) {
        int totalSum = (n * (n + 1)) / 2;
        int arraySum = 0;

        for (int i = 0; i < n - 1; i++) {
            arraySum += array[i];
        }
    
        return totalSum - arraySum;
    }
}
