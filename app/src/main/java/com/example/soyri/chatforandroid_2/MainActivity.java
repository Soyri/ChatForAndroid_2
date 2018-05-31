package com.example.soyri.chatforandroid_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    TextView textViewIPAddress;
    TextView textViewPort;
    EditText editTextAddress;
    public static String EXTRA_CHATWINDOW = "This is meant to be a chat ";
    String chatMessage = "This is chatMessage";
    public String connectedIPAddress = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewIPAddress = (TextView) findViewById(R.id.textViewIPAddress_id);
        textViewPort = (TextView) findViewById(R.id.textViewPort_id);
        Button listen_button = (Button) findViewById(R.id.button_listen_id);
        listen_button.setOnClickListener(this); // calling onClick() method
        Button connect_button = (Button) findViewById(R.id.button_connect_id);
        connect_button.setOnClickListener(this);
        editTextAddress = (EditText) findViewById(R.id.editTextIPAddress_id);
    }


    /** Called when the user taps the Connect button */
    public void chatWindow(View v) {
        // Do something in response to button
        Intent intent = new Intent(this, ChatActivity.class);
        intent.putExtra(EXTRA_CHATWINDOW, chatMessage);
        startActivity(intent);


    }

    @Override
    public void onClick(View v) {
        // default method for handling onClick Events..
        switch (v.getId()) {

            case R.id.button_listen_id:
                // do your code
                //Server uses listen to alert the TCP/IP machine of the willingness to accept connections.
                textViewPort.setText("Hail Cthulhu!");
                Toast.makeText(getApplicationContext(),"Ok,listen works" ,Toast.LENGTH_SHORT).show();
                break;

            case R.id.button_connect_id:
                // do your code
                // Client connects socket  to a foreign host with the connect button.
                //Toast.makeText(getApplicationContext(),"Ok,connect works" ,Toast.LENGTH_SHORT).show();
                chatWindow(v);
                connectedIPAddress = editTextAddress.getText().toString();
                break;

            default:
                break;
        }
    }
}
