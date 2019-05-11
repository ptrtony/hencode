package com.zhaofan.encoder.customerview;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.zhaofan.encoder.R;
import com.zhaofan.encoder.customerview.widget.AvatorView;

public class CustomeViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custome_view);
    }

    public void onDrawCircle(View view){
        startActivity(new Intent(this,TestViewActivity.class));
    }

    public void onDashBoardClick(View view){
        startActivity(new Intent(this,DashBoardActivity.class));
    }

    public void onAvatorClick(View  view){
        startActivity(new Intent(this, AvatorActivity.class));
    }
}
