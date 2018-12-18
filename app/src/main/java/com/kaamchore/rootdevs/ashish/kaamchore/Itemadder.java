package com.kaamchore.rootdevs.ashish.kaamchore;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Itemadder extends Fragment {


    private TextView textView;
    private Button plus, minus, remove;
    private int count = 1;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        return inflater.inflate(R.layout.fragment_itemadder, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView = (TextView)view.findViewById(R.id.countertext);
        plus = (Button) view.findViewById(R.id.plus);
        minus = (Button) view.findViewById(R.id.minus);
        remove = (Button)view.findViewById(R.id.remove);
        final Fragment currentFragment = getActivity().getSupportFragmentManager().findFragmentByTag("some tag1");

        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getFragmentManager().beginTransaction().remove(currentFragment).commitAllowingStateLoss();



            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                textView.setText(count+"");
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count > 1){
                    count--;
                    textView.setText(count+"");
                }

            }
        });

    }





}
