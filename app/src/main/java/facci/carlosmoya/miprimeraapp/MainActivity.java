package facci.carlosmoya.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.util.Log;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private EditText ENTRADA1;
    private TextView RESUL1;
    private Button CONVERTIR1;
    private EditText ENTRADA2;
    private TextView RESUL2;
    private Button CONVERTIR2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String idioma = Locale.getDefault().getLanguage();
        if(idioma=="es") {
            setContentView(R.layout.activity_main2);
        }else{
            setContentView(R.layout.activity_main);
        }
        ENTRADA1 = (EditText) findViewById(R.id.ENTRADA1);
        RESUL1 =(TextView) findViewById(R.id.RESUL1);
        CONVERTIR1 =(Button) findViewById(R.id.CONVERTIR1);

        ENTRADA2 = (EditText) findViewById(R.id.ENTRADA2);
        RESUL2 =(TextView) findViewById(R.id.RESUL2);
        CONVERTIR2 =(Button) findViewById(R.id.CONVERTIR2);

        CONVERTIR1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String variab = null;
                Double valor = null;
                Double resulta = null;
                variab = ENTRADA1.getText().toString();
                valor = Double.parseDouble(variab);
                resulta = (valor-32)/(1.8);
                RESUL1.setText(resulta.toString());
                Log.e("valor",resulta.toString());

            }
        });
        CONVERTIR2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String variab = null;
                Double valor = null;
                Double resulta = null;
                variab = ENTRADA2.getText().toString();
                valor = Double.parseDouble(variab);
                resulta = (valor*1.8)+(32);
                RESUL2.setText(resulta.toString());
                Log.e("valor",resulta.toString());

            }
        });
        Log.e("MainActivity","Carlos Moya");

    }
