package jarroba.com.sonidosjarroba;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private MediaPlayer mp;
    private Button botonSonido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonSonido = (Button) findViewById(R.id.botonSonido);
        botonSonido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(MainActivity.this,R.raw.pedro);
                mp.start();
            }
        });
    }
    
}
