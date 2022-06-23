//package casestudy.adminMicroservice.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@SuppressWarnings("deprecation")
//@EnableWebSecurity
//public class AdminSecurityConfig extends WebSecurityConfigurerAdapter {
//	
//	@Override
//	  protected void configure(AuthenticationManagerBuilder auth) throws Exception  { 
//		  auth.inMemoryAuthentication()
//		  		.withUser("akash").password("sarkar123").roles("ADMIN"); 
//	  }
//	  
//	  @Override 
//	  protected void configure(HttpSecurity http) throws Exception  {
//		  
//		  http.httpBasic()
//		  .and().authorizeRequests()
//		  	  .antMatchers("/admin/train/add","/admin/train/update","/admin/train/delete/**","/admin/train/getall","/admin/train/**","/admin/").permitAll()
//		  	  .and().csrf().disable().headers().frameOptions().disable(); 
//		 }
//	  
//	  @Bean
//	  public PasswordEncoder getPasswordEncoder() 
//	  { 
//		  return NoOpPasswordEncoder.getInstance(); 
//	  } 
//}
