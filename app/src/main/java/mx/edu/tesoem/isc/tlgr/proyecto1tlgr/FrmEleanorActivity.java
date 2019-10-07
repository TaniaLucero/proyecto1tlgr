package mx.edu.tesoem.isc.tlgr.proyecto1tlgr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrmEleanorActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnmenu5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_eleanor);
        btnmenu5=(Button)findViewById(R.id.botonmenu5);
        btnmenu5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent Frm10=new Intent(this,FrmMenuActivity.class);
        startActivity(Frm10);
        finish();

    }
}
