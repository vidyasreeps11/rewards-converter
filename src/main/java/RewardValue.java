public class RewardValue {

    private final double cashValue;
    private final int milesValue;

    private static final double MILES_TO_CASH_RATE=0.0035;



    public RewardValue(double cashValue) {

        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue/MILES_TO_CASH_RATE);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_RATE;
    }

    public double getCashValue()
    {
        return cashValue;
    }

    public int getMilesValue()
    {
        return milesValue;
    }

    public double convertMilesToCash(int miles){
        return miles * MILES_TO_CASH_RATE;
    }

    public int convertCashToMiles(double cash){
        return (int) (cash / MILES_TO_CASH_RATE);
    }
}
