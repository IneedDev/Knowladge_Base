package com.plays;

import org.junit.Before;
import org.mockito.Mock;
import spring.test.mock.Car;
import spring.test.mock.Person;

public class PersonTest {

    @Mock
    Car car;

//    @InjectMocks // InjectMock creates calls and inject to this calss ,
//    // classes with Mock annotation
//    Person person;

    // 2 approach with use of constructor
    Person person;

    @Before
    public void setUp(){
        person = new Person(car);
    }




}