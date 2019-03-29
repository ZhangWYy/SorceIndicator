package first.swufe.com.sorce;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.System.out;

public class Indicator extends AppCompatActivity implements OnClickListener {

    EditText TName;
    TextView Tscore;
    Button Three;
    Button Two;
    Button One;
    Button Reset;
    int a=0;
    String ss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indicator);

        TName = findViewById(R.id.Team);
        Tscore = findViewById(R.id.Score);
        findViewById(R.id.Three).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.Three){
                    a=a+3;
                    ss = Integer.toString(a);
                    Tscore.setText(ss);
                }
            }
        });

        findViewById(R.id.Two).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.Two) {
                    a = a + 2;
                    ss = Integer.toString(a);
                    Tscore.setText(ss);
                }
            }
        });
        findViewById(R.id.One).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.One) {
                    a = a + 1;
                    ss = Integer.toString(a);
                    Tscore.setText(ss);
                }
            }
        });

        findViewById(R.id.Reset).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.Reset) {
                    a = 0;
                    ss = Integer.toString(a);
                    Tscore.setText(ss);
                    TName.setText(null);
                }
            }
        });



    }

    @Override
    public void onClick(View v) {

    }
}
