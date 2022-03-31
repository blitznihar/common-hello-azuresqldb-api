package com.hello.azuresqldb.config;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class AADWebApplicationAndResourceServerConfig {

    @Order(1)
    @Configuration
    public static class ApiWebSecurityConfigurationAdapter extends AADResourceServerWebSecurityConfigurerAdapter {
        protected void configure(HttpSecurity http) throws Exception {
            super.configure(http);
            // All the paths that match `/api/**`(configurable) work as the resource server. Other paths work as  the web application.
            http.antMatcher("/api/**")
                .authorizeRequests().anyRequest().authenticated();
        }
    }

    @Configuration
    public static class HtmlWebSecurityConfigurerAdapter extends AADWebSecurityConfigurerAdapter {

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            super.configure(http);
            // @formatter:off
            http.authorizeRequests()
                    .antMatchers("/login").permitAll()
                    .anyRequest().authenticated();
            // @formatter:on
        }
    }
}
