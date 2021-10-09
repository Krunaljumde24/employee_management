/**
 * 
 */
package com.employeeMgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeeMgmt.entity.EmpEntity;

/**
 * @author Krunal
 *
 */
@Repository
public interface EmpRepository extends JpaRepository<EmpEntity, Long> {

}
