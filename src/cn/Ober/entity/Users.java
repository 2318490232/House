package cn.Ober.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Users)实体类
 *
 * @author makejava
 * @since 2020-04-21 20:49:04
 */
public class Users implements Serializable {
    private static final long serialVersionUID = 890656545360489117L;
    /**
    * 身份证号
    */
    private String cardid;
    /**
    * 用户名
    */
    private String name;
    /**
    * 性别
    */
    private Integer gender;
    /**
    * 注册时间
    */
    private Date createtime;
    /**
    * 密码
    */
    private String password;
    /**
    * 用户状态
    */
    private Integer status;

    public Users(String cardid, String name, int gender, Date date, String psw) {
        this.cardid = cardid;
        this.name=name;
        this.gender=gender;
        this.password = psw;
        this.createtime = date;
    }


    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}