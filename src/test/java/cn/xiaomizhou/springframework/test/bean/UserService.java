package cn.xiaomizhou.springframework.test.bean;

import cn.xiaomizhou.springframework.beans.BeansException;
import cn.xiaomizhou.springframework.beans.factory.DisposableBean;
import cn.xiaomizhou.springframework.beans.factory.InitializingBean;

/**
 * @author Yaxi Zhang
 * @date 2021/12/1
 */
public class UserService implements InitializingBean, DisposableBean {

    private String uid;
    private UserDao userDao;
    private String company;
    private String location;

    public void queryUserInfo() {
        System.out.println("查询用户信息：" + userDao.queryUserName(uid));
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "UserService{" +
                "uid='" + uid + '\'' +
                ", userDao=" + userDao +
                ", company='" + company + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("执行：UserService.destroy");
    }

    @Override
    public void afterPropertiesSet() throws BeansException {
        System.out.println("执行：UserService.afterPropertiesSet");
    }
}
