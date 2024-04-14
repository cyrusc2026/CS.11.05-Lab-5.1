public class ArrayUtility {

    public static void print(int[] array) {
        String answer = "";
        for (int i:array){
            answer = answer + array[i];
            if (i<array.length-1) answer = answer + ", ";
        }
        System.out.println(answer);
    }

    public static int sum(int[] array) {
        int answer = 0;
        for (int i:array){
            answer += array[i];
        }
        return answer;
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int i:array){
            sum += array[i];
        }
        if ((sum/array.length)%1 != 0)return (sum/array.length-((sum/array.length)%1));
        else return (sum/1.00);
    }

    public static int minimum(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length-1; i++){
            if (array[i] <= min) min = array[i];
        }
        return min;
    }

    public static int maximum(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length-1; i++){
            if (array[i] >= max) max = array[i];
        }
        return max;
    }

    public static int evenCount(int[] array) {
        int count = 0;
        for (int i:array){
            if (array[i]%2 == 0) count++;
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
        int[] answer = new int[array.length];
        int count = 0;
        for (int i = array.length-1; i > 0; i--){
            answer[count] = array[i];
            count++;
        }
        return null;
    }

    public static void reverseTwo(int[] array) {
        int start = 0;
        int end = array.length -1;
        while (start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end --;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int i:array){
            if (array[i] == num) return true;
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (int i = 0; i < array.length; i++){
            if (array[i].equals(str)) return true;
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i:array){
            array[i] *= 2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i:array){
            array[i] *= n;
        }
    }

    public static String toString(int[] array) {
        String answer = "";
        for (int i = 0; i< array.length; i++){
            answer += "" + array[i];
        }
        return answer;
    }

    public static boolean twoSum(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++){
                if (array[i] == array[j] && i != j) return true;
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int temp = array[0];
        for (int i = 1; i < array.length; i++){
            array[i-1] = array[i];
        }
        array[array.length-1] = temp;
    }

    public static void shiftLeft(int[] array) {
        int temp = array[array.length-1];
        for (int i = array.length-1; i > 1; i--){
            array[i] = array[i-1];
        }
        array[0] = temp;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            int last = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = last;
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            int first = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = first;
        }
    }
}
