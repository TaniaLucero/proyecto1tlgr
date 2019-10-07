package mx.edu.tesoem.isc.tlgr.proyecto1tlgr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrmChicosActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnmenu7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_chicos);
        btnmenu7=(Button)findViewById(R.id.botonmenu7);
        btnmenu7.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent Frm14=new Intent(this,FrmMenuActivity.class);
        startActivity(Frm14);
        finish();

    }
}
