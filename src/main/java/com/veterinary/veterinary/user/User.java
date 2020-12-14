package com.veterinary.veterinary.user;

import com.veterinary.veterinary.role.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class User {
    @Id
    int num;
    String username;
    String password;
    @OneToMany
    List<Role> roles = new ArrayList<Role>();
}
