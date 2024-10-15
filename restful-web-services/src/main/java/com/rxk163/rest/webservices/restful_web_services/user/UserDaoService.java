package com.rxk163.rest.webservices.restful_web_services.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList();
	
	
		static {
			users.add(new User(1, "Mark", LocalDate.now().minusYears(30)));
			users.add(new User(2, "Rob", LocalDate.now().minusYears(50)));
			users.add(new User(3, "Dan", LocalDate.now().minusYears(35)));
			users.add(new User(4, "Gary", LocalDate.now().minusYears(25)));
		}
		
		private static int userCount = 4;
		
		public List<User> findAll(){
			return users;
		}
		
		public User findOne(int id) {
			Predicate<? super User> predicate = user -> user.getId().equals(id);
			return users.stream().filter(predicate).findFirst().orElse(null);
		}
		
		public void deleteById(int id) {
			Predicate<? super User> predicate = user -> user.getId().equals(id);
			users.removeIf(predicate);
		}
		
		public User save(User user) {
			user.setId(++userCount);
			users.add(user);
			return user;
		}

}
