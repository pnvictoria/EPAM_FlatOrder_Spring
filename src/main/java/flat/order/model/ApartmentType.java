package flat.order.model;

import jakarta.persistence.*;

@Entity
@Table(name = "apartment_types")
public class ApartmentType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)
    private long id;

    @Column(name = "name")
    private String name;
}
