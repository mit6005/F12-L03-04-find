package inclass;


public class Find {

    
    /**
     * Find value in an array.
     * @param a array to search; requires val occurs exactly once in a.
     * @param val value to search for
     * @return index i such that a[i] == val
     */
    public static int findA (int[] a, int val) {
        throw new RuntimeException("not implemented yet");
    }

    /**
     * Find value in an array.
     * @param a array to search; requires val occurs at least once in a.
     * @param val value to search for
     * @return index i such that a[i] == val
     */
    public static int findB (int[] a, int val) {
        throw new RuntimeException("not implemented yet");
    }

    /**
     * Find value in an array.
     * @param a array to search; requires val occurs at least once in a.
     * @param val value to search for
     * @return lowest index i such that a[i] == val
     */
    public static int findC (int[] a, int val) {
        throw new RuntimeException("not implemented yet");
    }

    /**
     * Find value in an array.
     * @param a array to search
     * @param val value to search for
     * @return lowest index i such that a[i] == val, 
     * or -1 if val not found in the array.
     */
    public static int findD (int[] a, int val) {
        throw new RuntimeException("not implemented yet");
    }

    /**
     * Find value in an array.
     * @param a array to search
     * @param val value to search for
     * @return lowest index i such that a[i] == val
     * @throws NotFoundException if val not found in the array.
     */
    public static int findE (int[] a, int val) throws NotFoundException {
        for (int i = 0; i < a.length; ++i) {
            try {
                if (val == a[i]) return i;
            } catch (ArrayIndexOutOfBoundsException e) {
                
            }
        }
        throw new NotFoundException();
    }

    public static class NotFoundException extends Exception {
    }

    public static void main(String[] args) {
        int x = findD(new int[] { 1, 2, 3}, 4);
        if (x == -1) {
            //...
        }
        
        try {
            int y = findE(new int[] { 1, 2, 3}, 4);
        } catch (NotFoundException e) {
            // ...
            
        }
    }
}
