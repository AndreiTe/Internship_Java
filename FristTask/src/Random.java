import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Random {
    private static final Logger logger = LogManager.getLogger(Random.class);

    int index[];
    int weight[];

    public Random(int a1[], int a2[]) {
        PropertyConfigurator.configure("log4j.properties");
        this.index = a1;
        this.weight = a2;

    }
    //myFunc возвращает произвольное число из масива учитывая веса
    int myFunc() {
        double rand = Math.random();
        int res = 0;
            for (int i = 0; i < this.weight.length; i++) {
                for (int j = 0; j < this.weight.length; j++) {
                    if (this.weight[i] < this.weight[j]) {
                        int tmp1 = this.weight[i];
                        this.weight[i] = this.weight[j];
                        this.weight[j] = tmp1;

                        tmp1 = this.index[i];
                        this.index[i] = this.index[j];
                        this.index[j] = tmp1;
                    }
                }
             }

            for (int i = 0; i < this.weight.length; i++) {
                if (rand <= sumaVeroiatnostei(i+1)) {
                    //logger.info(this.index[i]);
                    res = this.index[i];
                    break;
                }
            }

        return res;
    }

    double sumaVeroiatnostei(int x){
        double sum = 0;
        for(int i = 0; i < x; i++){
            sum += this.weight[i]*1.0/sumaVesov();
        }
        return sum;
    }

    int sumaVesov(){
        int sum = 0;
        for (int i = 0; i < this.index.length; i++){
            sum += this.weight[i];
        }
        return sum;
    }



}