package layouttable.contoh.macammacamburunghias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button plh = (Button) findViewById(R.id.pilih);
        plh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View pilih) {
                Intent myIntent = new
                        Intent(pilih.getContext(), Menu.class);
                startActivityForResult(myIntent, 0);

            }
        });
    }
}
