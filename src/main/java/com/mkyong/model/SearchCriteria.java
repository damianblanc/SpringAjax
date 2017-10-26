package com.mkyong.model;

import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by dblanc on 10/26/17.
 */
public class SearchCriteria {

    @NotBlank(message = "username can't empty!")
    String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
