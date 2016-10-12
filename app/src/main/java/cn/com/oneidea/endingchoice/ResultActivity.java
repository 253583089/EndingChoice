package cn.com.oneidea.endingchoice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by admin on 2016/10/7.
 */

public class ResultActivity extends AppCompatActivity{

    private TextView mFirstView;
    private TextView mSecondView;
    private TextView mThirdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        mFirstView=(TextView)findViewById(R.id.fist_result);
        mSecondView=(TextView)findViewById(R.id.second_result);
        mThirdView=(TextView)findViewById(R.id.third_result);
        Intent intent =getIntent();
        String tFirstString=intent.getStringExtra("first_string");
        String tSecondString=intent.getStringExtra("second_string");
        String tThirdString=intent.getStringExtra("third_string");

        double a,b,c;
        a = Math.random();
        b = Math.random();
        c = Math.random();
        if (a > b && a > c){
            mFirstView.setText(tFirstString);
            if (b > c){
                mSecondView.setText(tSecondString);
                mThirdView.setText(tThirdString);
            }else{
                mSecondView.setText(tThirdString);
                mThirdView.setText(tSecondString);
            }
        }else if(b > a && b > c){
            mFirstView.setText(tSecondString);
            if (a > c){
                mSecondView.setText(tFirstString);
                mThirdView.setText(tThirdString);
            }else{
                mSecondView.setText(tThirdString);
                mThirdView.setText(tFirstString);
            }
        }else if(c > a && c > b){
            mFirstView.setText(tThirdString);
            if (a > b){
                mSecondView.setText(tFirstString);
                mThirdView.setText(tSecondString);
            }else{
                mSecondView.setText(tSecondString);
                mThirdView.setText(tFirstString);
            }
        }
    }
}
