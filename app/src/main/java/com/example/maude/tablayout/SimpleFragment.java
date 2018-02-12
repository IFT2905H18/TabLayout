package com.example.maude.tablayout;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Maude on 2018-02-11.
 */

public class SimpleFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.simple_fragment, container, false);
        TextView text = v.findViewById(R.id.txtview);

        Bundle args = getArguments();
        int fragmentid = args.getInt("ID");
        text.setText(" Fragment " + fragmentid);

       return v;

    }
}
