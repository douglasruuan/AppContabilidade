package douglas.matheus.exercicioaula10;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import douglas.matheus.exercicioaula10.model.Pessoa;

public class Ligar extends AppCompatActivity {

    //Widgets
    private EditText etTelefone;
    private Button btLigar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ligar);

        //Refs
        etTelefone = findViewById(R.id.lig_et_telefone);
        btLigar = findViewById(R.id.lig_bt_ligar);

        ActivityCompat.requestPermissions(Ligar.this,new String[]{Manifest.permission.CALL_PHONE},0);

        btLigar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Se não possui permissão
                if (ContextCompat.checkSelfPermission(Ligar.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    //Verifica se já mostramos o alerta e o usuário negou alguma vez.
                    if (ActivityCompat.shouldShowRequestPermissionRationale(Ligar.this, Manifest.permission.CALL_PHONE)) {
                        //Caso o usuário tenha negado a permissão anteriormente e não tenha marcado o check "nunca mais mostre este alerta"

                        //Podemos mostrar um alerta explicando para o usuário porque a permissão é importante.
                        Toast.makeText(
                                getBaseContext(),
                                "Você já negou antes essa permissão! " +
                                        "Para efetuar uma ligação necessitamos dessa permissão!",
                                Toast.LENGTH_LONG).show();
                                /* Além da mensagem indicando a necessidade sobre a permissão,
                                   podemos solicitar novamente a permissão */
                        ActivityCompat.requestPermissions(Ligar.this, new String[]{Manifest.permission.CALL_PHONE}, 0);
                    } else {
                        //Solicita a permissão
                        ActivityCompat.requestPermissions(Ligar.this, new String[]{Manifest.permission.CALL_PHONE}, 0);
                    }
                } else {
                    if (!etTelefone.getText().toString().isEmpty()) {
                        Pessoa p = new Pessoa();
                        Uri uri = Uri.parse("tel:" + etTelefone.getText().toString());
                        Intent it = new Intent(Intent.ACTION_CALL, uri);
                        startActivity(it);
                    }//fecha if
                }
            }
        });
    }//fecha oncreate
}//fecha classe
