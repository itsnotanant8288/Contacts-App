package com.example.contactsapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.contactsapp.R;

import java.util.ArrayList;
import java.util.List;

import static android.os.Build.VERSION_CODES.R;

public class WorkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.contactsapp.R.layout.activity_work);

        final List<android.example.contactsapp.ContactsModel> work = new ArrayList<>();
        work.add(new android.example.contactsapp.ContactsModel("A","xyz@gmail.com","6749382906", com.example.contactsapp.R.drawable.work));
        work.add(new android.example.contactsapp.ContactsModel("B","xyz@gmail.com","6749382906",com.example.contactsapp.R.drawable.work));
        work.add(new android.example.contactsapp.ContactsModel("C","xyz@gmail.com","6749382906",com.example.contactsapp.R.drawable.work));
        work.add(new android.example.contactsapp.ContactsModel("D","xyz@gmail.com","6749382906",com.example.contactsapp.R.drawable.work));
        work.add(new android.example.contactsapp.ContactsModel("E","xyz@gmail.com","6749382906",com.example.contactsapp.R.drawable.work));
        work.add(new android.example.contactsapp.ContactsModel("F","xyz@gmail.com","6749382906",com.example.contactsapp.R.drawable.work));
        work.add(new android.example.contactsapp.ContactsModel("G","xyz@gmail.com","6749382906",com.example.contactsapp.R.drawable.work));
        work.add(new android.example.contactsapp.ContactsModel("H","xyz@gmail.com","6749382906",com.example.contactsapp.R.drawable.work));
        work.add(new android.example.contactsapp.ContactsModel("I","xyz@gmail.com","6749382906",com.example.contactsapp.R.drawable.work));
        work.add(new android.example.contactsapp.ContactsModel("J","xyz@gmail.com","6749382906",com.example.contactsapp.R.drawable.work));


        RecyclerView work_recyclerView = findViewById(com.example.contactsapp.R.id.recyclerView1);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        work_recyclerView.setLayoutManager(layoutManager);

        android.example.contactsapp.ContactsAdapter
                contactAdapter = new android.example.contactsapp.ContactsAdapter(this,work,com.example.contactsapp.R.color.category_work);
        work_recyclerView.setAdapter(contactAdapter);

    }




}