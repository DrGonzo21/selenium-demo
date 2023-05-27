package OOP;

public interface BasInterestRate {
    double BASE_INTEREST_RATE = 2.5;

    default double getBaseInterestRate() {
        return BASE_INTEREST_RATE;
    }

    void setInterestRate();
}