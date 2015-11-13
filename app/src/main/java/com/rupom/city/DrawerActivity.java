package com.rupom.city;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.rupom.city.adapters.CardViewDataAdapter;
import com.rupom.city.models.CardProperties;

import java.util.ArrayList;

public class DrawerActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private RecyclerView recyclerView;
    private CardView cardView;

    private ArrayList<CardProperties> os_versions;

    private RecyclerView.Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final ActionBar ab = getSupportActionBar();
        ab.setHomeAsUpIndicator(R.drawable.ic_menu);
        ab.setDisplayHomeAsUpEnabled(true);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        if (navigationView != null) {
            setupDrawerContent(navigationView);
        }
        initContrls();


//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

    }

    private void initContrls() {

     //   toolbar = (Toolbar) findViewById(R.id.toolbar);
        //  cardView = (CardView) findViewById(R.id.cardList);
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

//        if (toolbar != null) {
//            setSupportActionBar(toolbar);
//            getSupportActionBar().setTitle("Android Versions");
//
//        }

        final String[] versions = {"Traffic Update", "Your Places", "Best Route", "F n F",
                "Top Restaurants", "Bank/ATM Locator", "Dhaka Police Stations", "CNG Stations",
                "Important Phones"};
        final int[] icons = {R.drawable.ic_launcher, R.drawable.ic_launcher, R.drawable.ic_launcher, R.drawable.ic_launcher, R.drawable.ic_launcher, R.drawable.ic_launcher, R.drawable.ic_launcher, R.drawable.ic_launcher, R.drawable.ic_launcher};


        os_versions = new ArrayList<CardProperties>();

        for (int i = 0; i < versions.length; i++) {
            CardProperties feed = new CardProperties();

            feed.setTitle(versions[i]);
            feed.setThumbnail(icons[i]);
            os_versions.add(feed);
        }

        recyclerView.setHasFixedSize(true);

        // ListView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Grid View
        // recyclerView.setLayoutManager(new GridLayoutManager(this,2,1,false));

        //StaggeredGridView
        // recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,1));

        // create an Object for Adapter
        mAdapter = new CardViewDataAdapter(os_versions);

        // set the adapter object to the Recyclerview
        recyclerView.setAdapter(mAdapter);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.sample_actions, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                switch (menuItem.getItemId()) {

                    case R.id.nav_traffic_update:
                        mDrawerLayout.closeDrawers();
                        Toast.makeText(getApplicationContext(),"Traffic Update",Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.nav_your_places:
                        mDrawerLayout.closeDrawers();
                        Toast.makeText(getApplicationContext(), "Your Places", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.nav_best_route:
                        mDrawerLayout.closeDrawers();
                        Toast.makeText(getApplicationContext(), "Best Route", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.nav_top_restaurant:
                        mDrawerLayout.closeDrawers();
                        Toast.makeText(getApplicationContext(), "Top Restaurants", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.nav_fnf:
                        mDrawerLayout.closeDrawers();
                        Toast.makeText(getApplicationContext(), "Friends n Family", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.nav_bank_atm_locator:
                        mDrawerLayout.closeDrawers();
                        Toast.makeText(getApplicationContext(), "Bank/ATM Locator", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.nav_cng_stations:
                        mDrawerLayout.closeDrawers();
                        Toast.makeText(getApplicationContext(), "CNG Stations", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.nav_dhaka_police_stations:
                        mDrawerLayout.closeDrawers();
                        Toast.makeText(getApplicationContext(), "Dhaka Police Stations", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.nav_important_phones:
                        mDrawerLayout.closeDrawers();
                        Toast.makeText(getApplicationContext(), "Important Phones", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.nav_sub_menu_your_profile:
                        mDrawerLayout.closeDrawers();
                        Toast.makeText(getApplicationContext(), "Your Profile", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.nav_sub_menu_feedback:
                        mDrawerLayout.closeDrawers();
                        Toast.makeText(getApplicationContext(), "Feedback", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.nav_sub_menu_subscriptions:
                        mDrawerLayout.closeDrawers();
                        Toast.makeText(getApplicationContext(), "Subscriptions", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.nav_sub_menu_user_guide:
                        mDrawerLayout.closeDrawers();
                        Toast.makeText(getApplicationContext(), "Useer Guide", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.nav_sub_menu_about_us:
                        mDrawerLayout.closeDrawers();
                        Toast.makeText(getApplicationContext(), "About US", Toast.LENGTH_SHORT).show();
                        return true;
            }
             //   menuItem.setChecked(true);

                return true;
        }

});

}
}