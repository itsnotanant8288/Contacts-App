package android.example.contactsapp;

import android.example.contactsapp.ContactsAdapter;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.contactsapp.R;

import java.util.ArrayList;
import java.util.List;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        final List<android.example.contactsapp.ContactsModel> family = new ArrayList<>();
        family.add(new android.example.contactsapp.ContactsModel("A","abc@gmail.com","9826734891",R.drawable.fam));
        family.add(new android.example.contactsapp.ContactsModel("B","abc@gmail.com","9826734891",R.drawable.fam));
        family.add(new android.example.contactsapp.ContactsModel("C","abc@gmail.com","9826734891",R.drawable.fam));
        family.add(new android.example.contactsapp.ContactsModel("D","abc@gmail.com","9826734891",R.drawable.fam));
        family.add(new android.example.contactsapp.ContactsModel("E","abc@gmail.com","9826734891",R.drawable.fam));
        family.add(new android.example.contactsapp.ContactsModel("F","abc@gmail.com","9826734891",R.drawable.fam));
        family.add(new android.example.contactsapp.ContactsModel("G","abc@gmail.com","9826734891",R.drawable.fam));
        family.add(new android.example.contactsapp.ContactsModel("H","abc@gmail.com","9826734891",R.drawable.fam));
        family.add(new android.example.contactsapp.ContactsModel("I","abc@gmail.com","9826734891",R.drawable.fam));
        family.add(new android.example.contactsapp.ContactsModel("J","abc@gmail.com","9826734891",R.drawable.fam));

        RecyclerView family_recyclerView = findViewById(R.id.recyclerView3);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        family_recyclerView.setLayoutManager(layoutManager);

        android.example.contactsapp.ContactsAdapter contactAdapter = new ContactsAdapter(this,family,R.color.category_family);
        family_recyclerView.setAdapter(contactAdapter);
    }


}