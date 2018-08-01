package com.ccb.admin.xiaodemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * @Author liuhailin
 * Created by zz on 2018/7/31 17:40.
 * 　　class explain:
 * 　　　　update:       upAuthor:      explain:
 */

public class MyService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.i("mylog","onTestBind");
        return service;
    }
    IService.Stub service = new IService.Stub() {

         @Override
        public void sayHello() throws RemoteException {
            Log.i("mylog","hello world!");
        }
    };
}
