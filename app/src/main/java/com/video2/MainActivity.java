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
         videoController1.setUp("http://2449.vod.myqcloud.com/2449_43b6f696980311e59ed467f22794e792.f20.mp4",
                "http://p.qpic.cn/videoyun/0/2449_43b6f696980311e59ed467f22794e792_1/640",
                "一行代码实现视频播放");
        JCVideoPlayer.toFullscreenActivity(this,
                "http://2449.vod.myqcloud.com/2449_43b6f696980311e59ed467f22794e792.f20.mp4",
                "http://p.qpic.cn/videoyun/0/2449_43b6f696980311e59ed467f22794e792_1/640",
                "一行代码实现视频播放");

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
