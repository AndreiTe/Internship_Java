import javax.swing.*;

public class masiv {
    int array1[];
    int array2[];

    public masiv(int a1[], int a2[]) {
        this.array1 = a1;
        this.array2 = a2;
    }

    static void myFunc(int a1[], int a2[]) {
        int sum = 0;
        double rand = Math.random();
        for (int i = 0; i < a2.length; i++) {
            sum += a2[i];
        }
        for (int i = 0; i < a2.length-1; i++) {
            if (a2[i] > a2[i+1]) {
                int tmp1 = a2[i];
                a2[i] = a2[i+1];
                a2[i+1] = tmp1;

                 tmp1 = a1[i];
                a1[i] = a1[i+1];
                a1[i+1] = tmp1;
            }
        }

        for (int i = 0; i < a2.length; i++) {
           // System.out.println(a1[i]);
           // System.out.println(a2[i]);
            double asd =  (a2[i]*1.000 / sum);
            if (rand <= asd) {
                System.out.println(a1[i]);
                break;
            }

            }

    }
}