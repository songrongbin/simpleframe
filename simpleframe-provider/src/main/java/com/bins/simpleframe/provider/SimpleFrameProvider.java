package com.bins.simpleframe.provider;

import com.bins.simpleframe.api.SimpleFrameAPI;

/**
 * Created by songrongbin on 2016/12/19.
 */
public class SimpleFrameProvider implements SimpleFrameAPI {


    @Override
    public Integer getOrderCount(Long userId) {
        return 1;
    }
}
