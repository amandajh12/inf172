package e.amand.theratunes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);
    }

    public void checkLogin(View view)
    {
        //Verify login credentials
        Intent intent = new Intent(this, HomeGardenActivity.class);
        startActivity(intent);
    }
}
