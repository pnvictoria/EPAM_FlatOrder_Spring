package flat.order.model;

import jakarta.persistence.*;

@Entity
@Table(name = "user_types")
public class UserType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)
    private long id;

    @Column(name = "name")
    private String name;
}
