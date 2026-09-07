public class Member {
    //Task number 1
    private String idNumber;
    private String name;
    private int borrowingLimit;
    private int loanAmount;

    public Member(String idNumber, String name, int borrowingLimit) {
        this.idNumber = idNumber;
        this.name = name;
        this.borrowingLimit = borrowingLimit;
        this.loanAmount = 0; 
    }
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
    public String getIdNumber() {
        return idNumber;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }
    public String getName() {
        return name;
    }

    
    public int getLimitLoan() {
        return borrowingLimit;
    }

    public void setLimitLoan(int borrowingLimit) {
        this.borrowingLimit = borrowingLimit;
    }

    public int getLoanAmount() {
        return loanAmount;
    }
    public void borrow(int amount){
        loan(amount);
    }

    public void loan(int amount){
        if( this.loanAmount + amount <= this.borrowingLimit){
            this.loanAmount += amount;
        } else {
            System.out.println("Sorry, the loan amount exceeds the limit.");
        }
    }

    //Task number 2
    public void installment(int amount){
        double minimumInstallment = 0.10 * loanAmount;
        
        if (amount < minimumInstallment){
            System.out.println("Sorry, the installment must be 10% of the loan amount.");
        } else if (amount > loanAmount){
            this.loanAmount = 0;
        } else {
            this.loanAmount -= amount;
        }
    }

    public void Installment(int amount){
        installment(amount);
    }


}
