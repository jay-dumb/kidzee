package Utility;

import android.content.Context;
import android.media.MediaPlayer;

import com.jay.kidzeee1.R;

public class ClickSound {

    private Context context;
    private MediaPlayer mp;

    public ClickSound(Context context) {
        this.context = context;
        mp = new MediaPlayer();
    }

    public void sound(String s) {
        try {
            if (mp.isPlaying()) {
                mp.stop();
                mp.release();
            }
            mp = MediaPlayer.create(context, R.raw.success);
            playSound(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void playSound(String s){
        if (s.equalsIgnoreCase("RIGHT")){
            mp = MediaPlayer.create(context, R.raw.success);
        }else if (s.equalsIgnoreCase("WRONG")){
            mp = MediaPlayer.create(context, R.raw.wrong);
        }
        mp.start();
    }
}
