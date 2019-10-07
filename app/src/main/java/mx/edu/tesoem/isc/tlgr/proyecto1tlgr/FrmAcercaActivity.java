package mx.edu.tesoem.isc.tlgr.proyecto1tlgr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrmAcercaActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnmenu8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_acerca);
        btnmenu8=(Button)findViewById(R.id.botonmenu8);
        btnmenu8.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent Frm16=new Intent(this,FrmMenuActivity.class);
        startActivity(Frm16);
        finish();
    }
}
