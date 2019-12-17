package com.christianlopez.hwk_4_bank_ver_2;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAccountFrag extends Fragment {
    private ListView lv;
    private selectAccountCallBack callBack;
    private TextView et1;



    public ListViewAccountFrag() {
    }       /// CONSTRUCTOR

    // INTERFACE
    public interface selectAccountCallBack {
        void onClickeddAccount(BankAccount b);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            callBack = (selectAccountCallBack) context;      /// call the interface assigning the callback
        }
        catch (Exception e) {}
    }

    // This is the onCreate
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.viewlist, container, false);
        {
            ConstraintLayout c = (ConstraintLayout) v.findViewById(R.id.vl);
            lv = v.findViewById(R.id.acctgroup);

            Button b = (Button) v.findViewById(R.id.addaccountbutton);
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(getActivity(), AddAccountActivity.class);     // intent       copy this intent to the thing below and call detail account
                    startActivity(i);

                }
            });

            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    BankAccount b;
                    b = (BankAccount) adapterView.getItemAtPosition(i);

                    // If the device is in portrait the start add account activity
                    if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {


                        //BankAccount ba = BankAccountList.getInstance().getAccountByName(b).toString();      // get the selected instance of bankaccount from the arralist

                        Intent intent = new Intent(getActivity(), AccountDetailActivity.class);
                        intent.putExtra("acct", b.getAcctName());  /// bank account iinstance tostring
                        intent.putExtra("bal", b.getAcctBalance());
                        startActivity(intent);  // send intent directly to AccountDetailActivity
                    }
                    else
                    {
                        // else populate the detail fragment***use an intent to call the detail account frag****
                        callBack.onClickeddAccount(b); // will this even work  pass this data to the AccountListActivity from here     /// having trouble here;

                    }


                }
            });
        }
        return v;
    }


    @Override

    public void onResume() {
        super.onResume();

        /// click listener is here

        lv.findViewById(R.id.acctgroup);
        final ArrayList<BankAccount> bankAccountArrayList = BankAccountList.getInstance().getInternalList();
        final ArrayAdapter<BankAccount> accountArrayAdapter = new ArrayAdapter<BankAccount>(getActivity(), R.layout.groupofaccountstextview, bankAccountArrayList);
        lv.setAdapter(accountArrayAdapter);
        accountArrayAdapter.notifyDataSetChanged();

    }
}


