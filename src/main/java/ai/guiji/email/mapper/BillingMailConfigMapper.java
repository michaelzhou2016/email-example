package ai.guiji.email.mapper;

import ai.guiji.email.entity.BillingMailConfig;
import ai.guiji.email.entity.BillingMailConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BillingMailConfigMapper {
    long countByExample(BillingMailConfigExample example);

    int deleteByExample(BillingMailConfigExample example);

    int deleteByPrimaryKey(Integer mailType);

    int insert(BillingMailConfig record);

    int insertSelective(BillingMailConfig record);

    List<BillingMailConfig> selectByExampleWithBLOBs(BillingMailConfigExample example);

    List<BillingMailConfig> selectByExample(BillingMailConfigExample example);

    BillingMailConfig selectByPrimaryKey(Integer mailType);

    int updateByExampleSelective(@Param("record") BillingMailConfig record, @Param("example") BillingMailConfigExample example);

    int updateByExampleWithBLOBs(@Param("record") BillingMailConfig record, @Param("example") BillingMailConfigExample example);

    int updateByExample(@Param("record") BillingMailConfig record, @Param("example") BillingMailConfigExample example);

    int updateByPrimaryKeySelective(BillingMailConfig record);

    int updateByPrimaryKeyWithBLOBs(BillingMailConfig record);

    int updateByPrimaryKey(BillingMailConfig record);
}