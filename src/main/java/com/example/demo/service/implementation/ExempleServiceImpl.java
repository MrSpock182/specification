package com.example.demo.service.implementation;

import com.example.demo.domain.orm.Example;
import com.example.demo.domain.orm.builder.ExampleBuilder;
import com.example.demo.domain.request.ExampleResquest;
import com.example.demo.repository.ExampleRepository;
import com.example.demo.service.ExampleService;
import com.example.demo.specification.ExampleSpecification;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Objects.isNull;

@Service
public class ExempleServiceImpl implements ExampleService {

    @Autowired
    private ExampleRepository repository;

    @Override
    public Example save(ExampleResquest resquest) {
        return repository.save(ExampleBuilder.builder()
                .detail(resquest.getDetail())
                .serviceType(resquest.getServiceType())
                .uniOrg(resquest.getUniOrg())
                .userSys(resquest.getUserSys())
                .dateOpened(resquest.getDateOpened())
                .build());
    }

    @Override
    public List<Example> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Example> findAll(ExampleResquest request) {
        return repository.findAll(Specification.where(ExampleSpecification.detail(request.getDetail()))
                .or(ExampleSpecification.userSys(request.getUserSys()))
                .or(ExampleSpecification.serviceType(request.getServiceType()))
                .or(ExampleSpecification.uniOrg(request.getUniOrg()))
//                .and(ExampleSpecification.dateOpened(createMapDate(request.getDateOpened())))
        );
    }

    private Map<Integer, Date> createMapDate(String dateOpened) {
        try {
            Map<Integer, Date> maps = new HashMap<>();

            if (isNull(dateOpened)) {
                return null;
            }

            SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
            Date date = format.parse(dateOpened);
            
            maps.put(1, date);
            maps.put(2, DateUtils.addHours(date, 24));

            return maps;
        } catch (Exception ex) {
            //TODO COLOCAR INTERCEPTADOR DE EXCEPTION
            return null;
        }
    }

}
