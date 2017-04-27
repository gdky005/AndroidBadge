package gdky005.badge;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

/**
 * Created by WangQing on 2017/4/25.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    private static final String TAG = "MainActivityTest";

    @Test
    public void onCreate() throws Exception {
        assertTrue(true);
    }

    @Test
    public void testActivities(){
        Context targetContext = InstrumentationRegistry.getTargetContext();
        PackageManager pm = targetContext.getPackageManager();
        PackageInfo info = null;
        try{
            info = pm.getPackageInfo(targetContext.getPackageName(), PackageManager.GET_ACTIVITIES);
        } catch(PackageManager.NameNotFoundException e) {
            Log.e(TAG, "testActivities: ", e);
        }

        ActivityInfo[] activities = info.activities;

        for(int i =0, length = activities.length; i < length; i++) {
            ActivityInfo aInfo = activities[i];
            Log.i(TAG, "["+ i +"] Try launch activity:"+ aInfo.name);
            try{
                tryStartActivity(targetContext, aInfo.name);
            } catch(Exception e) {
                Log.w(TAG, "Error in "+ aInfo.name +" : "+ e.getMessage());
            }
        }
    }

    private void tryStartActivity(Context targetContext, String name) {
        try {
            Intent intent = new Intent(targetContext, Class.forName(name));
            targetContext.startActivity(intent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}