package com.christianlopez.hwk_4_bank_ver_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

public class AccountDetailActivity extends AppCompatActivity {
private String ba;
private static final String selected_position = "position";
private int mPosition;
private TextView et1;

    public void onClickeddAccount(BankAccount b)
    {
        String accountSelected = getIntent().getStringExtra("acct"); // getting the passed intent bundle of data
    }



    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accountdetailactivity);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.accountdispfragment, new DetailAccountFrag());
        ft.commit();
    }

    @Override
    protected void onSaveInstanceState(final  Bundle outState)
    {
        super.onSaveInstanceState(outState);
        outState.putInt(selected_position, mPosition);
    }

    @Override
    protected void onRestoreInstanceState(final Bundle savedInstanceState)
    {
        super.onRestoreInstanceState(savedInstanceState);
        mPosition = savedInstanceState.getInt(selected_position);
    }
}
