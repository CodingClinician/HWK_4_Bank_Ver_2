package com.christianlopez.hwk_4_bank_ver_2;

import android.content.Intent;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

import static java.lang.String.format;
import static java.lang.String.valueOf;

/** SINGLETON
 * Created by toby6969 on 4/3/2018.
 */

public final class  BankAccountList extends BankAccount {

    private static BankAccountList accountList;     // instance of the singleton
    private ArrayList<BankAccount> bankAccountList = new ArrayList<>();     // array of BankAccounts
    private String accountName;
    private BankAccount bankAccount = new BankAccount();       /// calls a new instance of bank account         to fill in the list?
    private ArrayList<String> accounTypes = new ArrayList<>();


    public static BankAccountList getInstance() {
        if (accountList == null)
            accountList = new BankAccountList();        // Calls for a new instance of singleton?
        return accountList;
    }

    public ArrayList<BankAccount> getInternalList()     /// list of bankaccounts
    {
        return this.bankAccountList;       /// get internal list of BankAccount Objects
    }

    public BankAccount getAccountByName(String acct)        // will be used to populate the listview array?
    {
            BankAccount account = new BankAccount();

        return account;
    }


    public void addAccount(BankAccount e) {
        bankAccountList.add(e);
    }
}

