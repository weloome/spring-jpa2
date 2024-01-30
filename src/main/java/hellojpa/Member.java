package hellojpa;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Member {
    @Id
    private Long id;
    @Column(name = "userName", nullable = false)
    private String name;
    private Integer age;
    @Enumerated(EnumType.STRING)
    private RoleType roleType;
    private LocalDate createDate;
    private LocalDateTime lastModifiedDate;
    @Lob
    private String description;


}
