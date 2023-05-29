

class find_minimum_and_maximum_element_arra {
    static class Pair {
        long min;
        long max;
        
        public Pair(long min, long max) {
            this.min = min;
            this.max = max;
        }
    }
    
    static Pair getMinMax(long[] arr, int n) {
        long min = arr[0];
        long max = arr[0];
        
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        return new Pair(min, max);
    }
}