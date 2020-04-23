package cn.Ober.service;

import cn.Ober.entity.Users;
import java.util.List;

/**
 * (Users)表服务接口
 *
 * @author makejava
 * @since 2020-04-21 20:49:04
 */
public interface UsersService {
    //查询用户是否被冻结
     int getByCarId(String cardid);

    /**
     * 通过查询身份登录
     */
    int Login(String cardid,String password);
    /**
     * 通过ID查询单条数据
     *
     * @param cardid 主键
     * @return 实例对象
     */
    Users queryById(String cardid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Users> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param users 实例对象
     * @return 实例对象
     */
    Users insert(Users users);

    /**
     * 修改数据
     *
     * @param users 实例对象
     * @return 实例对象
     */
    Users update(Users users);

    /**
     * 通过主键删除数据
     *
     * @param cardid 主键
     * @return 是否成功
     */
    boolean deleteById(String cardid);

}