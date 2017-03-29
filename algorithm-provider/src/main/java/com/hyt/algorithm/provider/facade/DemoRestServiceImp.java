package com.hyt.algorithm.provider.facade;

import com.hyt.algorithm.facade.DemoRestService;

/**
 * Created by cheng on 2017/3/27.
 */
public class DemoRestServiceImp implements DemoRestService{
    public String demo(String msg) {
        return msg;
    }
}
