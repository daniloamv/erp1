package com.example.danilo.erp1;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Notas extends AppCompatActivity{

    Button btnCalcular;
    Button btnCalcularE;
    EditText txtEpe1;
    EditText txtEpe2;
    EditText txtEpr1;
    EditText txtEpr2;
    EditText txtEva1;
    EditText txtEva2;
    EditText txtEva3;
    EditText txtEva4;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcularnota);
        this.txtEpr1 = (EditText) findViewById(R.id.et_erp1);
        this.txtEpr2 = (EditText) findViewById(R.id.et_erp2);
        this.txtEpe1 = (EditText) findViewById(R.id.et_epe1);
        this.txtEpe2 = (EditText) findViewById(R.id.et_epe2);
        this.txtEva1 = (EditText) findViewById(R.id.et_eva1);
        this.txtEva2 = (EditText) findViewById(R.id.et_eva2);
        this.txtEva3 = (EditText) findViewById(R.id.et_eva3);
        this.txtEva4 = (EditText) findViewById(R.id.et_eva4);
        this.btnCalcular = (Button) findViewById(R.id.btn_calcularpromedio);
        this.btnCalcularE = (Button) findViewById(R.id.btn_calcularexamen);

        this.btnCalcular.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (TextUtils.isEmpty(Notas.this.txtEpr1.getText()) || Double.parseDouble(String.valueOf(Notas.this.txtEpr1.getText())) > 7.0d) {
                    Notas.this.txtEpr1.setError("Campo Vacio");
                } else if (TextUtils.isEmpty(Notas.this.txtEpr2.getText()) || Double.parseDouble(String.valueOf(Notas.this.txtEpr2.getText())) > 7.0d) {
                    Notas.this.txtEpr2.setError("Campo Vacio");
                } else if (TextUtils.isEmpty(Notas.this.txtEpe1.getText()) || Double.parseDouble(String.valueOf(Notas.this.txtEpe1.getText())) > 7.0d) {
                    Notas.this.txtEpe1.setError("Campo Vacio");
                } else if (TextUtils.isEmpty(Notas.this.txtEpe2.getText()) || Double.parseDouble(String.valueOf(Notas.this.txtEpe2.getText())) > 7.0d) {
                    Notas.this.txtEpe2.setError("Campo Vacio");
                } else if (TextUtils.isEmpty(Notas.this.txtEva1.getText()) || Double.parseDouble(String.valueOf(Notas.this.txtEva1.getText())) > 7.0d) {
                    Notas.this.txtEva1.setError("Campo Vacio");
                } else if (TextUtils.isEmpty(Notas.this.txtEva2.getText()) || Double.parseDouble(String.valueOf(Notas.this.txtEva2.getText())) > 7.0d) {
                    Notas.this.txtEva2.setError("Campo Vacio");
                } else if (TextUtils.isEmpty(Notas.this.txtEva3.getText()) || Double.parseDouble(String.valueOf(Notas.this.txtEva3.getText())) > 7.0d) {
                    Notas.this.txtEva3.setError("Campo Vacio");
                } else if (TextUtils.isEmpty(Notas.this.txtEva4.getText()) || Double.parseDouble(String.valueOf(Notas.this.txtEva4.getText())) > 7.0d) {
                    Notas.this.txtEva4.setError("Campo Vacio");
                } else {
                    double ER1 = Double.parseDouble(String.valueOf(Notas.this.txtEpr1.getText())) * 0.1d;
                    double EE1 = Double.parseDouble(String.valueOf(Notas.this.txtEpe1.getText())) * 0.15d;
                    double ER2 = Double.parseDouble(String.valueOf(Notas.this.txtEpr2.getText())) * 0.2d;
                    double EE2 = Double.parseDouble(String.valueOf(Notas.this.txtEpe2.getText())) * 0.25d;
                    double EV1 = Double.parseDouble(String.valueOf(Notas.this.txtEva1.getText()));
                    double EV2 = Double.parseDouble(String.valueOf(Notas.this.txtEva2.getText()));
                    double EV3 = Double.parseDouble(String.valueOf(Notas.this.txtEva3.getText()));
                    double d = ((ER1 + EE1) + ER2) + EE2;
                    double presentacion = d + (((((EV1 + EV2) + EV3) + Double.parseDouble(String.valueOf(Notas.this.txtEva4.getText()))) / 4.0d) * 0.3d);

                    double promedioT= (Math.rint(100.0d * presentacion) / 100.0d);
                    double promedioT2 = Math.rint(((100.0d * presentacion) / 100.0d) * 0.7d);
                    if (presentacion > 4.0){
                        Toast toast1 =
                                Toast.makeText(getApplicationContext(),
                                        "NO DAS EXAMEN, TU PROMEDIO ES " +promedioT, Toast.LENGTH_SHORT);

                        toast1.show();
                    }else{
                        Toast toast1 =
                                Toast.makeText(getApplicationContext(),
                                        "DAS EXAMEN, TU PROMEDIO ES " +promedioT + " Y TE PRESENTAS AL EXAMEN" + " CON UNA NOTA DE: " + promedioT2, Toast.LENGTH_SHORT);

                        toast1.show();
                    }

                }
            }
        });
    }
}
