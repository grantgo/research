package com.grant.research.api.idempotent.dao;
import com.grant.research.api.idempotent.entity.Idempotent;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IdempotentDao {

    Idempotent getById(Integer id);
}
