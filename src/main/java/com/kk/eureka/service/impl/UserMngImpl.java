package com.kk.eureka.service.impl;




import com.kk.eureka.mapper.UserDao;
import com.kk.eureka.model.User;
import com.kk.eureka.model.query.UserQuery;
import com.kk.eureka.service.UserMng;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserMngImpl implements UserMng {
    /**
     * 分页信息
     */
    @Resource
    private UserDao dao;

    /**
     * 添加
     * @param model
     * @throws Exception
     */
    @Override
    public int addUser(User model) throws Exception {
       return dao.addUser(model);
    }

    /**
     * 编辑
     * @param model
     * @throws Exception
     */
    @Override
    public int updateUser(User model) throws Exception{
        return dao.updateUser(model);
    }

    /**
     * 根据ID得到
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public User getUserById(String id) throws Exception{
        return dao.getUserById(id);
    }

    /**
     * 删除资源分类
     * @param ids
     * @return
     * @throws Exception
     */
    @Override
    public int delUserByIds(List<String> ids) throws Exception {
        return dao.delUserByIds(ids);
    }

    @Override
    public int delUserByModel(User model) throws Exception{
        return dao.delUserByModel(model);
    }

    /**
     * 得到信息
     * @param query
     * @return
     */
    @Override
    public List<User> getUserAll(UserQuery query) throws Exception{
        return dao.getUserAll(query);
    }

    /**
     * 得到条数
     * @param query
     * @return
     * @throws Exception
     */
    @Override
    public int getUserCount(UserQuery query) throws Exception{
        return dao.getUserCount(query);
    }
}
