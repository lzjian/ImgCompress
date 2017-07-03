package com.lzjian.imgcompress;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 这里仅仅做一个示例, 图片地址要自己去获得
        ImgCompressUtils.compressImg(Environment.getExternalStorageDirectory().getAbsolutePath()+ File.separator+"1.png", 400, 400, 80);
    }
}
