package cn.Ober.service.impl;

import cn.Ober.entity.Users;
import cn.Ober.dao.UsersDao;
import cn.Ober.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Users)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 20:49:04
 */
@Service("usersService")
public class UsersServiceImpl implements UsersService {
    @Resource
    private UsersDao usersDao;

    @Override
    public int getByCarId(String cardid) {
        return this.usersDao.getByCarId(cardid);
    }

    @Override
    public int Login(String cardid, String password) {
        return this.usersDao.Login(cardid,password);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param cardid 主键
     * @return 实例对象
     */
    @Override
    public Users queryById(String cardid) {
        return this.usersDao.queryById(cardid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Users> queryAllByLimit(int offset, int limit) {
        return this.usersDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param users 实例对象
     * @return 实例对象
     */
    @Override
    public Users insert(Users users) {
        this.usersDao.insert(users);
        return users;
    }

    /**
     * 修改数据
     *
     * @param users 实例对象
     * @return 实例对象
     */
    @Override
    public Users update(Users users) {
        this.usersDao.update(users);
        return this.queryById(users.getCardid());
    }

    /**
     * 通过主键删除数据
     *
     * @param cardid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String cardid) {
        return this.usersDao.deleteById(cardid) > 0;
    }
}