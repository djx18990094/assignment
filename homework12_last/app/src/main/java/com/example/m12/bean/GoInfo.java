package com.example.m12.bean;

import com.example.m12.R;

import java.util.ArrayList;

public class GoInfo {
    public int pic_id;
    public String title;
    public String desc;
    public boolean bPressed;
    public int id;
    private static int seq = 0;

    public GoInfo(int pic_id, String title, String desc) {
        this.pic_id = pic_id;
        this.title = title;
        this.desc = desc;
        this.bPressed = false;
        this.id = this.seq;
        this.seq++;
    }
    private static int[] gridImageArray = {R.drawable.pic_01, R.drawable.pic_02, R.drawable.pic_03
            , R.drawable.pic_04, R.drawable.pic_05, R.drawable.pic_06, R.drawable.pic_07
            , R.drawable.pic_08, R.drawable.pic_09, R.drawable.pic_10};
    private static String[] gridTitleArray = {"口红", "眼影", "粉底液", "隔离防晒",
            "护肤品", "面膜", "保健品", "服饰", "会所", "养生馆"};

    public static ArrayList<GoInfo> getDefaultGrid() {
        ArrayList<GoInfo> gridArray = new ArrayList<GoInfo>();
        for (int i = 0; i < gridImageArray.length; i++) {
            gridArray.add(new GoInfo(gridImageArray[i], gridTitleArray[i], null));
        }
        return gridArray;
    }



    private static int[] stagImageArray = {R.drawable.p1, R.drawable.p2, R.drawable.p3
            , R.drawable.p4, R.drawable.p5, R.drawable.p6, R.drawable.p7
            , R.drawable.p8, R.drawable.p9, R.drawable.p10, R.drawable.p11
            , R.drawable.p12};
    private static String[] stagTitleArray = {"美妆直播", "美妆教学", "热门产品", "明星产品", "新品上市", "明星达人",
            "直播带货", "限时秒杀", "满意价", "在线直播", "时尚达人", "速速抢购", "算了吧", "大声点",
           };

    public static ArrayList<GoInfo> getDefaultStag() {
        ArrayList<GoInfo> stagArray = new ArrayList<GoInfo>();
        for (int i = 0; i < stagImageArray.length; i++) {
            stagArray.add(new GoInfo(stagImageArray[i], stagTitleArray[i], null));
        }
        return stagArray;
    }





}
