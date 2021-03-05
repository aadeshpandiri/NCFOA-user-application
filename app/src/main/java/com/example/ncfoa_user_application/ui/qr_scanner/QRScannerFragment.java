package com.example.ncfoa_user_application.ui.qr_scanner;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;


import com.example.ncfoa_user_application.R;

public class QRScannerFragment extends Fragment {
    Button scanbtn;
    public static TextView scantext;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View RootView = inflater.inflate(R.layout.fragment_qr_scanner, container, false);

        TextView scantext=(TextView) RootView.findViewById(R.id.scantext);
        Button scanbtn= (Button) RootView.findViewById(R.id.scanbtn);

        scanbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), QRScannerViewActivity.class);
                startActivity(intent);
            }
        });

        return RootView;
    }

}