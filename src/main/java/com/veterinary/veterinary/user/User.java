package com.veterinary.veterinary.user;

import com.veterinary.veterinary.role.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    @Id
    int num;
    String userName;
    String password;
    List<Role> roles = new ArrayList<Role>();
}
