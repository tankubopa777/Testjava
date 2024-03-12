package SF211FinalPractice.src.Q3;

import java.util.Arrays;
import java.util.Objects;

/*  Student Grades */
class Grades{
    private int numberOfStudent;
    private int[] gradeOfStudent;

    public Grades(int numberOfStudent) {
        gradeOfStudent = new int[numberOfStudent];
        for (int i = 0; i < numberOfStudent; i++){
            gradeOfStudent[i] = 0;
        }
    }

    public int[] getTestGrades() {
        return Arrays.copyOf(gradeOfStudent, gradeOfStudent.length);
    }

    public Grades setTestGrades(int[] gradeOfStudent) {
        this.gradeOfStudent = Arrays.copyOf(gradeOfStudent, gradeOfStudent.length);
        return this;
    }

    public int[] sortGrades(){
        Arrays.sort(gradeOfStudent);
        return getTestGrades();
    }

    public int highestGrade(){
        Arrays.sort(gradeOfStudent);
        return gradeOfStudent[gradeOfStudent.length-1];
    }

    public double averageGrade(){
        int numberOfGrade = 0;
        double allGradeOfStudent = 0;
        gradeOfStudent = Arrays.copyOf(gradeOfStudent, gradeOfStudent.length);
        for(int i = 0; i < gradeOfStudent.length; i++){
            allGradeOfStudent += gradeOfStudent[i];
            numberOfGrade ++;
        }
        return allGradeOfStudent/numberOfGrade;
    }

    public double medianGrade(){
        if (gradeOfStudent.length % 2 == 0){
            return (gradeOfStudent[gradeOfStudent.length/2] + gradeOfStudent[(gradeOfStudent.length/2)-1])/2;
        }else{
            return gradeOfStudent[((gradeOfStudent.length+1)/2)-1];
        }
    }

    public int modeGrade(){
        int reCountNum = 0;
        int mostSameNum = 0;
        int mostCountNum = 0;
        for (int i = 0; i < gradeOfStudent.length; i++){
            for (int q = 0; q < gradeOfStudent.length; q++){
                if(gradeOfStudent[i] == gradeOfStudent[q]){
                    reCountNum ++;
                }
            }if(reCountNum > mostCountNum){
                mostCountNum = reCountNum;
                mostSameNum = gradeOfStudent[i];
            }
            reCountNum = 0;
        }
        return mostSameNum;
    }

    public String toString(){
        return Arrays.toString(gradeOfStudent);
    }

    public boolean equals(Objects other){
        if(!(other instanceof  Grades))
            return false;
    }

}