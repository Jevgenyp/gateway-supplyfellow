package jpi.supplyfellow.gatewaysupplyfellow.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfiguration {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("chat-service", r -> r.path("/chat/**")
                        .filters(f -> f.rewritePath("/chat/(?<segment>.*)", "/${segment}"))
                        .uri("lb://SUPPLYFELLOWCHATSERVICE"))
                .route("product-service", r -> r.path("/products/**")
                        .filters(f -> f.rewritePath("/products/(?<segment>.*)", "/${segment}"))
                        .uri("lb://PRODUCT-SERVICE"))
                .build();
    }
}

