package coin;

import api.CoinApi;

public class Coin {
    private double targetValue;
    private double valueConverted;

    public void info() {
        System.out.printf("Converted value: %.2f.\n", this.valueConverted);
    }

    public void coin(CoinApi coinApi, double baseValue) {
        this.targetValue = coinApi.conversion_rate();
        calculator(baseValue);
    }

    public void calculator(double base) {
        this.valueConverted = base * this.targetValue;
        info();
    }
}