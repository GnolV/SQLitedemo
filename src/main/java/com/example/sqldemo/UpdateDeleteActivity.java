package com.example.sqldemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.sqldemo.adapter.ViewPagerAdapter;
import com.example.sqldemo.model.Item;

public class UpdateDeleteActivity extends AppCompatActivity implements View.OnClickListener {
    public Spinner sp;
    private EditText eTitle, ePrice, eDate;
    private Button btUpdate, btRemove, btBack;
    private Item item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_delete);
        initView();
        btUpdate.setOnClickListener(this);
        btBack.setOnClickListener(this);
        btRemove.setOnClickListener(this);
        eDate.setOnClickListener(this);
        Intent intent = getIntent();
        item = (Item) intent.getSerializableExtra("item");
        eTitle.setText(item.getTitle());
        ePrice.setText(item.getPrice());
        eDate.setText(item.getDate());
        int p = 0;
        for (int i=0; i<sp.getCount(); i++) {
            if (sp.getItemAtPosition(i).toString().equalsIgnoreCase(item.getCategory())) {
                p = i;
                break;
            }
        }
    }

    private void initView() {
        sp = findViewById(R.id.spCategory);
        eTitle = findViewById(R.id.eTitle);
        ePrice = findViewById(R.id.ePrice);
        eDate = findViewById(R.id.eDate);
        btUpdate = findViewById(R.id.btUpdate);
        btRemove = findViewById(R.id.btRemove);
        btBack = findViewById(R.id.btBack);
        sp.setAdapter(new ArrayAdapter<String>(this, R.layout.item_spinner,
                getResources().getStringArray(R.array.category)));
    }

    @Override
    public void onClick(View view) {
        
    }
}