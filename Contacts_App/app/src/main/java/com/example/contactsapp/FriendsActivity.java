package android.example.contactsapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.contactsapp.R;

import java.util.ArrayList;
import java.util.List;

public class FriendsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        final List<android.example.contactsapp.ContactsModel> friends = new ArrayList<>();
        friends.add(new android.example.contactsapp.ContactsModel("K","pqr@gmail.com","7278637498", R.drawable.frie));
        friends.add(new android.example.contactsapp.ContactsModel("L","pqr@gmail.com","7278637498",R.drawable.frie));
        friends.add(new android.example.contactsapp.ContactsModel("M","pqr@gmail.com","7278637498",R.drawable.frie));
        friends.add(new android.example.contactsapp.ContactsModel("N","pqr@gmail.com","7278637498",R.drawable.frie));
        friends.add(new android.example.contactsapp.ContactsModel("O","pqr@gmail.com","7278637498",R.drawable.frie));
        friends.add(new android.example.contactsapp.ContactsModel("N","pqr@gmail.com","7278637498",R.drawable.frie));
        friends.add(new android.example.contactsapp.ContactsModel("P","pqr@gmail.com","7278637498",R.drawable.frie));
        friends.add(new android.example.contactsapp.ContactsModel("Q","pqr@gmail.com","7278637498",R.drawable.frie));
        friends.add(new android.example.contactsapp.ContactsModel("R","pqr@gmail.com","7278637498",R.drawable.frie));
        friends.add(new android.example.contactsapp.ContactsModel("S","pqr@gmail.com","7278637498",R.drawable.frie));


        RecyclerView friends_recyclerView = findViewById(R.id.recyclerView2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        friends_recyclerView.setLayoutManager(layoutManager);

        android.example.contactsapp.ContactsAdapter contactAdapter = new android.example.contactsapp.ContactsAdapter(this,friends,R.color.category_friends);
        friends_recyclerView.setAdapter(contactAdapter);
    }
}