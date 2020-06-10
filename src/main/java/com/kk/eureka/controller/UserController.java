package com.kk.eureka.controller;



import com.kk.eureka.model.User;
import com.kk.eureka.service.UserMng;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

	@Resource
	private UserMng userMng;



    /**
     * <pre>
     * 新增
     *     param:
     *        id: [必填] ID
     *        userNo: [必填] 用户ID
     *        userName: [必填] 用户名
     *        shortName: [必填] 账号名
     *        password: [必填] 账号密码
     *        telephone: 手机号
     *        qqCode: QQ号
     *        gender: 性别1-男0-女
     *        createTime: [必填] 创建时间
     *     return: 无
     * </pre>
     */
    @PostMapping("/user/addUser")
	public void addUser(@RequestBody User user) throws Exception {
		userMng.addUser(user);
	}

        /**
         * 通过id获取
         *
         * @param id id
         */
        @GetMapping("/user/getUserById")
        public User getUserById(String id) throws Exception {
            if(StringUtils.isNotBlank(id)){
                return this.userMng.getUserById(id);
            }else{
                return new User();
            }
        }

    /**
     * <pre>
     * 根据id删除
     * </pre>
     */
	@PostMapping("/user/delUserByIds")
	public void delUserByIds(@RequestBody List<String> ids) throws Exception {
        if (ids != null && ids.size() > 0) {
            userMng.delUserByIds(ids);
        }

	}

    /**
     * <pre>
     * 更新
     *     param:
     *        id: [必填] ID
     *        userNo: [必填] 用户ID
     *        userName: [必填] 用户名
     *        shortName: [必填] 账号名
     *        password: [必填] 账号密码
     *        telephone: 手机号
     *        qqCode: QQ号
     *        gender: 性别1-男0-女
     *        createTime: [必填] 创建时间
     *     return: 无
     * </pre>
     */
	@PostMapping("/user/updateUser")
	public void updateUser(@RequestBody User user) throws Exception {
        userMng.updateUser(user);
	}
}
