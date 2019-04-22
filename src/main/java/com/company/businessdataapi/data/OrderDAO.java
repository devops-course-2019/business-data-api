package com.company.businessdataapi.data;

import com.company.businessdataapi.model.Order;

import javax.sql.DataSource;
import java.util.List;

public interface OrderDAO {
    public void setDataSource(DataSource ds);

    public List<Order> listOrders();

    public void delete(Integer id);
}
