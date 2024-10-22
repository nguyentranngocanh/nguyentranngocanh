public class Account {
    public String id;
    public String name;
    public int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    String getId(){
        return id;
    }
    String getName(){
        return name;
    }
    int getBalance(){
        return balance;
    }
    int credit(int amount){
        return balance+=amount;
    }
    int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            return balance;
        }
        return amount;
    }
    public int transferTo(int amount, Account another){
        if(amount <= balance){
            another.balance += amount;
            balance -= amount;
        }
        else{
            System.out.println("Amount exceeded balance");
            return balance;
        }
        return balance;
    }
    public String toString(){
        return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}