package apr21;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Transaction {
    private String type;
    private double amount;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }
}

public class TransactionGrouping {

    public static void main(String[] args) {

        List<Transaction> transactions = Arrays.asList(
                new Transaction("CREDIT", 2000.0),
                new Transaction("CREDIT", 1000.0),
                new Transaction("DEBIT", 4000.0),
                new Transaction("CREDIT", 200.0),
                new Transaction("DEBIT", 1200.0),
                new Transaction("REFUND", 206.0),
                new Transaction("CREDIT", 500.0),
                new Transaction("DEBIT", 5000.0)
        );

        Map<String, Long> map = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getType, Collectors.counting()));

        System.out.println(map);
    }
}
