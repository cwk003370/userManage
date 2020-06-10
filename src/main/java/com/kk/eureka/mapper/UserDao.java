package com.kk.eureka.mapper;


import com.kk.eureka.model.User;
import com.kk.eureka.model.query.UserQuery;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author rj
 */
@Mapper
public interface UserDao {

    /**
     * 添加
     * @param model
     * @return
     * @throws Exception
     */
    int addUser(User model);

    /**
     * 编辑
     * @param model model
     * @return int
     * @throws Exception exception
     */
    int updateUser(User model)throws Exception;

    /**
     * 根据ID删除
     * @param list id 数组
     * @return int
     * @throws Exception exception
     */
    int delUserByIds(List<String> list);

    /**
     * 删除by model
     * @param model
     * @return
     * @throws Exception
     */
    int delUserByModel(User model);

    /**
     * 根据ID得到
     * @param id
     * @return
     * @throws Exception
     */
        User getUserById(@RequestParam(value = "id") String id);

    /**
     * 根据条件
     * @param query
     * @return
     * @throws Exception
     */
    List<User> getUserAll(UserQuery query);


    /**
     * 得到条数
     * @param query
     * @return
     * @throws Exception
     */
    int getUserCount(UserQuery query);
}
