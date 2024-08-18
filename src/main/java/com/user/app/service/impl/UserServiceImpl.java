package com.user.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.app.entity.User;
import com.user.app.exception.UserException;
import com.user.app.repository.UserRepository;
import com.user.app.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User createUser(User user) throws UserException {
		if (user.getDept() == null || user.getDept().isEmpty()) {
			throw new UserException("Department can not blanck of the user");
		}

		if (user.getMobileNumber() == null || user.getMobileNumber().isEmpty()
				|| user.getMobileNumber().length() != 10) {
			throw new UserException("User mobile number not more than 10 digits.");
		}
		return userRepository.save(user);
	}

	@Override
	public User updateUser(User user) {

		return userRepository.save(user);
	}

	@Override
	public User findUserById(Integer userId) {
		Optional<User> optional = userRepository.findById(userId);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public List<User> findAllUser() {
		return userRepository.findAll();
	}

	@Override
	public boolean deleteUserById(Integer userId) {
		userRepository.deleteById(userId);
		return true;
	}

	@Override
	public User findUserByIdAndMobileNumber(Integer userId, String mobileNumber) {
		return userRepository.findUserByIdAndMobileNumber(userId, mobileNumber);
	}

	@Override
	public User findUserByIdORMobileNumber(Integer userId, String mobileNumber) {
		return userRepository.findUserByIdORMobileNumber(userId, mobileNumber);
	}

}
