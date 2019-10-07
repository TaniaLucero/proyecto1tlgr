package mx.edu.tesoem.isc.tlgr.proyecto1tlgr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrmIntroActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnmenu1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_intro);
        btnmenu1=(Button)findViewById(R.id.botonmenu1);
        btnmenu1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent Frm2=new Intent(this,FrmMenuActivity.class);
        startActivity(Frm2);
        finish();
    }
}
