class first {
    public static void main(String[] args) {
        int[] array = {1, 2};
        System.out.print(rekursia(array, 0, 0));
    }
    public static int rekursia(int[] array, int sum, int counter) {
        if (array.length == counter) {
            return sum;
        } else {
            sum += array[counter];
            counter += 1;
            return rekursia(array, sum, counter);
        }

    }
}
