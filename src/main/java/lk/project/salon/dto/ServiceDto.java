package lk.project.salon.dto;

import jakarta.persistence.Column;
import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ServiceDto {

    private int serviceId;
    private String serviceName;
    private String description;
    private float price;
    private String duration;
}