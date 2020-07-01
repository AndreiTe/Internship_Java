import javax.swing.*;

public class masiv {
    int array1[];
    int array2[];

    public masiv(int a1[], int a2[]) {
        this.array1 = a1;
        this.array2 = a2;
    }

    static void myFunc(int a1[], int a2[]) {
        int sum = 0; int k=0;
        double rand = Math.random();
        for (int i = 1; i < a2.length; i++) {
            sum += a2[i];
        }
        for (int i = 1; i < a2.length; i++) {
            if (a2[i - 1] > a2[i]) {
                int tmp1 = a2[i - 1];
                a2[i - 1] = a2[i];
                a2[i] = tmp1;

                int tmp2 = a1[i - 1];
                a1[i - 1] = a1[i];
                a1[i] = tmp2;
            }
        }

        for (int i = 0; i < a2.length; i++) {
           // System.out.println(a1[i]);
           // System.out.println(a2[i]);
            double asd =  (a2[i]*1.000 / sum);
            if (rand <= asd) {
                System.out.println(a1[i]);
                k = 1;
                break;
            }

            }
        if (k == 0){
            System.out.println("asdasd");
            System.out.println(a1[a1.length]);
           // System.out.println(asd);
        }
    }
}