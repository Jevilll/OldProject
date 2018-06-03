package com.example.jevil.selfjournal.screen.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.jevil.selfjournal.R;
import com.example.jevil.selfjournal.screen.events.list.EventsListFragment;
import com.example.jevil.selfjournal.screen.history.HistoryFragment;
import com.example.jevil.selfjournal.screen.settings.SettingsFragment;
import com.example.jevil.selfjournal.screen.statistic.common.StatisticCommonFragment;
import com.example.jevil.selfjournal.screen.statistic.expanded.StatisticExpandedFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NavigationActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.drawer_layout)
    DrawerLayout drawer;
    @BindView(R.id.nav_view)
    NavigationView navigationView;

    FragmentManager fragmentManager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialization();


    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Fragment fragment = null;
        Class fragmentClass = null;

        int id = item.getItemId();

        switch (id) {
            case R.id.navEvents:
                fragmentClass = EventsListFragment.class;
                break;
            case R.id.navHistory:
                fragmentClass = HistoryFragment.class;
                break;
            case R.id.navCommon:
                fragmentClass = StatisticCommonFragment.class;
                break;
            case R.id.navExpanded:
                fragmentClass = StatisticExpandedFragment.class;
                break;
            case R.id.navSettings:
                fragmentClass = SettingsFragment.class;
                break;
        }

        try {
            if (fragmentClass != null) {
                fragment = (Fragment) fragmentClass.newInstance();
                fragmentManager
                        .beginTransaction().replace(R.id.container, fragment).commit();
                item.setChecked(true);
                setTitle(item.getTitle());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void initialization() {
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);
        onNavigationItemSelected(navigationView.getMenu().getItem(0));
    }
}
