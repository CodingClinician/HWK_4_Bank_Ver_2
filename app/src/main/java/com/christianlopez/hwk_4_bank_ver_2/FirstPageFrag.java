package com.christianlopez.hwk_4_bank_ver_2;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class FirstPageFrag extends Fragment {
//// why am i having a problem with image button  check folder in res files
    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.firstpagefrag, container, false);        ////????
        ConstraintLayout c = (ConstraintLayout) v.findViewById(R.id.firstpagefrag);

        ImageButton ib1 = (ImageButton) v.findViewById(R.id.firstpagefragbutton);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), AccountListActivity.class);     // intent
                startActivity(i);
            }


        });

        ImageButton ib2  = (ImageButton) v.findViewById(R.id.appinfobutton);    // need to do app info stuff before listener
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), AppInfoActivity.class);
                startActivity(i);
            }
        });
        return v;

    }
}
