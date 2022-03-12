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
        this.phonebook = new LinkedHashMap<>();
        this.phonebook.putAll(map);
    }

    public PhoneBook() {
        this(Collections.EMPTY_MAP);
    }

    public void add(String name, String phoneNumber) {
//        List<String> numbers = new ArrayList<>();
//        if (phonebook.get(name) != Collections.EMPTY_MAP) {
//            numbers = phonebook.get(name);
//        }
//        numbers.add(phoneNumber);
//        phonebook.put(name,numbers);
        if(phonebook.get(name)==null){
            phonebook.put(name,new ArrayList<String>());
        }
        phonebook.get(name).add(phoneNumber);
    }

    public void addAll(String name, String... phoneNumbers) {
        if (phonebook.get(name) == null) {
            phonebook.put(name, new ArrayList<String>());
        }
            for (String s : phoneNumbers)
                phonebook.get(name).add(s);

    }

    public void remove(String name) {
        phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {
        return phonebook.containsKey(name);
    }

    public List<String> lookup(String name) {
       List<String> numbers = new ArrayList<>();
       if (hasEntry(name)) {
           for (String s : phonebook.get(name))
               numbers.add(s);
           return numbers;
       }
       return null;
    }

    public String reverseLookup(String phoneNumber)  {

        return null;
    }

    public List<String> getAllContactNames() {
        ArrayList<String> allNames = new ArrayList<>();
      // return (List)(phonebook.values());
       for(String s:phonebook.keySet()){
           allNames.add(s);
       }
       return allNames;
    }

    public Map<String, List<String>> getMap() {
        return (Map)phonebook.entrySet();

    }
}
