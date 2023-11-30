public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();

        String x = "101";
        String y = "110";

        System.out.println(bins.sum(x, y));
        System.out.println(bins.mult(x, y));
    }
}