public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int mileCost = 20;
        int miles = ticketPrice / mileCost;
        return miles;
    }
}
