package com.dubbo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.api.service.CostService;

@Service
public class CostServiceImpl implements CostService {
    @Override
    public Integer add(int cost) {
        return 10000 + cost;
    }
}
