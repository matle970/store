package com.store.service.imp;

import java.util.List;

import com.store.dao.GoodsDao;
import com.store.dao.imp.GoodsDaoImpJdbc;
import com.store.domain.Goods;
import com.store.service.GoodsService;

public class GoodsServiceImp implements GoodsService {

    GoodsDao goodsDao = new GoodsDaoImpJdbc();

    @Override
    public List<Goods> queryAll() {
        return goodsDao.findAll();
    }

    @Override
    public List<Goods> queryByStartEnd(int start, int end) {
        return goodsDao.findStartEnd(start, end);
    }

    @Override
    public Goods querDetail(long goodsid) {
        return goodsDao.findByPk(goodsid);
    }
}