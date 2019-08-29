package br.com.etecia.appviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView lblResposta;
    EditText txtValor1, txtValor2;
    Button btnSomar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtValor1 = (EditText) findViewById(R.id.txtValor1);
        txtValor2 = (EditText) findViewById(R.id.txtValor2);
        lblResposta = (TextView) findViewById(R.id.lblResposta);

        btnSomar = (Button) findViewById(R.id.btnSomar);

        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double resp = 0;
                String num1 = txtValor1.getText().toString();
                String num2 = txtValor2.getText().toString();
                resp = Double.parseDouble(num1) + Double.parseDouble(num2);
                lblResposta.setText(String.valueOf(resp));
            }
        });
    }
}
