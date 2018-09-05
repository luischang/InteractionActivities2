package pe.edu.esan.sesion03_resource_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void sendMessage(View view) {
        Intent accion = new Intent(this,ResultActivity.class);
        EditText txtExaPar = (EditText) findViewById(R.id.txtExamenParcial);
        EditText txtExaFin = (EditText) findViewById(R.id.txtExamenFinal);
        EditText txtPEP = (EditText) findViewById(R.id.txtPromEvalPep);
        accion.putExtra("vExaPar",txtExaPar.getText().toString());
        accion.putExtra("vExaFin",txtExaFin.getText().toString());
        accion.putExtra("vPep",txtPEP.getText().toString());
        startActivity(accion);
    }
}
