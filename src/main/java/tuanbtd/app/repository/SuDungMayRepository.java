package tuanbtd.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tuanbtd.app.entity.SuDungMay;
import tuanbtd.app.entity.SuDungMayId;

@Repository
public interface SuDungMayRepository extends JpaRepository<SuDungMay, SuDungMayId> {

}
