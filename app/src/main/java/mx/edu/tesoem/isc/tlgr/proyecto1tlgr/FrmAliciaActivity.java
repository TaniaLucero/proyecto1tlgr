package mx.edu.tesoem.isc.tlgr.proyecto1tlgr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrmAliciaActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnmenu3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_alicia);
        btnmenu3=(Button)findViewById(R.id.botonmenu3);
        btnmenu3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent Frm6=new Intent(this,FrmMenuActivity.class);
        startActivity(Frm6);
        finish();

    }
}
