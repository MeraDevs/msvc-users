package com.meradevs.msvc_users.models.dto;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Long id;

    @JsonProperty(value = "first_name")
    private String firstName;

    @JsonProperty(value = "last_name")
    private String LastName;

    private String email;

    @JsonProperty(value = "phone_number")
    private String phoneNumber;

    @JsonProperty(value = "is_active")
    private Boolean active;

    @JsonProperty(value = "creation_date")
    private LocalDateTime creationDate;

    @JsonProperty(value = "updated_date")
    private LocalDateTime updatedDate;

    @JsonProperty(value = "last_login")
    private LocalDateTime lastLogin;

    @JsonProperty(value = "is_verified")
    private Boolean verified;

    @JsonProperty(value = "role_id")
    private RoleDTO roleId;
}
