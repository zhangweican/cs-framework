package com.leweiyou.service.mybatis.dao;

import com.leweiyou.service.mybatis.entry.TUserLogin;
import com.leweiyou.service.mybatis.entry.TUserLoginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserLoginMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_login
     *
     * @mbggenerated
     */
    int countByExample(TUserLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_login
     *
     * @mbggenerated
     */
    int deleteByExample(TUserLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_login
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_login
     *
     * @mbggenerated
     */
    int insert(TUserLogin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_login
     *
     * @mbggenerated
     */
    int insertSelective(TUserLogin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_login
     *
     * @mbggenerated
     */
    List<TUserLogin> selectByExampleWithBLOBs(TUserLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_login
     *
     * @mbggenerated
     */
    List<TUserLogin> selectByExample(TUserLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_login
     *
     * @mbggenerated
     */
    TUserLogin selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_login
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TUserLogin record, @Param("example") TUserLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_login
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") TUserLogin record, @Param("example") TUserLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_login
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TUserLogin record, @Param("example") TUserLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_login
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TUserLogin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_login
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(TUserLogin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_login
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TUserLogin record);
}