package com.example.parselearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.parse.FindCallback;
import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.SaveCallback;
import com.parse.SignUpCallback;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ParseObject parseObject=new ParseObject("fruit");
//        parseObject.put("name","apple");
//        parseObject.put("calori",100);
//        parseObject.saveInBackground(new SaveCallback() {
//            @Override
//            public void done(ParseException e) {
//                if (e!=null){
//                    Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_LONG).show();
//                }
//                else{
//                    Toast.makeText(getApplicationContext(), "Object Saved",Toast.LENGTH_LONG).show();
//                }
//            }
//        });

//        ParseQuery<ParseObject> query=ParseQuery.getQuery("fruit");
//        query.findInBackground(new FindCallback<ParseObject>() {
//            @Override
//            public void done(List<ParseObject> objects, ParseException e) {
//                if (e!=null){
//                    e.fillInStackTrace();
//                }else{
//                    if (objects.size()>0){
//                        for (ParseObject nesne:objects) {
//                            System.out.println(nesne.getObjectId());
//                        }
//                    }
//                }
//            }
//        });

        ParseUser user=new ParseUser();
//        user.setUsername("Kumsal");
//        user.setPassword("123456");
//        user.signUpInBackground(new SignUpCallback() {
//            @Override
//            public void done(ParseException e) {
//                if (e!=null){
//                    e.fillInStackTrace();
//                }
//                else{
//                    Toast.makeText(MainActivity.this,"Sign Up",Toast.LENGTH_LONG).show();
//                }
//            }
//        });
        ParseUser.logInInBackground("Kumsal", "123456", new LogInCallback() {
            @Override
            public void done(ParseUser user, ParseException e) {
                if (e!=null){
                    e.fillInStackTrace();
                }else{
                    Toast.makeText(MainActivity.this,"Welcome: "+user.getUsername(),Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}