package com.hyt.algorithm.provider;

import com.hyt.algorithm.ContourService;

/**
 * Created by cheng on 2017/3/14.
 */
public class ContourServiceImp implements ContourService{
    public String contour(String dataPath, double[] levels) {
        //实现自己的接口
        String value = String.format("{data:%s}",dataPath);
        return value;
    }
    public String contourFill(String dataPath, double[] levels) {
        //实现自己的接口
        String value = String.format("{data:%s}",dataPath);
        return value;
    }
}
