package com.seal.vtex.gateway.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author ENGCARVALHO
 */
@Configuration
//@EnableResourceServer
public class ResourceServerConfig {
//        extends ResourceServerConfigurerAdapter {

//    @Autowired
//    private JwtTokenStore jwtTokenStore;
//
//    private static final String[] PUBLIC = {"/oauth/oauth/token"};
//    
//    private static final String[] OPERATOR = {"/faturamento/**"};
//    
//    private static final String[] OMEGA = {"/financeiro/**", "/user/**"};
//    
//    @Override
//    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
//        resources.tokenStore(jwtTokenStore);
//    }
//    
//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers(PUBLIC).permitAll()
//                .antMatchers(HttpMethod.GET, OPERATOR).hasAnyRole("OPERATOR", "OMEGA")
//                .antMatchers(OMEGA).hasAnyRole("OMEGA")
//                .anyRequest().authenticated();
//    }
}