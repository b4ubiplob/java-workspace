package org.tan90.training.designpatterns.builder;

public class BuilderTest {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount.Builder(1234L).atBranch("bangalore").atRate(3.8).openingBalance(1000).withOwner("biplob")
                .build();

        System.out.println(bankAccount.getOwner());
    }

}
