package com.tnisf.Spring_DataReportAndProcessing;

import org.springframework.stereotype.Service;

@Service
public class ReportSErvice {

    public String generateCustomerReport(Customer customer) {
        // Assuming a simple report format for the customer
        return "Customer Report:\n" +
                "Customer ID: " + customer.getId() + "\n" +
                "Name: " + customer.getFirstName() + " " + customer.getLastName();
    }

    public String generateOrderReport(Order order) {
        // Assuming a simple report format for the order
        return "Order Report:\n" +
                "Order ID: " + order.getId() + "\n" +
                "Order Number: " + order.getOrderNumber() + "\n" +
                "Amount: " + order.getAmount();
    }
}