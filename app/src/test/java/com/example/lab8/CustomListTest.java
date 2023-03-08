package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CustomListTest {

    private ArrayList <City> cities = new ArrayList<>();;

    @Test
    public void testAddCity(){
        CustomList cityList = new CustomList(null, cities);
        City city = new City("Edmonton", "AB");
        cityList.addCity(city);
        assertEquals(1, cityList.getCount());
    }


}
