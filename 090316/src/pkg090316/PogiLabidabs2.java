package pkg090316;

public class PogiLabidabs2 {

    public static void main(String[] args) {
        System.out.println("Sorting numbers 8, 0, 2, 1, 5.");
        int[] yeh = {8, 0, 2, 1, 5};
        int x, y, min, tem;

        for (x = 0; x < yeh.length; x++) {
            min = x;

            for (y = x + 1; y < yeh.length; y++) {
                if (yeh[y] < yeh[min]) {
                    min = y;

                }

                tem = yeh[x];
                yeh[x] = yeh[min];
                yeh[min] = tem;

            }
        }

        System.out.print(yeh[x]);
    }

}

