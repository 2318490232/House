package cn.Ober.dao;

import cn.Ober.entity.RealEstate;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (RealEstate)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-21 20:49:03
 */
public interface RealEstateDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    RealEstate queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<RealEstate> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param realEstate 实例对象
     * @return 对象列表
     */
    List<RealEstate> queryAll(RealEstate realEstate);

    /**
     * 新增数据
     *
     * @param realEstate 实例对象
     * @return 影响行数
     */
    int insert(RealEstate realEstate);

    /**
     * 修改数据
     *
     * @param realEstate 实例对象
     * @return 影响行数
     */
    int update(RealEstate realEstate);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}