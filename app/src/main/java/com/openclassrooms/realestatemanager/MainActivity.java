package com.openclassrooms.realestatemanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewMain;
    private TextView textViewQuantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ligne avant correction
        // this.textViewMain = findViewById(R.id.activity_second_activity_text_view_main);

        // Ligne après correction - Erreur en faisant appel à un composant du layout activity_second alors que nous sommes dans le Main cativity avec comme layout activity_main
        this.textViewMain = findViewById(R.id.activity_main_activity_text_view_main);
        this.textViewQuantity = findViewById(R.id.activity_main_activity_text_view_quantity);

        this.configureTextViewMain();
        this.configureTextViewQuantity();
    }

    private void configureTextViewMain(){
        this.textViewMain.setTextSize(15);
        this.textViewMain.setText("Le premier bien immobilier enregistré vaut ");
    }

    private void configureTextViewQuantity(){
        int quantity = Utils.convertDollarToEuro(100);
        this.textViewQuantity.setTextSize(20);

        // Ligne avant correction
        // this.textViewQuantity.setText(quantity);

        // Ligne après correction - Méthode setText attend une valeur de type String alors que quantity est un entier
        this.textViewQuantity.setText(String.valueOf(quantity));
    }
}
