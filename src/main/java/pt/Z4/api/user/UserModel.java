package pt.Z4.api.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Data
@Entity(name = "user")
public class UserModel {

    @Id
    @GeneratedValue(generator = "uuid")
    private UUID id;

    private String name;
    private Integer age;
}
