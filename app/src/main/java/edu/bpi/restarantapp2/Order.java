package edu.bpi.restarantapp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Order extends AppCompatActivity {

    TextView Food;
    TextView Costs;

    Button BackM;
    Button Confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_order);

        Food = findViewById(R.id.Food);
        Costs = findViewById(R.id.Costs);
        BackM = findViewById(R.id.BackM);
        Confirm = findViewById(R.id.Confirm);

        Intent intent = getIntent();
        int q1 = intent.getIntExtra("q1", 0);
        int q2 = intent.getIntExtra("q2", 0);
        int q3 = intent.getIntExtra("q3", 0);
        int q4 = intent.getIntExtra("q4", 0);
        int q5 = intent.getIntExtra("q5", 0);

        displayOrder(q1,q2,q3,q4,q5);

        BackM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Order.this, Menu.class);
                startActivity(intent);
            }
        });
    }

    private void displayOrder(int q1,int q2,int q3,int q4,int q5){
        double price1 = 32.79;
        double price2 = 22.50;
        double price3 = 16.50;
        double price4 = 3.00;
        double price5 = 2.50;

        double subtotal = 0.0;
        double total = 0.0;

        String Name1 = "Crab Stuffed Salmon - $32.79 ";
        String Name2 = "Lobster Tail with Butter - $22.50";
        String Name3 = "Garlic Shrimp - $16.50";
        String Name4 = "Side of Fries - $3.00";
        String Name5 = "Mixed Fruit - $2.50";

         Costs.setText(q1 + " x " + Name1 +"\n"+ q2 + "x " + Name2 +"\n"+ q3 + "x " + Name3 +"\n" + q4 + "x " + Name4 +"\n" + q5 + "x " + Name5);
    }
}