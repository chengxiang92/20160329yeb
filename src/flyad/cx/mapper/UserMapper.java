package flyad.cx.mapper;

import java.util.List;

import flyad.cx.entity.User;

public interface UserMapper {

	public void addUser(User user);

	public List<User> getAllUser();

	public User getUserById(String id);

	public void deleteById(String id);

	public void update(User user);

}
