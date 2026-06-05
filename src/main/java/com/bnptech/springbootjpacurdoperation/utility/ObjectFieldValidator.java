//package com.bnptech.springbootjpacurdoperation.utility;
//
//import java.lang.reflect.Field;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class ObjectFieldValidator {
//
//    public static List<String> getNullOrEmptyFields(Object obj) {
//        return Arrays.stream(obj.getClass().getDeclaredFields())
//                .peek(f -> f.setAccessible(true))
//                .filter(field -> {
//                    try {
//                        Object value = field.get(obj);
//
//                        if (value == null) {
//                            return true;
//                        }
//                        if (value instanceof String) {
//                            return ((String) value).trim().isEmpty();
//                        }
//                        return false;
//                    } catch (IllegalAccessException e) {
//                        throw new RuntimeException(e);
//                    }
//                })
//                .map(Field::getName)
//                .collect(Collectors.toList());
//    }
//}
