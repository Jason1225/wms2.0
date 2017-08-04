package com.benlai.wms2.sys.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Author:gaoxu;
 * Email:gaoxu@benlai.com
 * DATE:2017/8/4
 * version:ver1.0
 * Description:对应数据库中的实体类
 * Created by gaoxu on 2017/8/4.
 */

@Data
public class Dict implements Serializable{

    private Long id;

    private Short dictNo;

    private String dictName;

    private String createdBy;

    private Date createdOn;

    private String updatedBy;

    private Date updatedOn;

    private Integer version;

    private static final long serialVersionUID = 1L;
}
