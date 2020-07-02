import java.util.ArrayList;


import org.apache.log4j.LogManager;
import org.apache.log4j.PropertyConfigurator;
public class FristTask {

    public static void main(String[] args) {


        int znacenie[] = {1,2,3};
        int vesa[] = {1,8,10};
        masiv x = new masiv(znacenie, vesa);
        x.myFunc(x.array1, x.array2);
         }

}
