package com.qxf.mapper;

import org.apache.ibatis.annotations.Update;

public interface ProductStoreMapper {

    @Update("update product_store set cnt = cnt-1 where id = #{id}")
    int updateProductStore(String id);
}
