
package de.szut.pms.client;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;


@Component
public class ExternalApiClient {

    private final WebClient webClient;

    public ExternalApiClient(WebClient.Builder builder) {
        this.webClient = builder
                .baseUrl("http://localhost:8089")
                .build();
    }

    public String getEmployees(String token) {
        return webClient.get()
                .uri("/employees")
                .headers(h -> h.setBearerAuth(token))
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

    public String getEmployeeById(Long id, String token) {
        return webClient.get()
                .uri("/employees/{id}", id)
                .headers(h -> h.setBearerAuth(token))
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

    public String getQualification(
            Long employeeId, Long qualificationId, String token) {

        return webClient.get()
                .uri("/employees/{id}/qualifications/{qid}",
                        employeeId, qualificationId)
                .headers(h -> h.setBearerAuth(token))
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }



}
