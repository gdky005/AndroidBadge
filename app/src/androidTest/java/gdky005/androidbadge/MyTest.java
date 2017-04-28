package gdky005.androidbadge;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by WangQing on 2017/4/25.
 */
@RunWith(AndroidJUnit4.class)
public class MyTest {
    private static final String TAG = "MyTest";

    @Test
    public void testLog() {
        L.i("testLog");
    }

    @Test
    public void test() {
        L.getInstance();
    }
}
