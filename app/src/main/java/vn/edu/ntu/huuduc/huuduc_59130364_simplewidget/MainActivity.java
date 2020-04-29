package vn.edu.ntu.huuduc.huuduc_59130364_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.security.cert.Extension;

public class MainActivity extends AppCompatActivity {

    EditText edtten, edttuoi, edtST;
    Button btnXN;
    RadioGroup rdgchonGT;
    CheckBox cb1, cb2, cb3, cb4 ,cb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        addEvents();
    }
    private void addView(){
        edtten = findViewById(R.id.edtten);
        edttuoi = findViewById(R.id.edttuoi);
        edtST = findViewById(R.id.edtST);
        rdgchonGT = findViewById(R.id.rdgchonGT);
        btnXN = findViewById(R.id.btnXN);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);
        cb5 = findViewById(R.id.cb5);
    }
    private void addEvents(){
        btnXN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.btnXN) {
                    String ten = edtten.getText() + "";
                    String tuoi = edttuoi.getText() + "";
                    ten = ten.trim();
                    tuoi = tuoi.trim();
                    Toast.makeText(MainActivity.this, ten, Toast.LENGTH_LONG).show();
                    Toast.makeText(MainActivity.this, tuoi, Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
