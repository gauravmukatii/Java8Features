public class Transaction {
    private Double amount;
    private String input;

    public Transaction(double amount, String input) {
        this.amount = amount;
        this.input = input;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", input='" + input + '\'' +
                '}';
    }
}
