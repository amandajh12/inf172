package e.amand.theratunes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String NEXT_ACTIVITY = "e.amand.theratunes.login";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToLoginActivity(View view)
    {
        Intent intent = new Intent(this, LoginFormActivity.class);
        startActivity(intent); 
    }

    public void goToSignUpForm(View view)
    {
        Intent intent = new Intent(this, SignupFormActivity.class);
        startActivity(intent);
    }
}
