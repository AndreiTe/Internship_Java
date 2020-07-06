

public class OpertionWithVectors {
    public static void main(String[] args) {
    VectorFromCoordinates v1 =
            new VectorFromCoordinates(new VectorFromPoints(new Point(1,1), new Point(3,2)));
    VectorFromCoordinates v2 =
            new VectorFromCoordinates(new VectorFromPoints(new Point(-1,1), new Point(-3,2)));

    VectorFromCoordinates v3 = new VectorFromCoordinates();
    v3 = subVectors(v1,v2);
        System.out.print(v3.x+"  ");
        System.out.print(v3.y);
    }

    public static VectorFromCoordinates sumVectors(VectorFromCoordinates a, VectorFromCoordinates b){
        VectorFromCoordinates sum = new VectorFromCoordinates();
        sum.x = a.x + b.x;
        sum.y = a.y + b.y;
        return sum;
    }

    public  static VectorFromCoordinates subVectors(VectorFromCoordinates a, VectorFromCoordinates b){
        VectorFromCoordinates sub = new VectorFromCoordinates();
        sub.x = a.x - b.x;
        sub.y = a.y - b.y;
        return sub;
    }
}
