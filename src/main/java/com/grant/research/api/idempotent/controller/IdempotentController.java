package com.grant.research.api.idempotent.controller;

import com.grant.research.api.idempotent.entity.Idempotent;
import com.grant.research.api.idempotent.service.IdempotentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.Oneway;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/idempotent")
public class IdempotentController {

    @Autowired
    IdempotentService idempotentService;

    @PostMapping(value = "get",produces = "application/json;charset=UTF-8")
    public Idempotent get(Integer id,HttpServletRequest request){
        return idempotentService.get(id);
    }
}
