package com.example.anshuman.viewmodel;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.anshuman.viewmodel.ViewModel.MyViewModel;

public class MainActivity extends AppCompatActivity {
    private MyViewModel myViewModel;
    EditText number;
    TextView text;
    Button submit_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myViewModel= ViewModelProviders.of(this).get(MyViewModel.class);
        number=findViewById(R.id.input_number);
        text=findViewById(R.id.text);
        submit_button=findViewById(R.id.submit_button);
        Toast.makeText(this,myViewModel.number, Toast.LENGTH_SHORT).show();
        text.setText(myViewModel.getNumber());


    }

    public void submit(View view) {
        String num=number.getText().toString();
        myViewModel.setNumber(num);
        Toast.makeText(this, myViewModel.getNumber(), Toast.LENGTH_SHORT).show();
        text.setText(myViewModel.getNumber());
    }
}
