public class MassiveSlicer {

    public static void main(String[] args)
    {
        int[] mass = {1,3,5,6,9,11,24};
        StringBuilder sb = new StringBuilder();
        int startPoint = 4;
        int stopPoint = 10;
        int temp = 0;
        for (int i = 0; i <= mass.length; i++)
        {
            if (mass[i] >= startPoint && mass[i] <= stopPoint)
            {
                sb.append(mass[i]);
            }
            else if (mass[i] > stopPoint)
            {
                break;
            }
            temp++;

        }
        System.out.println(temp);
        System.out.println(sb);
    }
}
