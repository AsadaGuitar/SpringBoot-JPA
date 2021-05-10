package com.example.repository;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.domain.Account;

@ExtendWith(SpringExtension.class)
@DataJpaTest //データベーステスト
@AutoConfigureTestDatabase(replace = Replace.NONE) //データベースの置き換えはしない。
public class TestAccountRepository {

	@Autowired
	AccountRepository repository;
	
	@Test
	public void IDの検索() {
		Account account = repository.findById("001").get();
		assertThat(account).isNotNull();
	}
}
