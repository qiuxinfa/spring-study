package com.qxf.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface UserBalanceMapper {

    @Update("update user_balance set balance = balance - #{balance} where id = #{id}")
    int updateUserBalance(@Param("id") String id, @Param("balance") Integer balance);
}
