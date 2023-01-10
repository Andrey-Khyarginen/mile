public class BonusMilesService {
    public int calculate(int price) {
        int miles = price / 20;
        int bonus = miles * 1;
        return bonus;
    }
}
