package bo.upb.programacion3.codelabpokedex;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText user;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

       initUI();
       login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               validate(user.getText().toString());
           }
       });

    }

    private void initUI() {
        this.user = findViewById(R.id.userText);

    }

    private void validate(String userName){
        if (userName == "Ash"){
            Toast.makeText(this,
                    "Ash",
                    Toast.LENGTH_SHORT)
                    .show();
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }else if (userName == "Brock"){
            Toast.makeText(this,
                    "Brock",
                    Toast.LENGTH_SHORT)
                    .show();
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }else if (userName == "Rocket"){
            Toast.makeText(this,
                    "Rocker",
                    Toast.LENGTH_SHORT)
                    .show();
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(this,
                    "Error!!!",
                    Toast.LENGTH_SHORT)
                    .show();

        }
    }

}
