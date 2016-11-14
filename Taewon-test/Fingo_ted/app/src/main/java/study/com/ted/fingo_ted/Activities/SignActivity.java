package study.com.ted.fingo_ted.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import study.com.ted.fingo_ted.R;

public class SignActivity extends AppCompatActivity {

    Button btnSignEmail;
    Button btnSignFB;
    Button btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);

        btnSignEmail = (Button) findViewById(R.id.btnSignEmail);
        btnSignFB = (Button) findViewById(R.id.btnSignFB);

        btnSignIn = (Button) findViewById(R.id.btnSignIn);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignActivity.this, SignInActivity.class);
                startActivity(intent);
                overridePendingTransition(android.support.design.R.anim.abc_fade_in, android.support.design.R.anim.abc_fade_out);
                finish();
            }
        });

    }

}
