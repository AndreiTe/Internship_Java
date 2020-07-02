import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class masiv {
    private static final Logger logger = LogManager.getLogger(masiv.class);

    int array1[];
    int array2[];

    public masiv(int a1[], int a2[]) {
        PropertyConfigurator.configure("log4j.properties");
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
            //System.out.println(rand);
            double asd =  (a2[i]*1.0 / sum);
            if (rand <= asd) {
                //System.out.println(a1[i]);
               logger.info(a1[i]);

                break;
            } else if(rand > a2[a2.length-1]*1.0 / sum) {
                //System.out.println("else "+ a1[a2.length-1]);
                //logger.info(a1[a2.length-1]);
                break;
            }
            }

    }
}