package cn.edu.sdwu.android02.classroom.sn170507180114;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Ch10Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ch10_2);
    }
    public void send_broadcast(View view){
        //发送广播
        Intent intent=new Intent("com.inspur.broadcast");//指定频道
        intent.putExtra("key1","message");
    }

    public void ch10Activity(View view){
        Intent intent=new Intent(this,Ch10Activity1.class);
        EditText editText=(EditText)findViewById(R.id.ch10_2_et);
        intent.putExtra("text",editText.getText().toString());//设置所要传递的数据（即文本框输入的数据）
        startActivity(intent);
    }



    public void startSubActivity(View view){
        //1.以Sub_Activity 的方式启动子Activity
        Intent intent=new Intent(this,Ch10Activity3.class);
        startActivityForResult(intent,101);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
       // super.onActivityResult(requestCode, resultCode, data);
        //3.在父Activity中获取返回值
        //requestCode用来区分从哪一个子Activity返回的结果
        if(requestCode==101){
            if(requestCode==RESULT_OK){
                //用户点击的确认 进一步获取数据
                 String name=data.getStringExtra("name");
                Toast.makeText(this,name,Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(this,"cancel",Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void web(View view){
        //使用隐式启动方式，打开网页
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://baidu.com"));
        startActivity(intent);
    }

}
