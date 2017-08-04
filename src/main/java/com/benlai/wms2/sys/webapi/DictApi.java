package com.benlai.wms2.sys.webapi;

import com.benlai.wms2.sys.domain.IDictDomain;
import com.benlai.wms2.sys.entity.Dict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Author:gaoxu;
 * Email:gaoxu@benlai.com
 * DATE:2017/8/4
 * version:ver1.0
 * Description:web层
 * Created by gaoxu on 2017/8/4.
 */

@RestController
@RequestMapping("sys/webapi/dict")
public class DictApi {

    @Autowired
    IDictDomain dictDomain;

    @GetMapping("/get/id/{id}")
    public Dict getById(@PathVariable Long id) throws Exception{
        return dictDomain.getById(id);
    }

    @PostMapping("/delete/id/{id}")
    public void deleteId(@PathVariable Long id) throws Exception{
        dictDomain.deleteById(id);
    }
}
