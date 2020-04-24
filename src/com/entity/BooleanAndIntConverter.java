package com.entity;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by wei on 2020/4/19.
 */
public class BooleanAndIntConverter extends BaseTypeHandler<Boolean>{


    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, Boolean aBoolean, JdbcType jdbcType) throws SQLException {
        if (aBoolean){
            preparedStatement.setInt(i,1);
        }else{
            preparedStatement.setInt(i,0);
            System.out.println("111");
        }
    }

    @Override
    public Boolean getNullableResult(ResultSet resultSet, String columName) throws SQLException {
        int anInt = resultSet.getInt(columName);
        return anInt==1?true:false;
    }

    @Override
    public Boolean getNullableResult(ResultSet resultSet, int columIndex) throws SQLException {
        int anInt = resultSet.getInt(columIndex);
        return anInt==1?true:false;
    }
    @Override
    public Boolean getNullableResult(CallableStatement var1, int var2)throws SQLException{
        int sexNum = var1.getInt(var2);
        if(sexNum == 1)
            return true;
        return false;
    }
}
