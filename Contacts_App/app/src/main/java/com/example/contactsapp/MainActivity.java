package android.example.contactsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.contactsapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView work = findViewById(R.id.work);
        work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.contactsapp.WorkActivity.class);
                startActivity(intent);
            }
        });

        TextView family = findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, android.example.contactsapp.FamilyActivity.class);
                startActivity(intent);
            }
        });

        TextView friends = findViewById(R.id.friends);
        friends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, android.example.contactsapp.FriendsActivity.class);
                startActivity(intent);
            }
        });
    }
}