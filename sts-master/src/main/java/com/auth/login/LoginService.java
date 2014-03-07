package com.auth.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class LoginService {

	 @Autowired
	 private MongoTemplate mongoTemplate;
	 
	public static final String COLLECTION_NAME = "login";
	
	public LoginDao getDetails(String login_id){
			try{
			System.out.println("Collection exists...");
			Query searchUserQuery = new Query(Criteria.where("login_id").is(login_id));
			return mongoTemplate.findOne(searchUserQuery, LoginDao.class,COLLECTION_NAME);
			}
			catch(Exception e){
				System.out.println("Exception in service class");
				return null;
			}
		
	}
}
