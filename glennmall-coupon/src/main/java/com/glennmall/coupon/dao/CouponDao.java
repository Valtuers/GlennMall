package com.glennmall.coupon.dao;

import com.glennmall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author Valtuers
 * @email 1581510541@qq.com
 * @date 2020-11-20 08:54:41
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
