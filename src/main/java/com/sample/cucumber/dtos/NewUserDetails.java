package com.sample.cucumber.dtos;

import cucumber.deps.com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class NewUserDetails {
    @XStreamAlias("Name")
    private String Name;
    @XStreamAlias("Email")
    private String email;
    @XStreamAlias("Password")
    private String Password;
}
