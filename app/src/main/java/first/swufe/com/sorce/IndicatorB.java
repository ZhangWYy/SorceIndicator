package first.swufe.com.sorce;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IndicatorB extends AppCompatActivity implements View.OnClickListener {

    TextView scoreA;
    TextView scoreB;
    Button add3A;
    Button add2A;
    Button add1A;
    Button add3B;
    Button add2B;
    Button add1B;
    Button reset;
    int a=0,b=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indicator_b);
        scoreA = findViewById(R.id.scoreA);
        findViewById(R.id.add3A).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.add3A){
                    a=a+3;
                    scoreA.setText(Integer.toString(a));
                }
            }
        });
        findViewById(R.id.add2A).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.add2A){
                    a=a+2;
                    scoreA.setText(Integer.toString(a));
                }
            }
        });
        findViewById(R.id.add1A).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.add1A){
                    a=a+1;
                    scoreA.setText(Integer.toString(a));
                }
            }
        });

        scoreB = findViewById(R.id.scoreB);
        findViewById(R.id.add3B).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                if(w.getId()==R.id.add3B){
                    b=b+3;
                    scoreB.setText(Integer.toString(b));
                }
            }
        });
        findViewById(R.id.add2B).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                if(w.getId()==R.id.add2B){
                    b=b+2;
                    scoreB.setText(Integer.toString(b));
                }
            }
        });
        findViewById(R.id.add1B).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                if(w.getId()==R.id.add1B){
                    b=b+1;
                    scoreB.setText(Integer.toString(b));
                }
            }
        });

        findViewById(R.id.Reset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                if (w.getId() == R.id.Reset) {
                    a = 0;
                    b=0;
                    scoreA.setText(Integer.toString(a));
                    scoreB.setText(Integer.toString(b));
                }
            }
        });


    }

    @Override
    public void onClick(View v) {

    }
}
