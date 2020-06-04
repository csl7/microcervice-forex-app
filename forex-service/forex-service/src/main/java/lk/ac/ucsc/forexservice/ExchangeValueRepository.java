package lk.ac.ucsc.forexservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
    //select * from exchange value where from = USD and to = LKR

    ExchangeValue findByFromAndTo(String from, String to);

}
