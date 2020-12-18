package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class ThirdActivity extends AppCompatActivity {


    String[] currencies_eu = {"Євро EUR", "Фунт Стерлінгів GBP", "Крона DKK", "Гривня UAH", "Злотий PLN"};

    TextView result_field_eu;
    TextView amount_input_eu;
    TextView res_text_eu;

    public Button convert_eu_button;


    String from_currency_eu = "";
    String to_currency_eu = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        convert_eu_button = findViewById(R.id.convert_eu_button);

        res_text_eu = findViewById(R.id.res_text_eu);

        Spinner spinner_from_eu = (Spinner) findViewById(R.id.currencies_from_spinner_eu);
        ArrayAdapter<String> adapter_from_eu = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, currencies_eu);
        adapter_from_eu.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_from_eu.setAdapter(adapter_from_eu);

        Spinner spinner_to_eu = (Spinner) findViewById(R.id.currencies_to_spinner_eu);
        ArrayAdapter<String> adapter_to_eu = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, currencies_eu);
        adapter_to_eu.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_to_eu.setAdapter(adapter_to_eu);


        spinner_from_eu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                from_currency_eu = spinner_from_eu.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) { }
        });

        spinner_to_eu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                to_currency_eu = spinner_from_eu.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {}
        });
    }

    public void onOperationClick_eu(View view){
        result_field_eu = (EditText) findViewById(R.id.result_field_eu);
        amount_input_eu = (EditText)findViewById(R.id.amount_input_eu);

        String amount = amount_input_eu.getText().toString();
        if(amount.length()>0){
            try{
                performOperation_eu(Double.valueOf(amount));
            }catch (NumberFormatException ex){
                amount_input_eu.setText("");
            }
        }
    }

    private void performOperation_eu(double amount){
        double result = 0;

        if (from_currency_eu == "Євро EUR" && to_currency_eu =="Євро EUR"){
            result = amount;
        }
        else if (from_currency_eu == "Євро EUR" && to_currency_eu =="Фунт Стерлінгів GBP"){
            result = amount * 0.9;
        }
        else if (from_currency_eu == "Євро EUR" && to_currency_eu =="Крона DKK"){
            result = amount * 26.2;
        }
        else if (from_currency_eu == "Євро EUR" && to_currency_eu =="Гривня UAH"){
            result = amount * 33.9;
        }
        else if (from_currency_eu == "Євро EUR" && to_currency_eu =="Злотий PLN"){
            result = amount * 4.43;
        }


        else if (from_currency_eu == "Фунт Стерлінгів GBP" && to_currency_eu =="Євро EUR"){
            result = amount * 1.11;
        }
        else if (from_currency_eu == "Фунт Стерлінгів GBP" && to_currency_eu =="Фунт Стерлінгів GBP"){
            result = amount;
        }
        else if (from_currency_eu == "Фунт Стерлінгів GBP" && to_currency_eu =="Крона DKK"){
            result = amount * 29.09;
        }
        else if (from_currency_eu == "Фунт Стерлінгів GBP" && to_currency_eu =="Гривня UAH"){
            result = amount * 37.64;
        }
        else if (from_currency_eu == "Фунт Стерлінгів GBP" && to_currency_eu =="Злотий PLN"){
            result = amount * 4.92;
        }


        else if (from_currency_eu == "Крона DKK" && to_currency_eu =="Євро EUR"){
            result = amount * 0.038;
        }
        else if (from_currency_eu == "Крона DKK" && to_currency_eu =="Фунт Стерлінгів GBP"){
            result = amount * 0.034;
        }
        else if (from_currency_eu == "Крона DKK" && to_currency_eu =="Крона DKK"){
            result = amount;
        }
        else if (from_currency_eu == "Крона DKK" && to_currency_eu =="Гривня UAH"){
            result = amount * 1.29;
        }
        else if (from_currency_eu == "Крона DKK" && to_currency_eu =="Злотий PLN"){
            result = amount * 0.17;
        }


        else if (from_currency_eu == "Гривня UAH" && to_currency_eu =="Євро EUR"){
            result = amount * 0.029;
        }
        else if (from_currency_eu == "Гривня UAH" && to_currency_eu =="Фунт Стерлінгів GBP"){
            result = amount * 0.027;
        }
        else if (from_currency_eu == "Гривня UAH" && to_currency_eu =="Крона DKK"){
            result = amount * 0.77;
        }
        else if (from_currency_eu == "Гривня UAH" && to_currency_eu =="Гривня UAH"){
            result = amount;
        }
        else if (from_currency_eu == "Гривня UAH" && to_currency_eu =="Злотий PLN"){
            result = amount * 0.13;
        }


        else if (from_currency_eu == "Злотий PLN" && to_currency_eu =="Євро EUR"){
            result = amount * 0.23;
        }
        else if (from_currency_eu == "Злотий PLN" && to_currency_eu =="Фунт Стерлінгів GBP"){
            result = amount * 0.2;
        }
        else if (from_currency_eu == "Злотий PLN" && to_currency_eu =="Крона DKK"){
            result = amount * 5.92;
        }
        else if (from_currency_eu == "Злотий PLN" && to_currency_eu =="Гривня UAH"){
            result = amount * 7.65;
        }
        else if (from_currency_eu == "Злотий PLN" && to_currency_eu =="Злотий PLN"){
            result = amount;
        }

        result_field_eu.setText(Double.toString(result));

}
}
