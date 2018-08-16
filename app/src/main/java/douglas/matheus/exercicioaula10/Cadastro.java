package douglas.matheus.exercicioaula10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cadastro extends AppCompatActivity {

    private Button btAna;
    private Button btKari;
    private Button btFp;
    private Button btCb;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        btAna = findViewById(R.id.hm_bt_ana);
        btKari = findViewById(R.id.hm_bt_kari);
        btFp = findViewById(R.id.hm_bt_fp);
        btCb = findViewById(R.id.hm_bt_cb);



        btAna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Cadastro.this, Dona.class);
                startActivity(it);
            }
        });

        btKari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent it = new Intent(Cadastro.this, Karina.class);
            startActivity(it);
            }
        });
        btFp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Cadastro.this, Depfp.class);
                startActivity(it);
            }
        });
        btCb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Cadastro.this, Depcfp.class);
                startActivity(it);
            }
        });


    }
}
