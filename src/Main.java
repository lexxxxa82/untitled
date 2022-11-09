public class Main {
    public static void main(String[] args) {
        int[]weights ={12,91,22,92,25,87,88,89,2,0,0,5, };
        int januaryWeight = weights [0];
        System.out.println(januaryWeight);
        int january = 1;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);}
           int weightsSize = weights.length;
           System.out.println(weightsSize);
        int i = weights[weights.length - 2];
        System.out.println(i);


    }
}