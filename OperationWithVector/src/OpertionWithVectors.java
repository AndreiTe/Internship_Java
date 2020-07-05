

public class OpertionWithVectors {
    public static void main(String[] args) {
    VectorFromCoordinates v1 =
            new VectorFromCoordinates(new VectorFromPoints(new Point(1,1), new Point(3,2)));
    VectorFromCoordinates v2 =
            new VectorFromCoordinates(new VectorFromPoints(new Point(2,1), new Point(4,1)));
        System.out.print(v1.x+"  ");
        System.out.print(v1.y);
    VectorFromCoordinates v3 = new VectorFromCoordinates();
    v3 = sumVectors(v1,v2);

    }

    public static VectorFromCoordinates sumVectors(VectorFromCoordinates a, VectorFromCoordinates b){
        VectorFromCoordinates sum = new VectorFromCoordinates();
        sum.x = a.x + b.x;
        sum.y = a.y + b.y;

        return (sum);
    }
}
