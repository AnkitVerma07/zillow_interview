package interview.zillow.information;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import interview.zillow.db.entity.User;
import interview.zillow.db.repository.UserRepo;
import interview.zillow.pojos.UserDataPojo;


/**
 * @author Ankit Verma
 *
 */
public class UserInformation {

	private UserRepo userRepo;
	private User userEntity;
	
	public User InsertPrimaryUserInfo(UserDataPojo userData){	
		userEntity = new User();	
		userEntity.setFirst_name(userData.getFirst_name());
		userEntity.setLast_name(userData.getLast_name());
		userEntity.setPhone_number(userData.getPhone_number());
		userEntity.setEmail(userData.getEmail());
		userRepo = new UserRepo();
		userRepo.postUserData(userEntity);
		return userEntity;
	}

}
