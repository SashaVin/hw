public class second {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        int x = arr[arr.length - 1] * arr[arr.length - 1];
        cicle(arr,x);
    }

    public static void cicle(int[] arr, int x) {
        int j;
        for (j = 0; j < arr.length - 1; j++) {
            if (arr[j] > x) {
                System.out.println(arr[j]);
            }
        }
    }
}
