package com.kk.eureka.service;



import com.kk.eureka.model.User;
import com.kk.eureka.model.query.UserQuery;

import java.util.List;

/**
 * @author rj
 */
public interface UserMng {



    /**
     * 添加
     * @param model
     * @return
     * @throws Exception
     */
    int addUser(User model) throws Exception;

    /**
     * 编辑
     * @param model
     * @throws Exception
     */
    int updateUser(User model) throws Exception;

    /**
     * 根据ID得到
     * @param id
     * @return
     * @throws Exception
     */
     User getUserById(String id) throws Exception;
    /**
     * 删除
     * @param ids
     * @return
     * @throws Exception
     */
    int delUserByIds(List<String> ids) throws Exception;

    /**
     * 删除by model
     * @param model
     * @return
     * @throws Exception
     */
    int delUserByModel(User model) throws Exception;

    /**
     * 得到信息
     * @param query
     * @return
     */
    List<User> getUserAll(UserQuery query) throws Exception;

    /**
     * 得到条数
     * @param query
     * @return
     * @throws Exception
     */
    int getUserCount(UserQuery query) throws Exception;
}
