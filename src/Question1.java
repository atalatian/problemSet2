import java.util.Arrays;

public class Question1 {

    static int[] random(){
        int[] array = new int[200];
        for (int i = 0; i< 200; i++){
            array[i] = (int)(Math.random()*51);
        }
        return array;
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
        System.out.println(linearSearch(random(), random().length, 0));
    }
}
