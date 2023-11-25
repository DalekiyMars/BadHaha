import java.lang.reflect.Array;
import java.util.Arrays;

public class MassiveGlueAndSort {

    public static void main(String[] args)
    {
        int [] frst ={};
        int[] sec = {1, 4, 3};

        int[] myArray = mergeAndSort(frst,sec );

        for (int i = 0; i < myArray.length; i++)
        {
            System.out.print(myArray[i] + " ");

        }

    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray)
    {
        int[] tempArray = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, tempArray, 0, firstArray.length);
        System.arraycopy(secondArray, 0, tempArray, firstArray.length, secondArray.length);
        Arrays.sort(tempArray);
        return tempArray;
    }
}
