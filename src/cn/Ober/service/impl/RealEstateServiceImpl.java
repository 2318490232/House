package cn.Ober.service.impl;

import cn.Ober.entity.RealEstate;
import cn.Ober.dao.RealEstateDao;
import cn.Ober.service.RealEstateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (RealEstate)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 20:49:03
 */
@Service("realEstateService")
public class RealEstateServiceImpl implements RealEstateService {
    @Resource
    private RealEstateDao realEstateDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public RealEstate queryById(Integer id) {
        return this.realEstateDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<RealEstate> queryAllByLimit(int offset, int limit) {
        return this.realEstateDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param realEstate 实例对象
     * @return 实例对象
     */
    @Override
    public RealEstate insert(RealEstate realEstate) {
        this.realEstateDao.insert(realEstate);
        return realEstate;
    }

    /**
     * 修改数据
     *
     * @param realEstate 实例对象
     * @return 实例对象
     */
    @Override
    public RealEstate update(RealEstate realEstate) {
        this.realEstateDao.update(realEstate);
        return this.queryById(realEstate.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.realEstateDao.deleteById(id) > 0;
    }
}