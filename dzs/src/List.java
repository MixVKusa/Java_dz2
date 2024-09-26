public class List {
    public static int[] num = null;
    public static int size;

    public static void add(int x) {
        add(size, x);
    }

    public static void add(int ind, int x) {
        int[] newArr;
        if (size >= num.length){
            newArr = new int[num.length*2];
        }
        else{
            newArr = new int[num.length];
        }

        for (int i = 0; i < ind; i++) {
            newArr[i] = num[i];
        }
        newArr[ind] = x;
        for (int i = ind; i < size; i++) {
            newArr[i+1] = num[i];
        }
        num = newArr;
        size++;
    }

    public static void printList(){
        System.out.print("{");
        for (int i = 0; i<size; i++){
            System.out.print(num[i]);
            if (i < size - 1){
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }
}
