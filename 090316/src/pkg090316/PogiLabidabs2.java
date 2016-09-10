package pkg090316;

public class PogiLabidabs2 {

    public static void main(String[] args) {
        System.out.print("Sorting numbers: ");
        int[] yeh = {8, 0, 2, 1, 5};
        int tem = 0;
        for (int i = 0; i < yeh.length; i++) {
            System.out.print(yeh[i] + " ");
        }
        System.out.println("");
        for (int x = 0; x < yeh.length; x++) {
            int min = x;
            for (int y = x + 1; y < yeh.length; y++) {
                if (yeh[y] < yeh[min]) {
                    min = y;
                }
            }
            tem = yeh[x];
            yeh[x] = yeh[min];
            yeh[min] = tem;
            for (int i = 0; i < yeh.length; i++) {
                System.out.print(yeh[i] + " ");
            }
            System.out.println("");
        }
        System.out.print("Array contains: ");
        for (int i = 0; i < yeh.length; i++) {
            System.out.print(yeh[i] + " ");
        }
    }
}
