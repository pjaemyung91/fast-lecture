package org.example.gradeCalculator;

import java.util.List;

public class GradeCalculator {
    private final Courses courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    public double calculateGrade() {
        double totalMultipliedCreditAndCourseGrade = courses.multiplyCreditAndCourseGrade();

        int totalCompleteCredit = courses.calculateTotalCompletedCredit();

        return totalMultipliedCreditAndCourseGrade / totalCompleteCredit;
    }
}
