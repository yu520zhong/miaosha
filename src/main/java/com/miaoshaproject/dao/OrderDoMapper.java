package com.miaoshaproject.dao;

import com.miaoshaproject.dataobject.OrderDo;

public interface OrderDoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Fri Dec 21 17:53:29 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Fri Dec 21 17:53:29 CST 2018
     */
    int insert(OrderDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Fri Dec 21 17:53:29 CST 2018
     */
    int insertSelective(OrderDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Fri Dec 21 17:53:29 CST 2018
     */
    OrderDo selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Fri Dec 21 17:53:29 CST 2018
     */
    int updateByPrimaryKeySelective(OrderDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Fri Dec 21 17:53:29 CST 2018
     */
    int updateByPrimaryKey(OrderDo record);
}