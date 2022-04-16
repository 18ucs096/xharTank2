package com.khandelwal.xharktank.datarepository;


import com.khandelwal.xharktank.entity.PitchesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PitchesDataRepository extends JpaRepository<PitchesEntity, Long>, JpaSpecificationExecutor<PitchesEntity> {

}
