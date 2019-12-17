package com.christianlopez.hwk_4_bank_ver_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import static android.app.Activity.RESULT_OK;
import static android.content.Intent.getIntent;
import static android.content.Intent.getIntentOld;

public class DetailAccountFrag extends Fragment {
private EditText et1;
private EditText et2;
private View vv;
DetailAccountFrag DAF;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {



         vv = inflater.inflate(R.layout.detailaccount, container, false);
        et1 = (EditText) vv.findViewById(R.id.accountypedisplay);

        et2 = (EditText) vv.findViewById(R.id.balancedisplay);

        Intent i = getActivity().getIntent();
        String account = i.getStringExtra("acct");
        String balance = i.getStringExtra("bal");

        if(account!=null)
        {
            et1.setText(account);

              et2.setText(balance);
            }
        return vv;
    }
        /// need to fix setting the text in the edit text
    public void onSelectedAccountSetValues (BankAccount b)
    {

        et1.setText(b.getAcctName());
       et2.setText(b.getAcctBalance());
    }
}

