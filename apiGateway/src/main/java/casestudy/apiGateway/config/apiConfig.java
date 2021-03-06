//package casestudy.apiGateway.config;
//
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class apiConfig {
//	@Bean
//	public RouteLocator myRoutes(RouteLocatorBuilder routeLocatorBuilder) {
//		return routeLocatorBuilder.routes()
//				
//				/** Routes For User MicroServices Starts **/
//				.route(p -> p.path("/user/add").uri("http://localhost:9003"))
//				.route(p -> p.path("/user/getall").uri("http://localhost:9003"))
//				.route(p -> p.path("/user/update").uri("http://localhost:9003"))
//				.route(p -> p.path("/user/delete").uri("http://localhost:9003"))
//				.route(p -> p.path("/user/train/getall").uri("http://localhost:9003"))
//				.route(p -> p.path("/user/train/{train_origin}/{train_destination}").uri("http://localhost:9003"))
//				/** Routes For User MicroServices Ends **/
//				
//				
////				/** Routes For Admin MicroServices Starts **/
////				.route(p -> p.path("/admin/all").uri("http://localhost:8083"))
////				.route(p -> p.path("/admin/trainNo").uri("http://localhost:8083"))
////				.route(p -> p.path("/admin/addtrain").uri("http://localhost:8083"))
////				.route(p -> p.path("/admin/update").uri("http://localhost:8083"))
////				.route(p -> p.path("/admin/delete").uri("http://localhost:8083"))
////				.route(p -> p.path("/admin/updateSeats").uri("http://localhost:8083"))
////				/** Routes For Admin MicroServices Ends **/
////				/** Routes For Booking MicroServices Starts **/
////				.route(p -> p.path("/user/all").uri("http://localhost:8084"))
////				.route(p -> p.path("/user/getDetailsByPnrNo").uri("http://localhost:8084"))
////				.route(p -> p.path("/user/book").uri("http://localhost:8084"))
////				.route("cancelByPnrNo",
////						t -> t.path("/user/cancel/**")
////								.filters(rw -> rw.rewritePath("/user/cancel/(?<segment>.*)", "/user/cancel/${segment}"))
////								.uri("http://localhost:8084/user/cancel/"))
////				/** Routes For Booking MicroServices Ends **/
////				/** Routes For Payment MicroServices Starts **/
////				.route(p -> p.path("/pay/add").uri("http://localhost:8085"))
////				.route("cancelByPnrNo",
////						t -> t.path("/pay/cancel/**")
////								.filters(rw -> rw.rewritePath("/pay/cancel/(?<segment>.*)", "/pay/cancel/${segment}"))
////								.uri("http://localhost:8085/pay/cancel/"))
////				/** Routes For Payment MicroServices Ends **/
////				.build();
////	}
////
//}