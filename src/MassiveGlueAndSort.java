import java.util.Arrays;

public class MassiveGlueAndSort {

    public static void main(String[] args)
    {
        int [] first ={};
        int[] sec = {1, 4, 3};

        int[] myArray = mergeAndSort(first,sec );

        for (int j : myArray) {
            System.out.print(j + " ");

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
