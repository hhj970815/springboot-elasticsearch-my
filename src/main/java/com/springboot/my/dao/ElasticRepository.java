package com.springboot.my.dao;

import com.springboot.my.entity.UserTagDto;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ElasticRepository extends ElasticsearchRepository<UserTagDto, Long> {
//    @Query("{“bool” : {“must” : {“field” : {“province” : “?0”}}}}")
    @Query("{\"match\" : {\"province\" : \"?0\" }}")
    List<UserTagDto> findByProvince(String province);

    @Query("{\"match_all\":{}}")
    List<UserTagDto> findALl();
}
