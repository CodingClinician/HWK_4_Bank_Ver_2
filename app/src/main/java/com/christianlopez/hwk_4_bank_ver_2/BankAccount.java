package com.christianlopez.hwk_4_bank_ver_2;

/**
 * Created by toby6969 on 4/3/2018.
 */

public class BankAccount {
    private String acctName ="";
    private String acctBalance = "";

    public BankAccount() {      // default constructor
    }

    public BankAccount(String acctName, String acctBalance) {           // parametized constructor
        this.acctName = acctName;
        this.acctBalance = acctBalance;
    }

    // account name
    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    // balance
    public String getAcctBalance() {
        return acctBalance;
    }

    public void setAcctBalance(String bal) {
        this.acctBalance = acctBalance;
    }
    // deposit
        @Override
        public String toString()
        {
           return acctName;
        }
}