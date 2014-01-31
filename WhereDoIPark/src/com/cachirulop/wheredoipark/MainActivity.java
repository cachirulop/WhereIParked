
package com.cachirulop.wheredoipark;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.cachirulop.wheredoipark.activity.SettingsActivity;

public class MainActivity
        extends Activity
{

    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater ().inflate (R.menu.main,
                                    menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item)
    {
        switch (item.getItemId ()) {
            case R.id.action_settings:
                showPreferences ();
                return true;

            default:
                return super.onOptionsItemSelected (item);
        }
    }

    private void showPreferences ()
    {
        startActivity (new Intent (this,
                                   SettingsActivity.class));
    }
}
