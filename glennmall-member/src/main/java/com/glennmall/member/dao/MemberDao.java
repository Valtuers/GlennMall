package com.glennmall.member.dao;

import com.glennmall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Valtuers
 * @email 1581510541@qq.com
 * @date 2020-11-20 09:10:58
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
