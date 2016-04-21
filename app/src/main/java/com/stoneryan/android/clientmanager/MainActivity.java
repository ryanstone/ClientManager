package com.stoneryan.android.clientmanager;


import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
<<<<<<< HEAD
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Toast;

=======
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
>>>>>>> 4067b578267fc7c818159cfdba7e381f5eb3d3a5

import layout.DisplayUsernameFragment;

public class MainActivity extends AppCompatActivity implements DisplayUsernameFragment.OnFragmentInteractionListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Client Manager - Home");


<<<<<<< HEAD
        /** TODO: Verify that user is logged in.
        Bundle bundle = getIntent().getExtras();
        String username = bundle.getString("username");
        if (username != "jdoe") {
            Intent i = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(i);
            Toast.makeText(MainActivity.this, "Please Login", Toast.LENGTH_LONG).show();
        }
        Toast.makeText(MainActivity.this, username, Toast.LENGTH_LONG).show();**/

=======
>>>>>>> 4067b578267fc7c818159cfdba7e381f5eb3d3a5
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            fragment = new DisplayUsernameFragment();
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }

    }

    public void onFragmentInteraction(Uri uri){
        //you can leave it empty
    }

    public void CreateNewCustomerButton(View view) {
        Intent i = new Intent(MainActivity.this, CreateNewCustomerActivity.class);
        startActivity(i);
    }

    public void ViewCustomersButton(View view) {
        Intent i = new Intent(MainActivity.this, CustomerListActivity.class);
        startActivity(i);
    }
}
