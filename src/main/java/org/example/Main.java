package org.example;

import org.example.entity.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        Set<Task> annsTasks= new HashSet<>();
//        Task taskAnn= new Task("workintech","sadsad","dasadafd", Priority.HIGH, Status.IN_PROGRESS);
//        Task taskAnn2= new Task("workintech1","asd","dasfafd", Priority.HIGH, Status.IN_QUEUE);
//        Task taskAnn3= new Task("workintech2","sadasdasad","dasfdafd", Priority.MED, Status.ASSIGNED);
//        Task taskAnn4= new Task("workintech3","sadsadadd","dasfdasdafd", Priority.LOW, Status.IN_PROGRESS);
//        annsTasks.add(taskAnn);
//        annsTasks.add(taskAnn2);
//        annsTasks.add(taskAnn3);
//        annsTasks.add(taskAnn4);
//        Set<Task> bobsTasks= new HashSet<>();
//        Task taskBob= new Task("workintech","sadzcsad","dasasdd", Priority.HIGH, Status.IN_PROGRESS);
//        Task taskBob2= new Task("workintech5","azcsd","dasddafd", Priority.HIGH, Status.IN_QUEUE);
//        Task taskBob3= new Task("workintech7","sadascvxcdasad","dasfdafd", Priority.MED, Status.ASSIGNED);
//        Task taskBob4= new Task("workintech6","sadadd","dasfdasdafd", Priority.LOW, Status.IN_PROGRESS);
//        bobsTasks.add(taskBob);
//        bobsTasks.add(taskBob2);
//        bobsTasks.add(taskBob3);
//        bobsTasks.add(taskBob4);
//        Set<Task> carolsTasks= new HashSet<>();
//        Task taskCarol= new Task("workintech8","sadzcasdsad","dadfdafd", Priority.HIGH, Status.IN_PROGRESS);
//        Task taskCarol2= new Task("workintech5","azcsd","dasfasddafd", Priority.HIGH, Status.IN_QUEUE);
//        Task taskCarol3= new Task("workintech9","sadascvxcdasad","dasffd", Priority.MED, Status.ASSIGNED);
//        Task taskCarol4= new Task("workintech2","sadd","dasfdasdafd", Priority.LOW, Status.IN_PROGRESS);
//        carolsTasks.add(taskCarol);
//        carolsTasks.add(taskCarol2);
//        carolsTasks.add(taskCarol3);
//        carolsTasks.add(taskCarol4);
//        Set<Task> unassignedTasks= new HashSet<>();
//        Task unassignedTask= new Task("workintech8","sadzcasdsad",null, Priority.HIGH, Status.IN_PROGRESS);
//        unassignedTasks.add(unassignedTask);
//
//        TaskData taskData=new TaskData(annsTasks, bobsTasks, carolsTasks,unassignedTasks);
//        System.out.println("ann: " + taskData.getTasks("ann"));
//        System.out.println("bob: " + taskData.getTasks("bob"));
//        System.out.println("carol: " + taskData.getTasks("carol"));
//        System.out.println("all: " + taskData.getTasks("all"));
//        System.out.println(" unassigned: " + taskData.getDifferences(unassignedTasks,taskData.getTasks("ann")));
//        System.out.println(taskData.getIntersection(annsTasks,bobsTasks));
//        System.out.println(taskData.getIntersection(annsTasks,carolsTasks));
//        System.out.println(taskData.getIntersection(bobsTasks,carolsTasks));

        StringSet.findUniqueWords();

    }
}