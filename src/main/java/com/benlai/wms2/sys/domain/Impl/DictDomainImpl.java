package com.benlai.wms2.sys.domain.Impl;

import com.benlai.wms2.sys.data.IDictData;
import com.benlai.wms2.sys.domain.IDictDomain;
import com.benlai.wms2.sys.entity.Dict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author:gaoxu;
 * Email:gaoxu@benlai.com
 * DATE:2017/8/4
 * version:ver1.0
 * Description:业务层
 * Created by gaoxu on 2017/8/4.
 */

@Service
public class DictDomainImpl implements IDictDomain{

    @Autowired
    IDictData dictData;

    @Override
    public Dict getById(Long id) throws Exception {
        return dictData.getById(id);
    }

    @Override
    public void deleteById(Long id) throws Exception {
        dictData.deleteById(id);
    }
}
