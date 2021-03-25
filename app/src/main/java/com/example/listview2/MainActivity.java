package com.example.listview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    List<Person> persons;
    Button add, remove;
    ListAdapter listAdapter;
    ArrayList<String> selectedStrings = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        listView = findViewById(R.id.listView);
        add = findViewById(R.id.btn_add);
        remove = findViewById(R.id.btn_remove);
        persons = new ArrayList<>();
        listAdapter = new ListAdapter(this, persons, R.layout.listview);
        listView.setAdapter(listAdapter);
        add.setOnClickListener(v -> add());
    }

    private void add(){
        boolean check = true;
        EditText editText1 = findViewById(R.id.maSV);
        EditText editText2 = findViewById(R.id.hoTen);
        RadioButton rbNu = findViewById(R.id.btn_nu);
        RadioButton rbNam = findViewById(R.id.btn_nam);
        for (Person person : persons){
            if (editText1.getText().toString().equals(person.getMaSV())){
                check = false;
            }
        }

        if (check){
            if (rbNu.isChecked()) {
                persons.add(new Person(editText1.getText().toString(), editText2.getText().toString(), rbNu.getText().toString(), R.drawable.female));
            } else
                persons.add(new Person(editText1.getText().toString(), editText2.getText().toString(), rbNam.getText().toString(), R.drawable.male));

            ((ListAdapter) listView.getAdapter()).notifyDataSetChanged();
        }
    }

}