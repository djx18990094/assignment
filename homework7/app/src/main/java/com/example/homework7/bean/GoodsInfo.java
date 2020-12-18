package com.example.homework7.bean;

import com.example.homework7.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "DIOR口红999", "DIOR口红888", "DIOR口红666", "DIOR唇彩", "DIOR气垫", "DIOR香水男士","DIOR香水女士","DIOR礼盒"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "DIOR全新正品迪奥烈焰蓝金唇膏传奇新色丝绒999",
            "DIOR全新魅惑唇釉唇膏 红管漆光888",
            "DIOR全新正品烈焰蓝金挚红唇黑管666",
            "DIOR魅惑变色润唇膏 变色 001/004/007",
            "[官方正品]DIOR锁妆持久凝脂恒久气垫控油持久遮瑕轻薄补妆",
            "[官方正品]DIOR旷野男士淡香氛经典淡香水EDT",
            "DIOR魅惑浓香水 女士",
            "DIOR大礼盒"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {350, 350, 350, 330, 520, 680,690,1888};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.black_s, R.drawable.red_s, R.drawable.black2_s,
            R.drawable.pink_s, R.drawable.f_s, R.drawable.xs_s,R.drawable.xs2_s,R.drawable.lh_s,
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.black, R.drawable.red, R.drawable.black2,
            R.drawable.pink, R.drawable.foundation, R.drawable.xs,R.drawable.xs2,R.drawable.lh,
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
