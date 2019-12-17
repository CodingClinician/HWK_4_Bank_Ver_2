package com.christianlopez.hwk_4_bank_ver_2;

import android.app.Fragment;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AppInfoFrag extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.appinfofrag, container,false );
        ConstraintLayout c = v.findViewById(R.id.appinfo);

        return v;

    }
}
