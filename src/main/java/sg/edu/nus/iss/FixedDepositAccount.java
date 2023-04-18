package sg.edu.nus.iss;

public class FixedDepositAccount extends BankAccount {

    float interest = 3.0f;
    Integer durationMonths = 6;
    boolean interestChanged = false;
    boolean durationMonthsChanged = false;

    public FixedDepositAccount(String name, float balance) {
        super(name, balance);
    }

    public FixedDepositAccount(String name, float balance, float interest) {
        super(name, balance);
        this.interest = interest;
    }

    public FixedDepositAccount(String name, float balance, float interest, Integer duration) {
        super(name, balance);
        this.interest = interest;
        this.durationMonths = duration;
    }

    @Override
    public void deposit(float value) {
        throw new UnsupportedOperationException();
    };

    @Override
    public void withdraw(float value) {
        throw new UnsupportedOperationException();
    };

    @Override
    public float getAccountBalance() {
        float fdBalance = super.getAccountBalance() * (interest + 100) / 100;
        System.out.println("Fixed Deposit Account Balance: " + fdBalance);
        return fdBalance;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        if (interestChanged) {
            throw new IllegalArgumentException();
        } else {
            this.interest = interest;
            setInterestChanged(true);
        }
    }

    public Integer getDurationMonths() {
        return durationMonths;
    }

    public void setDurationMonths(Integer durationMonths) {
        if (durationMonthsChanged) {
            throw new IllegalArgumentException();
        } else {
            this.durationMonths = durationMonths;
            setDurationMonthsChanged(true);
        }
    }

    public boolean isInterestChanged() {
        return interestChanged;
    }

    public void setInterestChanged(boolean interestChanged) {
        this.interestChanged = interestChanged;
    }

    public boolean isDurationMonthsChanged() {
        return durationMonthsChanged;
    }

    public void setDurationMonthsChanged(boolean durationMonthsChanged) {
        this.durationMonthsChanged = durationMonthsChanged;
    }

}
