package com.jandacoding.springbootecommerce.config;

import com.jandacoding.springbootecommerce.entity.Product;
import com.jandacoding.springbootecommerce.entity.ProductCategory;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {
//    @Override
//    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {

//        HttpMethod[] theUnsupportedActions = {HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE};
//
//        //dissable HTTP methods for product: PUT, POST and DELETE
//        //This make the project READ ONLY
//        config.getExposureConfiguration()
//                .forDomainType(Product.class)
//                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
//                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));
//
//        //dissable HTTP methods for productCategory: PUT, POST and DELETE
//        //This make the project READ ONLY
//        config.getExposureConfiguration()
//                .forDomainType(ProductCategory.class)
//                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
//                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));
//    }
}
