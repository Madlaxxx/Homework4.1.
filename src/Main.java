public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int bonus = 20;
        int miles = service.calculate(price, bonus); // должно получиться 500
        System.out.println(miles);
    }
}