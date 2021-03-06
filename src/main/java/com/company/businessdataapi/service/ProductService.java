package com.company.businessdataapi.service;

import com.company.businessdataapi.model.Order;
import com.company.businessdataapi.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class ProductService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Product> getAllProducts(){
        return this.getProducts(false);
    }

    public List<Product> getAllProductsDetailed(){
        return this.getProducts(true);
    }

    private List<Product> getProducts(boolean detailed){

        String query = "select ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued from products;";

        if(detailed){
            query = "select ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued from products;";
        }


        List<Product> products = new ArrayList<>();

        List<Map<String,Object>> rows = jdbcTemplate.queryForList(query);
        for (Map row : rows) {
            Product product = new Product();

            product.setProductID((Integer)row.get("ProductID"));
            product.setProductName((String)row.get("ProductName"));
            product.setCategoryID((Integer)row.get("CategoryID"));
            product.setQuantityPerunit((String)row.get("QuantityPerUnit"));
            product.setUnitPrice(((BigDecimal)row.get("UnitPrice")).doubleValue());
            product.setUnitsInStock((Integer)row.get("UnitsInStock"));
            if(detailed){
                product.setSupplierID((Integer)row.get("SupplierID"));
                product.setUnitsOnorder((Integer)row.get("UnitsOnOrder"));
                product.setReorderlevel((Integer)row.get("ReorderLevel"));
                product.setDiscontinued((Boolean) row.get("Discontinued"));
            }

            products.add(product);
        }

        return products;
    }

}
