package com.example.demo.specification;

import com.example.demo.domain.orm.Example;
import org.springframework.data.jpa.domain.Specification;

import java.util.Date;
import java.util.Map;

public class ExampleSpecification {

    public static Specification<Example> id(String id) {
        return (root, criteriaQuery, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("id"), id);
    }

    public static Specification<Example> detail(String detail) {
        return (root, criteriaQuery, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("detail"), detail);
    }

    public static Specification<Example> userSys(String userSys) {
        return (root, criteriaQuery, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("userSys"), userSys);
    }

    public static Specification<Example> serviceType(String serviceType) {
        return (root, criteriaQuery, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("serviceType"), serviceType);
    }

    public static Specification<Example> dateOpened(Map<Integer, Date> date) {
        return (root, criteriaQuery, criteriaBuilder) ->
                criteriaBuilder.between(root.get("dateOpened"), date.get(1), date.get(2));

    }

    public static Specification<Example> uniOrg(String uniOrg) {
        return (root, criteriaQuery, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("uniOrg"), uniOrg);
    }

}
