package com.example.soyri.chatforandroid_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    TextView editTextILogin_id;
    TextView textViewPort;
    EditText editTextILogin;
    public static String EXTRA_CHATWINDOW = "This is meant to be a chat ";
    String chatMessage = "This is chatMessage";
    public static String loginString = "";
    //MemberData data = new MemberData("Login", "Green", "password");
    List<MemberData> listOfMembers = new ArrayList<MemberData>();
    MemberData data = listOfMembers.get(0);
    List<String> listOfLoginNames = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button enterlogin_button = (Button) findViewById(R.id.button_enterlogin_id);
        enterlogin_button.setOnClickListener(this); // calling onClick() method
        editTextILogin = (EditText) findViewById(R.id.editTextLogin_id);   }


    /** Called when the user taps the Connect button */
    public void chatWindow(View v) {
        // Do something in response to button
        Intent intent = new Intent(this, ChatActivity.class);
        intent.putExtra(EXTRA_CHATWINDOW, chatMessage);
        startActivity(intent);


    }

    //Called when user pairs login with password

    @Override
    public void onClick(View v) {
        // default method for handling onClick Events..
                // do your code
                // Client connects socket  to a foreign host with the connect button.
                //Toast.makeText(getApplicationContext(),"Ok,connect works" ,Toast.LENGTH_SHORT).show();
                chatWindow(v);
                loginString = editTextILogin.getText().toString();

    }
}

