public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.80;
        int weight = 87;
        double your_imt = service.calculate(height, weight);
        int your_imt_f = (int) your_imt;
        System.out.println(your_imt_f);
    }
}
