package mx.edu.tesoem.isc.tlgr.proyecto1tlgr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrmEstrellaActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnmenu4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_estrella);
        btnmenu4=(Button)findViewById(R.id.botonmenu4);
        btnmenu4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent Frm8=new Intent(this,FrmMenuActivity.class);
        startActivity(Frm8);
        finish();
    }
}
