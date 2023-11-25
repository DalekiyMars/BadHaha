public class MassiveSlicer {

    public static void main(String[] args)
    {
        int[] mass = {1,3,5,6,9,11,24};
        StringBuilder sb = new StringBuilder();
        int startPoint = 4, stopPoint = 10, temp = 0;
        for (int i = 0; i <= mass.length; i++) {
            int massIterate = mass[i];
            if (massIterate >= startPoint && massIterate <= stopPoint) {
                sb.append(massIterate);
            } else if (massIterate > stopPoint) {
                break;
            }
            temp++;
        }
        System.out.println(temp);
        System.out.println(sb);
    }
}
