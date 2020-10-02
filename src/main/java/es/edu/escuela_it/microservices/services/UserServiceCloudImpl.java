package es.edu.escuela_it.microservices.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import es.edu.escuela_it.microservices.client.UserClient;
import es.edu.escuela_it.microservices.model.UserDTO;

@Lazy
@Primary
@Service
@Qualifier("CLOUD")
@ConditionalOnProperty(prefix = "app",name = "edition",havingValue = "pro")
public class UserServiceCloudImpl implements UserService{

	@Autowired
	private UserClient userClient;
	
	@Override
	public Optional<UserDTO> getUserById(Integer id) {
		
		UserDTO userDTO = userClient.getUser(id);
		
		return null;
	}

}