public class List {
    public static int[] add(int[] array, int x) {
        int[] newArr = new int[array.length + 1];
//        System.arraycopy(array, 0, newArr, 0, array.length);
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }
        newArr[newArr.length-1] = x;
//        System.out.println(newArr[5]);
        return newArr;
    }

    public static int[] index(int[] array, int ind, int x) {
        int[] newArr = new int[array.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++, j++) {
            if (i == ind){
                newArr[i] = x;
                j--;
            }
            else newArr[i] = array[j];
        }
        return newArr;
    }
}
