package com.christianlopez.hwk_4_bank_ver_2;


import android.content.Intent;
import android.content.res.Configuration;
import android.media.VolumeShaper;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class AccountListActivity extends AppCompatActivity implements ListViewAccountFrag.selectAccountCallBack {
    private ListView lv;
    private String acctname;
    private String bal;
    private DetailAccountFrag DAF;
    private BankAccount b;
    private EditText Et1;
    private EditText Et2;
    private String bb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accountlistactivity);


        FragmentManager fm = this.getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.accountListframe, new ListViewAccountFrag());
        ft.commit();


        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            DAF = new DetailAccountFrag();
            ft.add(R.id.frame2, DAF);
            //ft.commit();
        }

    }

    public void onClickeddAccount(BankAccount b) {
       DAF.onSelectedAccountSetValues(b);

    }
}

