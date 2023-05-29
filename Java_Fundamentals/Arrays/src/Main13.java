//Array 13
public class Main13 {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        System.out.println("Array before reversal:");
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
        int temp = a[0][0];
        a[0][0] = a[1][1];
        a[1][1] = temp;

        temp = a[0][1];
        a[0][1] = a[1][0];
        a[1][0] = temp;
        System.out.println("\nArray after reversal:");
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }

    }
}
