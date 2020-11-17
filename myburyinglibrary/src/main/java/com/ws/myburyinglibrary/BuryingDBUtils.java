package com.ws.myburyinglibrary;


import org.xutils.DbManager;
import org.xutils.ex.DbException;

import java.util.List;

/**
 * "BuryingDB{" +
 * "id=" + id +
 * ", userid='" + userid + '\'' +
 * ", starttime=" + starttime +
 * ", endtime=" + endtime +
 * ", activity='" + activity + '\'' +
 * ", onclick=" + onclick +
 * '}';
 */
public class BuryingDBUtils {
    public static DbManager dbManager;
    public  static  void init(DbManager dbManagers) {
        if (dbManager==null){
            dbManager=dbManagers;
        }
    }

    public static void addBurying(String userid, long starttime, long endtime, String activity, String onclick) throws DbException {

        BuryingDB buryingDB = new BuryingDB();
        buryingDB.setActivity(activity);
        buryingDB.setEndtime(endtime);
        buryingDB.setOnclick(onclick);
        buryingDB.setStarttime(starttime);
        buryingDB.setUserid(userid);
        dbManager.save(buryingDB);
    }
    public static List<BuryingDB> selet(){

        List<BuryingDB> buryingDBS = null;
        try {
            buryingDBS = dbManager.findAll(BuryingDB.class);

        } catch (DbException e) {
            e.printStackTrace();
        }
        return buryingDBS;
    }
}
