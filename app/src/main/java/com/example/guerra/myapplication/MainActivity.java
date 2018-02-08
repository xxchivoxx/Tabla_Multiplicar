package com.example.guerra.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
Button btnCalcular;
EditText edtNum;
TextView txtTabla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCalcular=findViewById(R.id.btnCalcular);
        edtNum=findViewById(R.id.edtNum);
        txtTabla=findViewById(R.id.txtTabla);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num_tempo= Integer.parseInt(edtNum.getText().toString());
                txtTabla.setText(fnCalcularTabla(num_tempo));
            }
        });
    }
    public String fnCalcularTabla(int num){
        String res="";
        for(int i=1;i<=10;i++){
            res+=""+num+"x"+i+"="+(i*num)+"\n";
        }
        return res;
    }
}
