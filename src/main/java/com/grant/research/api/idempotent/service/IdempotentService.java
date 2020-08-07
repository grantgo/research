package com.grant.research.api.idempotent.service;

import com.grant.research.api.idempotent.dao.IdempotentDao;
import com.grant.research.api.idempotent.entity.Idempotent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdempotentService {

    @Autowired
    IdempotentDao idempotentDao;

    public Idempotent get(Integer id) {
        return idempotentDao.getById(id);
    }
}
