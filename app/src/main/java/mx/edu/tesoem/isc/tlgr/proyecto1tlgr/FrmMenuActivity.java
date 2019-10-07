package mx.edu.tesoem.isc.tlgr.proyecto1tlgr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrmMenuActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnintro, btnhora, btnali, btnest, btnel, btndos, btnch, btna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_menu);
        btnintro=(Button)findViewById(R.id.botonintro);
        btnintro.setOnClickListener(this);

        btnhora=(Button)findViewById(R.id.botonhorario);
        btnhora.setOnClickListener(this);

        btnali=(Button)findViewById(R.id.botonalicia);
        btnali.setOnClickListener(this);

        btnest=(Button)findViewById(R.id.botonestrella);
        btnest.setOnClickListener(this);

        btnel=(Button)findViewById(R.id.botoneleanor);
        btnel.setOnClickListener(this);

        btndos=(Button)findViewById(R.id.botondos);
        btndos.setOnClickListener(this);

        btnch=(Button)findViewById(R.id.botonchicos);
        btnch.setOnClickListener(this);

        btna=(Button)findViewById(R.id.botonacerca);
        btna.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.botonintro:
                Intent Frm1=new Intent(this,FrmIntroActivity.class);
                startActivity(Frm1);
                finish();
                break;
            case R.id.botonhorario:
                Intent Frm3=new Intent(this,FrmHorarioActivity.class);
                startActivity(Frm3);
                finish();
                break;
            case R.id.botonalicia:
                Intent Frm5=new Intent(this,FrmAliciaActivity.class);
                startActivity(Frm5);
                finish();
                break;
            case R.id.botonestrella:
                Intent Frm7=new Intent(this,FrmEstrellaActivity.class);
                startActivity(Frm7);
                finish();
                break;
            case R.id.botoneleanor:
                Intent Frm9=new Intent(this,FrmEleanorActivity.class);
                startActivity(Frm9);
                finish();
                break;
            case R.id.botondos:
                Intent Frm11=new Intent(this,FrmDosActivity.class);
                startActivity(Frm11);
                finish();
                break;
            case R.id.botonchicos:
                Intent Frm13=new Intent(this,FrmChicosActivity.class);
                startActivity(Frm13);
                finish();
                break;
            case R.id.botonacerca:
                Intent Frm15=new Intent(this,FrmAcercaActivity.class);
                startActivity(Frm15);
                finish();
                break;
        }
    }
}
