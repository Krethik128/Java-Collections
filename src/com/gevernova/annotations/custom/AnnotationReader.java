package com.gevernova.annotations.custom;

import java.lang.reflect.Method;

public class AnnotationReader {
    public static void main(String[] args) {
        Class<TaskManager> obj = TaskManager.class;

        for (Method method : obj.getDeclaredMethods()) {
            if (method.isAnnotationPresent(TaskInfo.class)) {
                TaskInfo task = method.getAnnotation(TaskInfo.class);
                System.out.println("Method: " + method.getName());
                System.out.println("Priority: " + task.priority());
                System.out.println("Assigned To: " + task.assignedTo());
                System.out.println("------------------------------");
            }
        }
    }
}
