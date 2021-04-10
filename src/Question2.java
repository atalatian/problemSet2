import java.util.Arrays;

public class Question2 {
    static int[] array(){
        int rand = (int)(Math.random()*100);
        int[] myArray = new int[25];
        for (int i=rand; i<25+rand;i++){
            myArray[i-rand] = i;
        }
        return myArray;
    }

    static int linearSearch(int[] array, int size, int item){
        System.out.println(Arrays.toString(array));
        for(int i=0; i<size; i++){
            if (array[i] == item){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(linearSearch(array(), array().length, 40));
    }
}
