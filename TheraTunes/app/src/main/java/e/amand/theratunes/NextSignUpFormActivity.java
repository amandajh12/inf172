package e.amand.theratunes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NextSignUpFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_sign_up_form);
    }

    public void goToHomeGarden(View view)
    {
        Intent intent = new Intent(this, HomeGardenActivity.class);
        startActivity(intent);
    }
}
