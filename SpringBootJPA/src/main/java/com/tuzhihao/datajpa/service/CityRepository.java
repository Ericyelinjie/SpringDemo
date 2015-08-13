package com.tuzhihao.datajpa.service;

/**
 * Created by Methol on 2015-07-28.
 * Spring Data JPA Query creation
 * 方法名参考文档：
 * http://docs.spring.io/spring-data/jpa/docs/1.8.2.RELEASE/reference/html/#jpa.query-methods.query-creation
*/

        import com.tuzhihao.datajpa.domain.City;
        import org.springframework.data.domain.Page;
        import org.springframework.data.domain.Pageable;
        import org.springframework.data.jpa.repository.JpaRepository;

interface CityRepository extends JpaRepository<City, Long> {

        Page<City> findAll(Pageable pageable);

        Page<City> findByNameContainingAndCountryContainingAllIgnoringCase(String name, String country, Pageable pageable);

        City findByNameAndCountryAllIgnoringCase(String name, String country);

        City findByNameAllIgnoringCase(String name);
        @Override
        <S extends City> S saveAndFlush(S entity);
        @Override
        void delete(City entity);


}