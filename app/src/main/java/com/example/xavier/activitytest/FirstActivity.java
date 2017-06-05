package com.example.xavier.activitytest;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button button1=(Button)findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
               Intent intent=new Intent("android.intent.action.START");
                startActivity(intent);
            }

        });
    }

    @Override
    //创建menu对象
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);

        return true;
    }

    @Override
    //为menu中的item创建响应事件
    public boolean onOptionsItemSelected(MenuItem item) {
        //根据用户点击的item的id号来进行过滤
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(FirstActivity.this,"This is add item",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(FirstActivity.this, "This is remove item",
                        Toast.LENGTH_SHORT).show();
                break;
            default:
        }

        return true;
    }
}
