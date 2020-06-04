package lk.ac.ucsc.forexservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {
    @Id
    private Long id;

    @Column(name="currency_from")
    private String from;

    @Column(name="currency_to")
    private String to;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    private int port;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private double conversionRate;

}
