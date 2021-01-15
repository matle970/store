package com.store.service;

import java.util.List;

import com.store.domain.Goods;

public interface GoodsService {

    List<Goods> queryAll();

    List<Goods> queryByStartEnd(int start, int end);

    Goods querDetail(long goodsid);

}

