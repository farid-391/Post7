package com.example.post7;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Tab2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Tab2 extends Fragment {
    private EditText jariJari;
    private EditText tinggi;
    private TextView tampilLuas;
    private TextView tampilVolume;
    private Button btn;
    String textJari, textTinggi;
    Double phi, r, t, volume, luas;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Object Button;

    public Tab2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Tab2.
     */
    // TODO: Rename and change types and number of parameters
    public static Tab2 newInstance(String param1, String param2) {
        Tab2 fragment = new Tab2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab2, container, false);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onViewCreated(@NonNull View view,Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        jariJari = (EditText)view.findViewById(R.id.in_r);
        tinggi = (EditText)view.findViewById(R.id.in_t);
        tampilLuas = (TextView)view.findViewById(R.id.tv_hasillp);
        tampilVolume = (TextView)view.findViewById(R.id.tv_hasilv);
        btn = (Button)view.findViewById(R.id.btn_hitung);

        btn.setOnClickListener(v -> {
            textJari=jariJari.getText().toString();
            textTinggi=tinggi.getText().toString();;
            if(TextUtils.isEmpty(textJari)){
                jariJari.setError("Jari-jari tidak boleh kosong!");
            }else if(TextUtils.isEmpty(textTinggi)){
                tinggi.setError("Tinggi tidak boleh kosong!");
            }else{
                phi = 3.14;
                r = Double.parseDouble(jariJari.getText().toString());
                t = Double.parseDouble(tinggi.getText().toString());
                luas = 2*phi*r*(r+t);
                volume = phi*r*r*t;
                tampilLuas.setText(Double.toString(luas));
                tampilVolume.setText(Double.toString(volume));
            }
        });
    }
}