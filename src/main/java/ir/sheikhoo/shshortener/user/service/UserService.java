package ir.sheikhoo.shshortener.user.service;

import ir.sheikhoo.shshortener.user.model.User;
import ir.sheikhoo.shshortener.user.model.UserDto;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
