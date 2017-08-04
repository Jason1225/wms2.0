package com.benlai.wms2.sys.data.mapper;

import com.benlai.wms2.sys.entity.Dict;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Author:gaoxu;
 * Email:gaoxu@benlai.com
 * DATE:2017/8/4
 * version:ver1.0
 * Description:
 * Created by gaoxu on 2017/8/4.
 */

@Mapper
public interface DictMapper {

    Dict getById(@Param("id") Long id) throws Exception;

    void deleteById(@Param("id")Long id) throws Exception;
}
