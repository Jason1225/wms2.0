package com.benlai.wms2.sys.data.Impl;

import com.benlai.wms2.sys.data.IDictData;
import com.benlai.wms2.sys.data.mapper.DictMapper;
import com.benlai.wms2.sys.entity.Dict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Author:gaoxu;
 * Email:gaoxu@benlai.com
 * DATE:2017/8/4
 * version:ver1.0
 * Description:数据层
 * Created by gaoxu on 2017/8/4.
 */

@Repository
public class DictDataImpl implements IDictData {

    @Autowired
    private DictMapper dictMapper;

    @Override
    public Dict getById(Long id) throws Exception {
        return dictMapper.getById(id);
    }

    @Override
    public void deleteById(Long id) throws Exception {
        dictMapper.deleteById(id);
    }

}
