package com.zipcodewilmington.phonebook;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {


    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = new TreeMap<String,List<String>>;
    }

    public PhoneBook() {
        this(null);
    }

    public void add(String name, String phoneNumber) {
        List<String> numbers = phonebook.get(name);
        numbers.add(phoneNumber);
        phonebook.put(name,numbers);
    }

    public void addAll(String name, String... phoneNumbers) {
        List<String> numbers = phonebook.get(name);
        for(String s:phoneNumbers)
        numbers.add(s);
        phonebook.put(name,numbers);
    }

    public void remove(String name) {
        phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {
        return phonebook.containsKey(name);
    }

    public List<String> lookup(String name) {
       List<String> numbers = phonebook.get(name);
        return numbers;
    }

    public String reverseLookup(String phoneNumber)  {
        return null;
    }

    public List<String> getAllContactNames() {
        return null;
    }

    public Map<String, List<String>> getMap() {
        return null;
    }
}
