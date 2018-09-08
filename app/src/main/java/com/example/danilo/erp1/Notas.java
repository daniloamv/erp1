package com.example.danilo.erp1;
/*
GNU GENERAL PUBLIC LICENSE
                       Version 3, 29 June 2007

 Copyright (C) 2007 Free Software Foundation, Inc. <http://fsf.org/>
 Everyone is permitted to copy and distribute verbatim copies
 of this license document, but changing it is not allowed.

                            Preamble

  The GNU General Public License is a free, copyleft license for
software and other kinds of works.

  The licenses for most software and other practical works are designed
to take away your freedom to share and change the works.  By contrast,
the GNU General Public License is intended to guarantee your freedom to
share and change all versions of a program--to make sure it remains free
software for all its users.  We, the Free Software Foundation, use the
GNU General Public License for most of our software; it applies also to
any other work released this way by its authors.  You can apply it to
your programs, too.

  When we speak of free software, we are referring to freedom, not
price.  Our General Public Licenses are designed to make sure that you
have the freedom to distribute copies of free software (and charge for
them if you wish), that you receive source code or can get it if you
want it, that you can change the software or use pieces of it in new
free programs, and that you know you can do these things.

  To protect your rights, we need to prevent others from denying you
these rights or asking you to surrender the rights.  Therefore, you have
certain responsibilities if you distribute copies of the software, or if
you modify it: responsibilities to respect the freedom of others.

  For example, if you distribute copies of such a program, whether
gratis or for a fee, you must pass on to the recipients the same
freedoms that you received.  You must make sure that they, too, receive
or can get the source code.  And you must show them these terms so they
know their rights.

  Developers that use the GNU GPL protect your rights with two steps:
(1) assert copyright on the software, and (2) offer you this License
giving you legal permission to copy, distribute and/or modify it.

  For the developers' and authors' protection, the GPL clearly explains
that there is no warranty for this free software.  For both users' and
authors' sake, the GPL requires that modified versions be marked as
changed, so that their problems will not be attributed erroneously to
authors of previous versions.

  Some devices are designed to deny users access to install or run
modified versions of the software inside them, although the manufacturer
can do so.  This is fundamentally incompatible with the aim of
protecting users' freedom to change the software.  The systematic
pattern of such abuse occurs in the area of products for individuals to
use, which is precisely where it is most unacceptable.  Therefore, we
have designed this version of the GPL to prohibit the practice for those
products.  If such problems arise substantially in other domains, we
stand ready to extend this provision to those domains in future versions
of the GPL, as needed to protect the freedom of users.

  Finally, every program is threatened constantly by software patents.
States should not allow patents to restrict development and use of
software on general-purpose computers, but in those that do, we wish to
avoid the special danger that patents applied to a free program could
make it effectively proprietary.  To prevent this, the GPL assures that
patents cannot be used to render the program non-free.

  The precise terms and conditions for copying, distribution and
modification follow.


 */
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
    EditText txtNfinal;
    EditText txtNminima;

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
        this.txtNfinal = (EditText) findViewById(R.id.et_nfinal);
        this.txtNminima = (EditText) findViewById(R.id.et_nminima);
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

        btnCalcularE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(Notas.this.txtNfinal.getText()) || Double.parseDouble(String.valueOf(Notas.this.txtNfinal.getText())) > 7.0d) {
                    Notas.this.txtNfinal.setError("Campo Vacio");
                } else if (TextUtils.isEmpty(Notas.this.txtNminima.getText()) || Double.parseDouble(String.valueOf(Notas.this.txtNminima.getText())) > 7.0d) {
                    Notas.this.txtNfinal.setError("Campo Vacio");
                } else {
                    double nfinal = Double.parseDouble(String.valueOf(Notas.this.txtNfinal.getText()));
                    double nminima = Double.parseDouble(String.valueOf(Notas.this.txtNminima.getText()));

                    double examen = Math.rint((nfinal+nminima)/2);
                    Toast toast1 =
                            Toast.makeText(getApplicationContext(),
                                    "TU  NOTA DE EXAMEN ES: " + examen, Toast.LENGTH_SHORT);

                    toast1.show();

                }
            }
        });
    }
}
