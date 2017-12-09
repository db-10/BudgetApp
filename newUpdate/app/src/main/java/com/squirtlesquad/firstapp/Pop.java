package com.squirtlesquad.firstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by romariomendoza on 11/18/17.
 */

public class Pop extends Activity {

    double budget;
    EditText newBudgetInput;
    Button submitB;
    TextView budgetView;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popbudget);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager(). getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));


        newBudgetInput = (EditText) findViewById(R.id.newBudgetInput);
        budgetView = (TextView) findViewById(R.id.budgetView);
        submitB= (Button) findViewById(R.id.submitB);

        submitB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                budget= Double.valueOf(newBudgetInput.getText().toString());
                budgetView.setText(String.valueOf(budget));

            }
        });

    }

    private  void showToast(String t)
    {

        Toast.makeText(Pop.this,t,Toast.LENGTH_SHORT).show();
    }

}
