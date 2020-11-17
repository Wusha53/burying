package com.ws.myburyinglibrary;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

//设置数据库表的名字
@Table(name = "burying")
public class BuryingDB {
    //主键ID
    @Column(name = "id", isId = true, autoGen = true)//注释列名主键，主动增长
    private long id;

    //用户账号
    @Column(name = "userid")
    private String userid;
    //开始时间
    @Column(name = "starttime")
    private long starttime;

    //结束时间
    @Column(name = "endtime")
    private long endtime;
    //那个页面 自定义
    @Column(name = "activity")
    private String activity;
    //点击的按钮
    @Column(name = "onclick")
    private String onclick;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public long getStarttime() {
        return starttime;
    }

    public void setStarttime(long starttime) {
        this.starttime = starttime;
    }

    public long getEndtime() {
        return endtime;
    }

    public void setEndtime(long endtime) {
        this.endtime = endtime;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public  String  getOnclick() {
        return onclick;
    }

    public void setOnclick(String onclick) {
        this.onclick = onclick;
    }

    @Override
    public String toString() {
        return "BuryingDB{" +
                "id=" + id +
                ", userid='" + userid + '\'' +
                ", starttime=" + starttime +
                ", endtime=" + endtime +
                ", activity='" + activity + '\'' +
                ", onclick=" + onclick +
                '}';
    }
}
