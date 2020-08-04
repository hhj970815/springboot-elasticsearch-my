package com.springboot.my.service;

import com.springboot.my.dao.ElasticRepository;
import com.springboot.my.entity.UserTagDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EsService {

    @Autowired
    private ElasticsearchRestTemplate elasticsearchRestTemplate;

    @Autowired
    private ElasticRepository elasticRepository;

    public List<UserTagDto> findByProvince(String province) {
        return elasticRepository.findByProvince(province);
    }

    public List<UserTagDto> findAll() {
        return elasticRepository.findALl();
    }

}
