package com.xuxd.kafka.console.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xuxd.kafka.console.beans.dos.SysUserDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: xuxd
 * @date: 2023/4/11 21:22
 **/
@Mapper
public interface SysUserMapper extends BaseMapper<SysUserDO> {
}
