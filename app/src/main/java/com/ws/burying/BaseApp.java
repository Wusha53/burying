package com.ws.burying;

import android.app.Application;
import android.content.Context;

import com.ws.myburyinglibrary.BuryingDBUtils;

import org.xutils.DbManager;
import org.xutils.x;

public class BaseApp extends Application {
    private static volatile Context mContext;
    private static BaseApp instance;

    public static BaseApp getInstance() {
        return instance;
    }

    public void onCreate() {
        super.onCreate();
        //注册xUtils
        x.Ext.init(this);
        mContext = getApplicationContext();
        instance = this;

        BuryingDBUtils.init(BaseApp.getInstance().BuryingDBManager());
    }

    public static Context getContext() {
        return mContext;
    }



    public DbManager BuryingDBManager() {
        DbManager.DaoConfig daoConfig = new DbManager.DaoConfig();
        //设置数据库的名字
        daoConfig.setDbName("burying.db");
        //设置数据库的版本号，默认为1
        daoConfig.setDbVersion(1);
        return x.getDb(daoConfig);
    }

}