package com.stoneryan.android.clientmanager;

<<<<<<< HEAD
import android.content.Intent;
=======
>>>>>>> 4067b578267fc7c818159cfdba7e381f5eb3d3a5
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
<<<<<<< HEAD
import android.view.View;
import android.widget.Toast;
=======
>>>>>>> 4067b578267fc7c818159cfdba7e381f5eb3d3a5

import layout.DisplayUsernameFragment;

public class BillingInfoActivity extends AppCompatActivity implements DisplayUsernameFragment.OnFragmentInteractionListener  {

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_billing_info);

        setTitle("Enter Billing Info");

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
        fragment = new DisplayUsernameFragment();
        fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }

        }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
<<<<<<< HEAD

    public void CancelButton(View view) {
        Intent i = new Intent(BillingInfoActivity.this, ViewCustomerActivity.class);
        startActivity(i);
    }

    public void SaveButton(View view) {
        // TODO: Save billing info to database
        Toast.makeText(BillingInfoActivity.this, R.string.billing_info_saved, Toast.LENGTH_LONG).show();
        Intent i = new Intent(BillingInfoActivity.this, ViewCustomerActivity.class);
        startActivity(i);
    }

=======
>>>>>>> 4067b578267fc7c818159cfdba7e381f5eb3d3a5
}
