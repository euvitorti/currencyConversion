package coin;

import api.CoinApi;

public class Coin {
    private float result;

    public Coin(CoinApi coinApi) {
        this.result = coinApi.conversion_rate();
    }

    public void info() {
        System.out.printf("Converted value: %f.1.\n", result);
    }

    @Override
    public String toString() {
        return "Coin: " + this.result;
    }
}