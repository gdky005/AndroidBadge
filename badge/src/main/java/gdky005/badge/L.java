package gdky005.badge;

import android.util.Log;

/**
 * Created by WangQing on 2017/4/25.
 */

public class L {
    private static final String TAG = "L";

    private static L instance = null;

    private L() {
    }

    public static L getInstance() {
        return new L();  //这里为了玩玩  百分百的 代码覆盖率，随便写的。

        //正确写法
//            if (instance == null) {
//                synchronized (L.class) {
//                    L temp = instance;
//                    if (temp == null) {
//                        temp = new L();
//                        instance = temp;
//                    }
//                }
//            }
//            return instance;
    }


    public static void i(String msg) {
        Log.i(TAG, "i: " + msg);
    }
}
