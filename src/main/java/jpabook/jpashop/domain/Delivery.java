package jpabook.jpashop.domain;

import javax.persistence.*;

import static javax.persistence.FetchType.*;

@Entity
public class Delivery extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "delivery_id", nullable = false)
    private Long id;

    private String city;
    private String street;
    private String zipcode;

    private DeliveryStatus status;

    @OneToOne(mappedBy = "delivery", fetch = LAZY)
    private Order order;

}
