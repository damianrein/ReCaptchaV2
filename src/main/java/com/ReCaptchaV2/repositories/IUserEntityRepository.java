package com.ReCaptchaV2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ReCaptchaV2.entities.UserEntity;

public interface IUserEntityRepository extends JpaRepository<UserEntity, Long>{

	UserEntity findByEmail(String email);
}
