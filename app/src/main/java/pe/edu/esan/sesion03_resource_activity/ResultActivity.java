package pe.edu.esan.sesion03_resource_activity;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Double notaExaPar = Double.parseDouble(getIntent().getStringExtra("vExaPar"));
        Double notaExaFin = Double.parseDouble(getIntent().getStringExtra("vExaFin"));
        Double notaPep = Double.parseDouble(getIntent().getStringExtra("vPep"));

        Double resultado = notaExaPar * .3 + notaExaFin * .3 + notaPep * .4;
        Double falta = 0.0;
        if(resultado<=10.5)
            falta = 10.5 - resultado;

        TextView txtNotaFinal = (TextView) findViewById(R.id.txtNotaFinal);
        TextView txtNotaFalta = (TextView) findViewById(R.id.txtResultadoFalta);
        txtNotaFinal.setText(String.format("%.2f",resultado));
        txtNotaFalta.setText(String.format("%.2f",falta));

    }
}
