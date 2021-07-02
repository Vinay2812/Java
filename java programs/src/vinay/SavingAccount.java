package vinay;
public class SavingAccount{
    static double annualInterestRate=0.04;
    private double savingBalance;

    public double getSavingBalance() {
        return savingBalance;
    }

    public SavingAccount(int s){
        savingBalance=s;
    }
    public double calculateMonthlyInterest(){
        double MI =  (savingBalance*annualInterestRate)/12;
        savingBalance+=MI;
        return MI;
    }
    public static void modifyInterestRate(double i){
        annualInterestRate=i;
    }
    public static void main(String[] args) {
          SavingAccount saver1 = new SavingAccount(2000);
          SavingAccount saver2 = new SavingAccount(3000);
        System.out.println("User 1 old balance is : "+saver1.getSavingBalance()+" User 1 new balance is : "+(saver1.getSavingBalance()+saver1.calculateMonthlyInterest()));
        System.out.println("User 2 old balance is : "+saver2.getSavingBalance()+" User 2 new balance is : "+(saver2.getSavingBalance()+saver2.calculateMonthlyInterest()));

        System.out.println("Updating Annual Interest Rate....");
        modifyInterestRate(0.05);

        System.out.println("After updating Annual Interest rate ");

        System.out.println("User 1 old balance is : "+saver1.getSavingBalance()+" User 1 new balance is : "+(saver1.getSavingBalance()+saver1.calculateMonthlyInterest()));
        System.out.println("User 2 old balance is : "+saver2.getSavingBalance()+" User 2 new balance is : "+(saver2.getSavingBalance()+saver2.calculateMonthlyInterest()));
    }
}