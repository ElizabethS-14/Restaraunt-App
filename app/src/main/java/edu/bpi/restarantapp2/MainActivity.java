package edu.bpi.restarantapp2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button Menu;

    TextView Name;

    TextView Hours;

    TextView Info;

    TextView Phone;

    TextView Address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Menu = (Button) findViewById(R.id.Menu);
        Name = (TextView) findViewById(R.id.Name);
        Hours = (TextView) findViewById(R.id.Hours);
        Info = (TextView) findViewById(R.id.Info);
        Phone = (TextView) findViewById(R.id.Phone);
        Address = (TextView) findViewById(R.id.Address);

        Menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Menu.class);
                startActivity(intent);
            }
        });

        Phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPhonePad();
            }
        });

        Address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMap();
            }
        });
    }

    private void openPhonePad(){
        String phoneNumber = "4438640934";
        //the Intent is the messenger and ACTION_DIAL basically says I want to dial a phone number
        Intent dailIntent = new Intent(Intent.ACTION_DIAL);
        //gives the intent the phone #
        dailIntent.setData(Uri.parse(phoneNumber));
        startActivity(dailIntent);
    }

    private void openMap(){
        Uri location = Uri.parse("geo:0,0?q=600+E+Pratt+St,+Baltimore,+Maryland");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }
}