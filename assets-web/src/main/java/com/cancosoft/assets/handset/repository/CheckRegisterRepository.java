package com.cancosoft.assets.handset.repository;

import com.cancosoft.assets.handset.domain.CheckRegister;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;

import javax.persistence.QueryHint;
import java.util.List;

@RepositoryDefinition(domainClass = CheckRegister.class, idClass = Integer.class)
public interface CheckRegisterRepository {
    @Query("select register from CheckRegister register where register.machineNo = :machineNo")
    @QueryHints({@QueryHint(name = "org.hibernate.cacheable", value = "true")})
    List<CheckRegister> findByMachineNo(@Param("machineNo") String machineNo);
}