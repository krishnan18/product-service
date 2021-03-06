package com.stackroute.userservice.profile.commander.repository;

import com.stackroute.userservice.profile.model.Address;
import com.stackroute.userservice.profile.model.CartProduct;
import com.stackroute.userservice.profile.model.Customer;
import com.stackroute.userservice.profile.model.Order;
import com.stackroute.userservice.profile.repository.CustomerRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataMongoTest
@ExtendWith(SpringExtension.class)
@DirtiesContext
public class CustomerRepositoryEmbeddedMongoDbTests {

    @Autowired
    private CustomerRepository customerRepository;

    private Customer customer;

    @BeforeEach
    public void dataSetUp() {
        Address address = new Address("100", "street", "area", "city", "state", 10101, "name", 9999911111l);
        List<CartProduct> products = List.of(new CartProduct("1", "Carrot", 10, 10));
        Order order = new Order("o1", "1", products, LocalDate.now(), address, address, "creditcard", 100, "completed");

        customer = new Customer("c1", "firstname", "lastname", "test@test.com", address, List.of(order));
        customerRepository.save(customer);
    }


    @AfterEach
    public void tearDown() {
        customer = null;
    }

    @Test
    public void givenCustomerEmailWhenFoundThenReturnOptionalOfCustomer() {
        Optional<Customer> customerOptional = customerRepository.findByEmail("test@test.com");
        assertThat(customerOptional)
                .isNotEmpty();
        Customer customerFound = customerOptional.get();
        assertThat(customerFound)
                .isEqualTo(customer);
    }

    @Test
    public void givenCustomerEmailWhenFoundThenReturnEmptyOptional() {
        Optional<Customer> customerOptional = customerRepository.findByEmail("test1@test.com");
        assertThat(customerOptional)
                .isEmpty();
    }
}