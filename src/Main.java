public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int miles = service.calculate(8757);
        System.out.println("Миль начислено: " + miles);
    }
}
