package com.todoist.config;

import org.aeonbits.owner.Config;


@Config.Sources({"classpath:auth.properties"})
public interface AuthConfig extends Config {

    @Key("login")
    String login();

    @Key("password")
    String password();
}
