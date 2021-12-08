package com.example.marketlist.controller;

import static com.example.marketlist.controller.MainActivity.mMarketList;
import static com.example.marketlist.controller.MainActivity.mMarketListAdapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.marketlist.R;
import com.example.marketlist.model.Market;


public class EditActivity extends AppCompatActivity {

    public EditText mName;
    public EditText mAdress;
    public EditText mPhone;
    public Spinner mCountry;
    public Button mButton;

    public String pName;
    public String pAdress;
    public String pPhone;
    public String pCountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        mName = findViewById(R.id.activity_edit_name_editview);
        mAdress = findViewById(R.id.activity_edit_adress_editview);
        mPhone = findViewById(R.id.activity_edit_phone_editview);
        mCountry = findViewById(R.id.activity_edit_country_spinner);
        mButton = findViewById(R.id.activity_edit_add_button);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.country_array, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        mCountry.setAdapter(adapter);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pName = String.valueOf(mName.getText());
                pAdress = String.valueOf(mAdress.getText());
                pPhone = String.valueOf(mPhone.getText());
                pCountry = (String) mCountry.getSelectedItem();

                int size = mMarketList.getMarketList().size();

                Market newMarket = new Market(size, pName, pAdress, pPhone, pCountry);

                //System.out.println(mMarketList.getMarketList());

                mMarketList.getMarketList().add(newMarket);

                //System.out.println(mMarketList.getMarketList());

                //refresh the list
                mMarketListAdapter.notifyItemChanged(size);

                //close market editor
                finish();
            }
        });

    }
}