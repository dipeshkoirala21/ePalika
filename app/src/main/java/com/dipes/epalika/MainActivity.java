package com.dipes.epalika;

import android.os.Bundle;

import com.dipes.epalika.ui.main.SectionsPagerAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.Menu;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private TextView mTextMessage;
    private TabLayout tabs;

    RecyclerView mRecyclerView;
    List<CardName> mCardList;
    CardName mCardData;

//    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
//            = new BottomNavigationView.OnNavigationItemSelectedListener() {
//
//        @Override
//        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//            switch (item.getItemId()) {
//                case R.id.navigation_home:
//                   // mTextMessage.setText(R.string.title_home);
//
//                    return true;
//                case R.id.navigation_dashboard:
//                  //  mTextMessage.setText(R.string.title_dashboard);
//                    return true;
//                case R.id.navigation_notifications:
//                  //  mTextMessage.setText(R.string.title_notifications);
//                    return true;
//                case R.id.nav_menu:
//                  //  mTextMessage.setText(R.string.title_menu);
//                    return true;
//            }
//            return false;
//        }
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        Toolbar toolbar = findViewById(R.id.toolbar);
        mTextMessage = findViewById(R.id.message);
//        BottomNavigationView navView = findViewById(R.id.buttom_nav_view);
//        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        setSupportActionBar(toolbar);
//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

//        mRecyclerView = findViewById(R.id.recyclerview);
//        GridLayoutManager mGridLayoutManager = new GridLayoutManager(MainActivity.this, 3);
//        mRecyclerView.setLayoutManager(mGridLayoutManager);
//
//        mCardList= new ArrayList<>();
//
//        mCardData = new CardName("सेवाग्राही", R.drawable.ic_users);
//        mCardList.add(mCardData);
//
//        mCardData = new CardName("सेवा प्रदायक",
//                R.drawable.ic_sewapradayak);
//        mCardList.add(mCardData);
//
//        mCardData = new CardName("अन्य",
//                R.drawable.ic_others);
//        mCardList.add(mCardData);
//
//        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(MainActivity.this, mCardList);
//        mRecyclerView.setAdapter(myAdapter);
      //  createTabIcons();
        setupTabIcons();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_tools) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
//    private void createTabIcons() {
//
//        TextView tabOne = (TextView) LayoutInflater.from(this).inflate(R.layout.fragment_home_tab, null);
//        //tabOne.setText("सेवाग्राही");
//        tabOne.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_users, 0, 0);
//        tabs.getTabAt(0).setCustomView(tabOne);
//
//        TextView tabTwo = (TextView) LayoutInflater.from(this).inflate(R.layout.fragment_home_tab, null);
//        //tabTwo.setText("सेवा प्रदायक");
//        tabTwo.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_sewapradayak, 0, 0);
//        tabs.getTabAt(1).setCustomView(tabTwo);
//
//        TextView tabThree = (TextView) LayoutInflater.from(this).inflate(R.layout.fragment_home_tab, null);
//      //  tabThree.setText("अन्य");
//        tabThree.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_others, 0, 0);
//        tabs.getTabAt(2).setCustomView(tabThree);
//    }
private void setupTabIcons() {
    int[] tabIcons = {
            R.drawable.ic_users,
            R.drawable.ic_sewapradayak,
            R.drawable.ic_others
    };

    tabs.getTabAt(0).setIcon(tabIcons[0]);
    tabs.getTabAt(1).setIcon(tabIcons[1]);
    tabs.getTabAt(2).setIcon(tabIcons[2]);
}
}
