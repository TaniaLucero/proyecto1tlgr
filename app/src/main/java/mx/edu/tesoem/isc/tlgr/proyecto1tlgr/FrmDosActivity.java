package mx.edu.tesoem.isc.tlgr.proyecto1tlgr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrmDosActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnmenu6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_dos);
        btnmenu6=(Button)findViewById(R.id.botonmenu6);
        btnmenu6.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent Frm12=new Intent(this,FrmMenuActivity.class);
        startActivity(Frm12);
        finish();

    }
}
