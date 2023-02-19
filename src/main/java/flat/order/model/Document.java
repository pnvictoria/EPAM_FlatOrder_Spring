package flat.order.model;

import jakarta.persistence.*;

@Entity
@Table(name = "documents")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)
    private long id;

    @OneToMany
    @JoinColumn(name = "owner_id")
    private User userOwner;

    @OneToMany
    @JoinColumn(name = "order_id")
    private User userOrder;

    @OneToMany
    @JoinColumn(name = "apartment_id")
    private Apartment apartment;
}
