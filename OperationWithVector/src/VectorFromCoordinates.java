import org.jetbrains.annotations.Contract;


public class VectorFromCoordinates {
    int x;
    int y;


    public VectorFromCoordinates(VectorFromPoints a){
        this.x = a.endPoint.x - a.startPoint.x;
        this.y = a.endPoint.y - a.endPoint.y;

    }

    public VectorFromCoordinates(){

    }


}

