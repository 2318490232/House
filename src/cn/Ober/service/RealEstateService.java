package cn.Ober.service;

import cn.Ober.entity.RealEstate;
import java.util.List;

/**
 * (RealEstate)表服务接口
 *
 * @author makejava
 * @since 2020-04-21 20:49:03
 */
public interface RealEstateService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    RealEstate queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<RealEstate> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param realEstate 实例对象
     * @return 实例对象
     */
    RealEstate insert(RealEstate realEstate);

    /**
     * 修改数据
     *
     * @param realEstate 实例对象
     * @return 实例对象
     */
    RealEstate update(RealEstate realEstate);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}