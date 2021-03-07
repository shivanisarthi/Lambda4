public class Controller {

    public static void main(String[] args) {
        RangeExampleImpl re = new RangeExampleImpl();
        Long l;
        l=re.calculate(0L,1L);
        System.out.println(l);
    }
}
