package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.Account;
/**
 * CrudRepository 
 * ページングとソート機能は無し。
 * 
 * @author JavaUser
 *
 */
@Repository
public interface AccountRepository extends CrudRepository<Account, String>{

}
