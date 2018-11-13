public class Amount {
    private int value;

    public Amount(int value) {
        this.value = value;
    }

    public Amount plus(Amount amount) {
        return new Amount(this.value + amount.value);
    }

    public boolean equals(Amount amount) {
        return this.value == amount.value;
    }

    public Amount subtracts(Amount amount) {
        return new Amount(this.value - amount.value);
    }

    public Amount negative() {
        if (this.value < 0) return this;
        return new Amount(0 - this.value);
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}
