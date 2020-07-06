import org.apache.log4j.PropertyConfigurator;

public class FristTask {

    public static void main(String[] args) {

        int znacenie[] = {0,1,2,3};
        int vesa[] = {1,2,3,4};
        int test[] = new int[4];
        int q =100000 ;
        Random x = new Random(znacenie, vesa);

        for (int i = 0; i < q; i++){
            int asd = x.myFunc();
            if (asd == 0) {
                test[0]+=1;
            } else
            if (asd == 1) {
                test[1]+=1;
            } else
            if (asd == 2) {
                test[2]+=1;
            } else
            if (asd == 3) {
                test[3]+=1;
            }

        }
        for (int i = 0; i < 4; i++){
            System.out.println(test[i]*100/q+"%");
        }
       System.out.print(x.myFunc());
         }

}
