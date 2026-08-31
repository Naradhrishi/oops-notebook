class Main{
   public static void main(String[] args) {
        BankAccount obj = new BankAccount("Naradhrishi", 1000.0f);
        System.out.println(obj.getName());
        System.out.println("Current balance : " + obj.getBalance());
        
        obj.deposit(-33.2f);
        obj.withdraw(1000000.0f);
        if(obj.setName("Naradhrishi Kumar")){
            System.out.println("Name changed to : " + obj.getName());
        }
        obj.deposit(50000.0f);
        
        System.out.println(obj.getName());
        System.out.println("Current balance : " + obj.getBalance());


   }
}

class BankAccount{
    private String name;
    private float balance;

    BankAccount(String name, float initialBalance){
        if(!name.equals("")){
            this.name = name;
        }else{
            this.name = "Unknown Account Holder";
        }

        if(initialBalance < 0.0){
            this.balance = 0;
        }else{
            this.balance = initialBalance;
        }
    }


    public float getBalance() {
        return balance;
    }

    public void deposit(float depositBalance) {
        if(depositBalance < 0.0){
            System.out.println("Deposit amount must be positive!");
        }else{
            this.balance += depositBalance;
        }
    }

    public void withdraw(float amount){
        if(amount < 0.0){
            System.out.println("Withdraw amount must be postive!");
        }else{
            if(this.balance < amount){
                System.out.println("Insufficient balance!");
            }else{
                this.balance -= amount;
            }
        }
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if(!name.equals("") && !name.equals(this.name)){
            this.name = name;
            return true;
        }
        return false;
    }

}