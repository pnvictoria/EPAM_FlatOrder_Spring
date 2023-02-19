package flat.order.model;

import jakarta.persistence.*;

@Entity
@Table(name = "apartment")
public class Apartment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @OneToMany
    @JoinColumn(name = "apartment_type_id")
    private ApartmentType apartmentType;

    @OneToMany
    @JoinColumn(name = "user_id")
    private User user;
}
