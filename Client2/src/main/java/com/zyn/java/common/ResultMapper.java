package com.zyn.java.common;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author zhangyanan
 * @description
 * @date 2017/10/30 0030 21:30
 */
public interface ResultMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
