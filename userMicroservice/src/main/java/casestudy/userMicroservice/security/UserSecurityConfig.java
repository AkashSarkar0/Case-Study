//package casestudy.userMicroservice.security;
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
//public class BookSecurityConfig extends WebSecurityConfigurerAdapter
//{
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("akashs").password("0123").roles("USER");
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//
//		http.httpBasic().and().authorizeRequests().antMatchers("/booking/getall", "/booking/find/**","/booking/book","/booking/cancel/**","/booking/").permitAll()
//       //	     .antMatchers("/user/all,/user/**").permitAll()
//				.and().csrf().disable().headers().frameOptions()
//				.disable();
//		// .formLogin();
//	}
//
//	@Bean
//	public PasswordEncoder getPasswordEncoder() {
//		return NoOpPasswordEncoder.getInstance();
//	}
//	
//
//}
