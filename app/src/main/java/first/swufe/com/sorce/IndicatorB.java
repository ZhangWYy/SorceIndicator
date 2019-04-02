package first.swufe.com.sorce;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IndicatorB extends AppCompatActivity implements View.OnClickListener {

    TextView scoreA;
    TextView scoreB;
    Button reset;
    int a=0,b=0;
    String ss=null;
    String s=null;
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
                    ss = Integer.toString(a);
                    scoreA.setText(ss);
                }
            }
        });
        findViewById(R.id.add2A).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.add2A){
                    a=a+2;
                    ss = Integer.toString(a);
                    scoreA.setText(ss);
                }
            }
        });
        findViewById(R.id.add1A).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.add1A){
                    a=a+1;
                    ss = Integer.toString(a);
                    scoreA.setText(ss);
                }
            }
        });

        scoreB = findViewById(R.id.scoreB);
        findViewById(R.id.add3B).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.add3B){
                    b=b+3;
                    s = Integer.toString(b);
                    scoreB.setText(s);
                }
            }
        });
        findViewById(R.id.add2B).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.add2B){
                    b=b+2;
                    s = Integer.toString(b);
                    scoreB.setText(s);
                }
            }
        });
        findViewById(R.id.add1B).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.add1B){
                    b=b+1;
                    s = Integer.toString(b);
                    scoreB.setText(s);
                }
            }
        });

        findViewById(R.id.Reset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.Reset) {
                    a = 0;
                    b=0;
                    ss = Integer.toString(a);
                    s = Integer.toString(b);
                    scoreA.setText(ss);
                    scoreB.setText(s);
                }
            }
        });


    }

    @Override
    public void onClick(View v) {

    }
}
