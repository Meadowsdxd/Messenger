package com.example.messenger;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class Chat_Activity extends AppCompatActivity {
    private final List<Messages> items = new ArrayList<>();
    private final RecyclerView.Adapter adapter = new ChatAdapter(this.items);
    EditText edit;
    MainAdapter myCardAdapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        recyclerView = findViewById(R.id.RVChat);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);


        this.items.add(new Messages(String.valueOf(getIntent().getSerializableExtra("id"))));
        adapter.notifyItemInserted(this.items.size() - 1);
    }
}