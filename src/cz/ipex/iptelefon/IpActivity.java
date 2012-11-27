package cz.ipex.iptelefon;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class IpActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void openBrowser(View view) {
        if (BuildConfig.DEBUG) Log.i("ip-telefon", "Click!");
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ip-telefon.cz")));
    }
}
