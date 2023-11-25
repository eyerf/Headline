package com.atguigu.service;

import com.atguigu.pojo.Type;
import com.atguigu.utils.Result;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 18345
* @description 针对表【news_type】的数据库操作Service
* @createDate 2023-11-23 12:39:22
*/
public interface TypeService extends IService<Type> {

    Result findAllTypes();
}
