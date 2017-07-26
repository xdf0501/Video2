package com.video2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import de.greenrobot.event.EventBus;
import lib.JCVideoPlayer;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    JCVideoPlayer videoController1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     //   EventBus.getDefault().register(this);
        videoController1 = (JCVideoPlayer) findViewById(R.id.videocontroller1);
        videoController1.setUp("http://zhihui.on168.com.cn/LiveVod/S201705260915561580.m3u8",
                "",
                "晒比视频播放");
        JCVideoPlayer.toFullscreenActivity(this,
                "http://zhihui.on168.com.cn/LiveVod/S201705260915561580.m3u8",
                "",
                "晒比视频播放");

    }

    @Override
    protected void onPause() {
        super.onPause();
        JCVideoPlayer.releaseAllVideos();
    }
    @Override
    public void onClick(View view) {

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
   //     EventBus.getDefault().unregister(this);
    }
}
