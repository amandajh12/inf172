package e.amand.theratunes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignupFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_form);
    }

    public void goToNextSignUpForm(View view)
    {
        Intent intent = new Intent(this, NextSignUpFormActivity.class);
        startActivity(intent);
    }
}
