import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args){
        int[] array = {9,1,8,7,3,6,4,5};

        bubbleSort2(array);

        for(int i: array){
            System.out.println(i);
        }
    }
    public static void bubbleSort(int array[]){
        for (int i = 0;i< array.length - 1;i++){
            for (int j = 0;j< array.length - 1 - i;j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    public static void bubbleSort2(int array[]){
        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            for (int i = 1;i<array.length;i++){
                if(array[i] < array[i-1]){
                    int temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                    isSorted = false;
                }
            }
        }
    }
}