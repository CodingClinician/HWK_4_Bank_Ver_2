package com.christianlopez.hwk_4_bank_ver_2;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

import static android.app.Activity.RESULT_OK;

public class  AccountDetailFrag extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View vv = inflater.inflate(R.layout.accountdetailfrag, container, false);
        ConstraintLayout cl = vv.findViewById(R.id.accountdetail);
        final EditText et1 = vv.findViewById(R.id.accounttypeedittext);  // should be for account name  single conversion edit Text->String


        final EditText et2 = vv.findViewById(R.id.balanceedittext);   // should be for accout balance


        Button b = vv.findViewById(R.id.addaccountbutton); /// will need action listener to save the newly created account maybe to singleton bankaccout list???***
        // call a bank account instance to store new bank account
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                BankAccountList.getInstance().addAccount(new BankAccount(et1.getText().toString(), et2.getText().toString()));  // getting the bankaccount instance then ADDING it into the ARRAYLIST
                getActivity().finish();

            }


        });
        return vv;

    }
}
