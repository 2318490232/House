package cn.Ober.entity;

import java.io.Serializable;
import java.sql.Time;

/**
 * (RealEstate)实体类
 *
 * @author makejava
 * @since 2020-04-21 20:49:03
 */
public class RealEstate implements Serializable {
    private static final long serialVersionUID = 904682103619860182L;
    /**
    * 房产id
    */
    private Integer id;
    /**
    * 产权人身份证号
    */
    private String cardid;
    /**
    * 项目名称
    */
    private String projectname;
    /**
    * 具体位置
    */
    private String address;
    /**
    * 房屋类型
    */
    private String housetype;
    /**
    * 使用面积
    */
    private Integer area;
    /**
    * 建造时间
    */
    private Time buildtime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHousetype() {
        return housetype;
    }

    public void setHousetype(String housetype) {
        this.housetype = housetype;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Time getBuildtime() {
        return buildtime;
    }

    public void setBuildtime(Time buildtime) {
        this.buildtime = buildtime;
    }

}