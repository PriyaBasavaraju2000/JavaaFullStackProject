package in.priyanka.foodiesapi.service;

import in.priyanka.foodiesapi.io.UserRequest;
import in.priyanka.foodiesapi.io.UserResponse;

public interface UserService {

    UserResponse registerUser(UserRequest request);

    String findByUserId();
}
