package com.ReCaptchaV2.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ReCaptchaV2.entities.UserEntity;
import com.ReCaptchaV2.repositories.IUserEntityRepository;

@Service
public class UserEntityService {

	private IUserEntityRepository repo;

	public UserEntityService(IUserEntityRepository repo) {
		this.repo = repo;
	}
	
	List<UserEntity> getAllUserEntity(){
		return repo.findAll();
	}
	
	UserEntity getUserEntityById(Long id) {
		return repo.findById(id).get();
	}
	
	UserEntity getUserEntityByEmail(String email) {
		return repo.findByEmail(email);
	}
	
	void createUserEntity(UserEntity userEntity) {
		repo.save(userEntity);
	}
}
