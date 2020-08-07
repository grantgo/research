package com.grant.research.api.redis.controller;

import com.grant.research.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisUtils redisUtils;

    /**
     * 测试redis能够正常使用 (查询)
     * @param redisKey redis key
     * @param request HttpServletRequest
     * @return
     */
    @PostMapping(value = "get",produces = "application/json;charset=UTF-8")
    public String get(String redisKey,HttpServletRequest request){
        return String.valueOf(redisUtils.get(redisKey));
    }

    /**
     * 测试redis能够正常使用 （插入/更新）
     * @param redisKey redis key
     * @param redisValue redis value
     * @param request HttpServletRequest
     * @return
     */
    @PostMapping(value = "set",produces = "application/json;charset=UTF-8")
    public void set(String redisKey,String redisValue,HttpServletRequest request){
       redisUtils.set(redisKey,redisValue);
    }

    /**
     * 测试redis能够正常使用 （不存在即插入）
     * @param redisKey redis key
     * @param redisValue redis value
     * @param request HttpServletRequest
     * @return
     */
    @PostMapping(value = "setNX",produces = "application/json;charset=UTF-8")
    public boolean setNX(String redisKey,String redisValue,HttpServletRequest request){
        return redisUtils.setNX(redisKey,redisValue);
    }
}
