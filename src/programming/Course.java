package programming;

import java.util.List;

public class Course {
    public static void main(String[] args) {
        List<String> courseList = List.of("Spring", "SpringBoot", "Microservice", "AWS", "Azure", "Docker", "Api", "Kubernetes", "Kubernetes");
        //printAllCourses(courseList);
        printOnlySpringCourse(courseList);
        printOnlyFourLetterCourse(courseList);
    }

        private static void printAllCourses(List<String> courseList) {
            courseList.stream().forEach(System.out::println);
        }

        private static void printOnlySpringCourse(List<String>courseList){
        courseList.stream().filter(course -> course.equals("Spring")).
                forEach(System.out::println);
        }

    private static void printOnlyFourLetterCourse(List<String>courseList){
        courseList.stream().filter(course -> course.length() >= 4).forEach(System.out::println);
    }
    }

