package studiot.campusvibes;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.vr.sdk.widgets.video.VrVideoView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        VrVideoView video = new VrVideoView(this);
        VrVideoView.Options options = new VrVideoView.Options();
        String filePath = "/src/main/res/raw/vid.mp4";
        //Uri uri = Uri.parse(uriPath);


        String uriPath2 = "android.resource://" + getPackageName() + "/raw/vid.mp4";




        try {
            video.loadVideo(Uri.parse(uriPath2), options);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
