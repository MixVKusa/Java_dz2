public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 9};
        int[] arr2 = List.index(arr, 2, 11);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}