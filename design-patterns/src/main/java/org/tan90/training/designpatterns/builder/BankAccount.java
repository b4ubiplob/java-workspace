package org.tan90.training.designpatterns.builder;

public class BankAccount {
    
    private long accountNumber;
    private String owner;
    private String branch;
    private double balance;
    private double interestRate;
    
    
    public static class Builder {
        
        private long accountNumber;
        private String owner;
        private String branch;
        private double balance;
        private double interestRate;
        
        
        public Builder(long accountNumber) {
            this.accountNumber = accountNumber;
        }
        
        public Builder withOwner(String owner) {
            this.owner = owner;
            return this;
        }
        
        public Builder atBranch(String branch) {
            this.branch = branch;
            return this;
        }
        
        public Builder openingBalance(double balance) {
            this.balance = balance;
            return this;
        }
        
        public Builder atRate(double interestRate) {
            this.interestRate = interestRate;
            return this;
        }
        
        public BankAccount build() {
            BankAccount bankAccount = new BankAccount();
            bankAccount.accountNumber = this.accountNumber;
            bankAccount.balance = this.balance;
            bankAccount.branch = this.branch;
            bankAccount.interestRate = this.interestRate;
            bankAccount.owner = this.owner;
            return bankAccount;
        }
    }

    private BankAccount() {
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public String getBranch() {
        return branch;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

}
