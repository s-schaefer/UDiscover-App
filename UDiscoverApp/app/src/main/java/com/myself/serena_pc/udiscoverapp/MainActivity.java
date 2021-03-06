package com.myself.serena_pc.udiscoverapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * This activity starts the application. It then greets the user and provides a list of options (buttons)
 * the user can choose from.
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//Check GPS
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
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/*public void onTourClicked(View view)
	{
		Intent intent = new Intent(this, GetTourActivity.class);

		startActivity(intent);
	}*/

	public void onDirectionsClicked(View view)
	{
		Intent intent = new Intent(this, GetDirectionsActivity.class);

		startActivity(intent);
	}

	public void onInformationClicked(View view)
	{
		Intent intent = new Intent(this, GetInformationActivity.class);

		startActivity(intent);
	}

	public void onMapClicked(View view)
	{
		Intent intent = new Intent(this, GetPlainMapActivity.class);

		startActivity(intent);
	}

}
