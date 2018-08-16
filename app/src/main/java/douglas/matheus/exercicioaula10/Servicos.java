package douglas.matheus.exercicioaula10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Servicos extends AppCompatActivity {

    private Button btConsultoria;
    private Button btContabilidade;
    private Button btFiscal;
    private Button btPessoal;
    private Button btSocietario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicos);

        btConsultoria = findViewById(R.id.ss_bt_consultoria);
        btContabilidade = findViewById(R.id.ss_bt_contabilidade);
        btFiscal = findViewById(R.id.ss_bt_fiscal);
        btPessoal = findViewById(R.id.ss_bt_pessoal);
        btSocietario = findViewById(R.id.ss_bt_societario);


        btConsultoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Servicos.this, Consultoria.class);
                startActivity(it);
            }
        });
        btContabilidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Servicos.this, Contabilidade.class);
                startActivity(it);
            }
        });
        btFiscal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Servicos.this, Contabilidade.class);
                startActivity(it);
            }
        });
        btPessoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Servicos.this, Contabilidade.class);
                startActivity(it);
            }
        });
        btSocietario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Servicos.this, Contabilidade.class);
                startActivity(it);
            }
        });
    }
}//Fecha ONcreate
