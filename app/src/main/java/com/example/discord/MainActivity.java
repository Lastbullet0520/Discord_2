package com.example.discord;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;
//import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_external);
        TextView btn_check = findViewById(R.id.tv_check);
        TextView btn_notice = findViewById(R.id.tv_notice);
        TextView btn_ask = findViewById(R.id.tv_ask);
        TextView btn_ask_2 = findViewById(R.id.tv_ask_2);
        TextView btn_class = findViewById(R.id.tv_class);
        TextView btn_class_ai = findViewById(R.id.tv_class_ai);
        TextView btn_class_app = findViewById(R.id.tv_class_app);
        TextView btn_class_pro = findViewById(R.id.tv_class_pro);
        TextView btn_ice = findViewById(R.id.tv_ice);
        TextView btn_lunch = findViewById(R.id.tv_lunch);
        TextView btn_tv_off = findViewById(R.id.tv_off);
        TextView btn_tv_info = findViewById(R.id.tv_info);
        TextView btn_tv_study = findViewById(R.id.tv_study);

        btn_check.setOnClickListener(new View.OnClickListener() {
            int i = 0;

            @Override
            public void onClick(View v) {
                if (i == 0) {
                    btn_notice.setVisibility(View.GONE);
                    ++i;
                } else {
                    btn_notice.setVisibility(View.VISIBLE);
                    --i;
                }
            }
        });

        btn_notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int duration = Toast.LENGTH_SHORT;
                Toast toast_massage = Toast.makeText(MainActivity.this, "공지사항", duration);
                toast_massage.show();
            }
        });

        btn_ask.setOnClickListener(new View.OnClickListener() {
            int i = 0;
            @Override
            public void onClick(View v) {
                if( i == 0) {
                    btn_ask_2.setVisibility(View.GONE);
                    ++i;
                } else {
                    btn_ask_2.setVisibility(View.VISIBLE);
                    --i;
                }
            }
        });

        btn_ask_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int duration = Toast.LENGTH_SHORT;
                Toast toast_massage = Toast.makeText(MainActivity.this, "동기에게-물어봐", duration);
                toast_massage.show();
            }
        });

        btn_class.setOnClickListener(new View.OnClickListener() {
            int i = 0;
            @Override
            public void onClick(View v) {
                if( i == 0) {
                    btn_class_ai.setVisibility(View.GONE);
                    btn_class_app.setVisibility(View.GONE);
                    btn_class_pro.setVisibility(View.GONE);
                    ++i;
                } else {
                    btn_class_ai.setVisibility(View.VISIBLE);
                    btn_class_app.setVisibility(View.VISIBLE);
                    btn_class_pro.setVisibility(View.VISIBLE);
                    --i;
                }
            }
        });

        btn_class_ai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int duration = Toast.LENGTH_SHORT;
                Toast toast_massage = Toast.makeText(MainActivity.this, "인공지능-과정", duration);
                toast_massage.show();
            }
        });
        btn_class_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int duration = Toast.LENGTH_SHORT;
                Toast toast_massage = Toast.makeText(MainActivity.this, "앱-과정", duration);
                toast_massage.show();
            }
        });
        btn_class_pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int duration = Toast.LENGTH_SHORT;
                Toast toast_massage = Toast.makeText(MainActivity.this, "프로젝트-과정", duration);
                toast_massage.show();
            }
        });
        btn_ice.setOnClickListener(new View.OnClickListener() {
            int i = 0;
            @Override
            public void onClick(View v) {
                if( i == 0) {
                    btn_lunch.setVisibility(View.GONE);
                    btn_tv_off.setVisibility(View.GONE);
                    btn_tv_info.setVisibility(View.GONE);
                    btn_tv_study.setVisibility(View.GONE);
                    ++i;
                } else {
                    btn_lunch.setVisibility(View.VISIBLE);
                    btn_tv_off.setVisibility(View.VISIBLE);
                    btn_tv_info.setVisibility(View.VISIBLE);
                    btn_tv_study.setVisibility(View.VISIBLE);
                    --i;
                }
            }
        });

        btn_lunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int duration = Toast.LENGTH_SHORT;
                Toast toast_massage = Toast.makeText(MainActivity.this, "점심-추천해요", duration);
                toast_massage.show();
            }
        });
        btn_tv_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int duration = Toast.LENGTH_SHORT;
                Toast toast_massage = Toast.makeText(MainActivity.this, "오프더레코드", duration);
                toast_massage.show();
            }
        });
        btn_tv_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int duration = Toast.LENGTH_SHORT;
                Toast toast_massage = Toast.makeText(MainActivity.this, "정보-공유해요", duration);
                toast_massage.show();
            }
        });
        btn_tv_study.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int duration = Toast.LENGTH_SHORT;
                Toast toast_massage = Toast.makeText(MainActivity.this, "스터디실", duration);
                toast_massage.show();
            }
        });


    }


}
