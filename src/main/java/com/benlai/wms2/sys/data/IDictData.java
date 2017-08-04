package com.benlai.wms2.sys.data;

import com.benlai.wms2.sys.entity.Dict;

/**
 * Author:gaoxu;
 * Email:gaoxu@benlai.com
 * DATE:2017/8/4
 * version:ver1.0
 * Description:
 * Created by gaoxu on 2017/8/4.
 */

public interface IDictData {

    Dict getById(Long id) throws Exception;

    void deleteById(Long id)throws Exception;

}
