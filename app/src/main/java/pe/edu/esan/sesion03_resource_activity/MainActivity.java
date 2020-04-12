package pe.edu.esan.sesion03_resource_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnEnviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent accion = new Intent(getApplicationContext(),ResultActivity.class);

                EditText txtExaPar = (EditText) findViewById(R.id.txtExamenParcial);
                EditText txtExaFin = (EditText) findViewById(R.id.txtExamenFinal);
                EditText txtPEP = (EditText) findViewById(R.id.txtPromEvalPep);
                accion.putExtra("vExaPar",txtExaPar.getText().toString());
                accion.putExtra("vExaFin",txtExaFin.getText().toString());
                accion.putExtra("vPep",txtPEP.getText().toString());
                startActivity(accion);
            }
        });
    }

}
