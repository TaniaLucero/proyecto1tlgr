package mx.edu.tesoem.isc.tlgr.proyecto1tlgr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrmHorarioActivity extends AppCompatActivity implements View.OnClickListener {
    private static int SCREEN_ORIENTATION_LANDSCAPE;
    Button btnmenu2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_horario);
        this.setRequestedOrientation(FrmHorarioActivity.SCREEN_ORIENTATION_LANDSCAPE);
        btnmenu2=(Button)findViewById(R.id.botonmenu2);
        btnmenu2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent Frm4=new Intent(this,FrmMenuActivity.class);
        startActivity(Frm4);
        finish();
    }
}
