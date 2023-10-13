package bank;

public class Transaction<T extends Account> {

    private final T from;

    private final T to;

    private final double amount;

    public Transaction(T from, T to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public void execute(){
        if (from.getAmount() >= amount){
            System.out.printf("Осуществлен перевод средств между счетами на сумму %.2f руб.\n", amount);
            System.out.printf("Счет списания: #%s; %.2f руб.\n.Счет зачисления: #%s; %.2f руб.\n",
                    from.getData(), from.getAmount(), to.getData(), to.getAmount());

            from.setAmount(from.getAmount() - amount);
            to.setAmount(to.getAmount() + amount);

            System.out.println("Текущее состояние счетов: ");
            System.out.println(from);
            System.out.println(to);

        }
        else {
            System.out.println("Операция невозможна, недостаточно средств на счете списания.");
        }
    }

}