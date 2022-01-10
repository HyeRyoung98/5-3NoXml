package com.example.a5_3noxml;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(baseLayout,params);

        EditText edit = new EditText(this);
        edit.setHint("글씨를 입력해주세요.");
        baseLayout.addView(edit);

        Button btn = new Button(this);
        btn.setText("버튼입니다.");
        btn.setBackgroundColor(Color.parseColor("#bfff00"));
        baseLayout.addView(btn);

        TextView tv = new TextView(this);
        baseLayout.addView(tv);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = edit.getText().toString();
                tv.setText(str);
            }
        });



    }
}