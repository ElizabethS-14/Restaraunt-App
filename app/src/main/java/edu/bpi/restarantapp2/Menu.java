package edu.bpi.restarantapp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Menu extends AppCompatActivity {

    TextView quant1;
    TextView quant2;
    TextView quant3;
    TextView quant4;
    TextView quant5;
    Button minus1;
    Button minus2;
    Button minus3;
    Button minus4;
    Button minus5;
    Button Order;
    Button Return;

    ImageView IV2;
    ImageView IV3;
    ImageView IV4;

    TextView side1;
    TextView side2;

    private int q1 = 0;
    private int q2 = 0;
    private int q3 = 0;
    private int q4 = 0;
    private int q5 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);

        Return = (Button) findViewById(R.id.Return);
        Order = (Button) findViewById(R.id.Order);
        quant1 = (TextView) findViewById(R.id.quant1);
        quant2 = (TextView) findViewById(R.id.quant2);
        quant3 = (TextView) findViewById(R.id.quant3);
        quant4 = (TextView) findViewById(R.id.quant4);
        quant5 = (TextView) findViewById(R.id.quant5);
        minus1 = (Button) findViewById(R.id.minus1);
        minus2 = (Button) findViewById(R.id.minus2);
        minus3 = (Button) findViewById(R.id.minus3);
        minus4 = (Button) findViewById(R.id.minus4);
        minus5 = (Button) findViewById(R.id.minus5);

        side1 = (TextView) findViewById(R.id.side1);
        side2 = (TextView) findViewById(R.id.side2);

        IV2 = (ImageView) findViewById(R.id.IV2);
        IV3 = (ImageView) findViewById(R.id.IV3);
        IV4 = (ImageView) findViewById(R.id.IV4);

        quant1.setText(String.valueOf(q1));
        quant2.setText(String.valueOf(q2));
        quant3.setText(String.valueOf(q3));
        quant4.setText(String.valueOf(q4));
        quant5.setText(String.valueOf(q5));

        Return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Order.class);

                intent.putExtra("q1", q1);
                intent.putExtra("q2", q2);
                intent.putExtra("q3", q3);
                intent.putExtra("q4", q4);
                intent.putExtra("q5", q5);

                startActivity(intent);
            }
        });

        minus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q1--;
                quant1.setText(String.valueOf(q1));
            }
        });

        minus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q2--;
                quant2.setText(String.valueOf(q2));
            }
        });

        minus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q3--;
                quant3.setText(String.valueOf(q3));
            }
        });

        minus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q4--;
                quant4.setText(String.valueOf(q4));
            }
        });

        minus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q5--;
                quant5.setText(String.valueOf(q5));
            }
        });

        IV2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q1++;
                quant1.setText(String.valueOf(q1));
            }
        });

        IV3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q2++;
                quant2.setText(String.valueOf(q2));
            }
        });

        IV4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q3++;
                quant3.setText(String.valueOf(q3));
            }
        });

        side1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q4++;
                quant4.setText(String.valueOf(q4));
            }
        });

        side2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q5++;
                quant5.setText(String.valueOf(q5));
            }
        });
    }
}