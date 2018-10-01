package com.example.russell.eventos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView ivCamaron, ivCaldo, ivCeviche, ivEmpanada, ivPescado, ivCerveza;
    TextView avisos;
    Button boton;
    EditText pedidoGeneral;
    RatingBar estrellas;
    //////////////////////////////////////////////////////////////////
    int  Caldo, Camaron, Ceviche, Empanada, Pescado, Cerveza;
    float nEstrellas = 0;
    SmsManager sms = SmsManager.getDefault();
    //////////////////////////////////////////////////////////////////

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //----------------------------------------------------
        ivCamaron = (ImageView)findViewById(R.id.ivCamaron);
        ivCaldo = (ImageView)findViewById(R.id.ivCaldo);
        ivCeviche = (ImageView)findViewById(R.id.ivCeviche);
        ivEmpanada = (ImageView)findViewById(R.id.ivEmpanada);
        ivPescado = (ImageView)findViewById(R.id.ivPescado);
        ivCerveza = (ImageView)findViewById(R.id.ivCerveza);
        //----------------------------------------------------
        avisos = (TextView)findViewById(R.id.avisos);
        //----------------------------------------------------
        boton = (Button)findViewById(R.id.boton);
        //----------------------------------------------------
        estrellas = (RatingBar)findViewById(R.id.estrellas);
        //----------------------------------------------------


//////////////////////////////////////////////////////////////////////////////////
        ivCaldo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Caldo++;
                Toast.makeText(getBaseContext(), "Ord de caldo: " + Caldo, Toast.LENGTH_SHORT).show();
                return;

            }
        });
        ivCaldo.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(Caldo == 0 || Caldo <=0){
                    Caldo = 0;
                    Toast.makeText(getBaseContext(), "Ord de Caldo, cancelada", Toast.LENGTH_SHORT).show();
                }else
                    Caldo --;
                Toast.makeText(getBaseContext(), "Ord de caldo(s): " + Caldo, Toast.LENGTH_SHORT).show();
                return true;
            }
        });
//////////////////////////////////////////////////////////////////////////////////
        ivCamaron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Camaron++;
                    Toast.makeText(getBaseContext(), "Ord de camarones: " + Camaron, Toast.LENGTH_SHORT).show();
                    return;

            }
        });
        ivCamaron.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(Camaron == 0 || Camaron <=0){
                    Camaron = 0;
                    Toast.makeText(getBaseContext(), "Ord de Camarones, cancelada", Toast.LENGTH_SHORT).show();
                }else
                    Camaron --;
                    Toast.makeText(getBaseContext(), "Ord de camarones: " + Camaron, Toast.LENGTH_SHORT).show();
                return true;
            }
        });
/////////////////////////////////////////////////////////////////////////////////
        ivCeviche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ceviche++;
                Toast.makeText(getBaseContext(), "Ord de ceviche: " + Ceviche, Toast.LENGTH_SHORT).show();
                return;

            }
        });
        ivCeviche.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(Ceviche == 0 || Ceviche <=0){
                    Ceviche = 0;
                    Toast.makeText(getBaseContext(), "Ord de Ceviche, cancelada", Toast.LENGTH_SHORT).show();
                }else
                    Ceviche --;
                Toast.makeText(getBaseContext(), "Ord de ceviche, cancelada: " + Ceviche, Toast.LENGTH_SHORT).show();
                return true;
            }
        });
//////////////////////////////////////////////////////////////////////////////////
        ivEmpanada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Empanada++;
                Toast.makeText(getBaseContext(), "Ord de Empanadas: " + Empanada, Toast.LENGTH_SHORT).show();
                return;

            }
        });
        ivEmpanada.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(Empanada == 0 || Empanada <=0){
                    Empanada = 0;
                    Toast.makeText(getBaseContext(), "Ord de Empanadas, cancelada", Toast.LENGTH_SHORT).show();
                }else
                    Empanada --;
                Toast.makeText(getBaseContext(), "Ord de Empanadas: " + Empanada, Toast.LENGTH_SHORT).show();
                return true;
            }
        });
//////////////////////////////////////////////////////////////////////////////////
        ivPescado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pescado++;
                Toast.makeText(getBaseContext(), "Ord de pescado: " + Pescado, Toast.LENGTH_SHORT).show();
                return;

            }
        });
        ivPescado.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(Pescado == 0 || Pescado <=0){
                    Pescado = 0;
                    Toast.makeText(getBaseContext(), "Ord de Pescado, cancelada", Toast.LENGTH_SHORT).show();
                }else
                    Pescado --;
                Toast.makeText(getBaseContext(), "Ord de Pescado: " + Pescado, Toast.LENGTH_SHORT).show();
                return true;
            }
        });
//////////////////////////////////////////////////////////////////////////////////
        ivCerveza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Cerveza >= 10){
                    Cerveza++;
                    Toast.makeText(getBaseContext(), "¡¡Son asgardianos!!", Toast.LENGTH_SHORT).show();
                    Toast.makeText(getBaseContext(), "Cervezas: " + Cerveza, Toast.LENGTH_SHORT).show();
                }
                Cerveza++;
                Toast.makeText(getBaseContext(), "Cervezas: " + Cerveza, Toast.LENGTH_SHORT).show();
                return;

            }
        });
        ivCerveza.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(Cerveza == 0 || Cerveza <=0){
                    Cerveza = 0;
                    Toast.makeText(getBaseContext(), "Son buenos cristianos", Toast.LENGTH_SHORT).show();
                }else
                    Cerveza --;
                Toast.makeText(getBaseContext(), "Cervezas: " + Cerveza, Toast.LENGTH_SHORT).show();
                return true;
            }
        });

//////////////////////////////////////////////////////////////////////////////////
        //Logica para las estrellas
//////////////////////////////////////////////////////////////////////////////////
        estrellas.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
            nEstrellas = rating;
            }
        });
//////////////////////////////////////////////////////////////////////////////////
        //Logica para el boton
//////////////////////////////////////////////////////////////////////////////////
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Caldo == 0 && Camaron == 0 && Ceviche == 0 && Empanada ==0 && Pescado ==0 && Cerveza == 0 && nEstrellas == 0) {
                    avisos.setText("No ha ordenado nada, elije algo del menu");
                    //Toast.makeText(getBaseContext(), "Por favor elije algo del menú", Toast.LENGTH_SHORT).show();
                }
                if(Caldo >= 0 || Camaron >= 0 || Ceviche >= 0 || Empanada >=0 || Pescado >= 0 || Cerveza >= 0 && nEstrellas <= 0) {
                    avisos.setText("Por favor califica el servicio");
                    //Toast.makeText(getBaseContext(), "Por favor califica el servicio", Toast.LENGTH_SHORT).show();
                }if (Caldo >= 0 || Camaron >= 0 || Ceviche >= 0 || Empanada >=0 || Pescado >= 0 || Cerveza >= 0 && nEstrellas > 0) {
                    avisos.setText("Muchas gracias, su pedido, fue enviado al chef");
                    //avisos.setText(Caldo+","+Camaron+","+Ceviche+","+Empanada+","+Pescado+","+Cerveza+","+nEstrellas+"/");
                    sms.sendTextMessage(
                            "0335513894675", //"0335513894675"
                            null,
                            "Caldo:"+Caldo+",Camaron:"+Camaron+",Ceviche:"+Ceviche+",Empanada:"+Empanada+"Pescado:"+Pescado+"Cerveza:"+Cerveza+"Calificacion:"+nEstrellas,
                            null,
                            null
                    );
                }

            }
        });
//////////////////////////////////////////////////////////////////////////////////
    }
}
