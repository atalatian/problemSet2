public class Question3 {
    static int[] random(){
        int[] array = new int[200];
        for (int i = 0; i< 200; i++){
            array[i] = (int)(Math.random()*51);
        }
        return array;
    }

    static int[] insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    static int linearSearch(int[] array, int size, int item){
        int counter = 0;
        for(int i=0; i<size; i++){
            if (array[i] == item){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.printf("found what you entered %d times",
                linearSearch(insertionSort(random()), random().length, 5))
        ;
    }
}
