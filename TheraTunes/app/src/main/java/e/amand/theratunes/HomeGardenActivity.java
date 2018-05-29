package e.amand.theratunes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeGardenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_garden);
    }

    public void goToMusicPatternMiniGame(View view)
    {
        Intent intent = new Intent(this, MusicPatternGame.class);
        startActivity(intent);
    }
}
