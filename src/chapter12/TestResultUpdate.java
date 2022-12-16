package chapter12;

import java.util.Map;

public class TestResultUpdate extends TestResult{

    public static void main(String[] arg){

        Map <String, Integer> original = TestResult.getOriginalGrades();
        Map <String, Integer> update = TestResult.getMakeUpGrades();

        for (var student : update.entrySet()){
            Integer firstGrade = original.get(student.getKey());
            Integer secondGrade = update.get(student.getKey());

            if (secondGrade < firstGrade){
                update.put(student.getKey(), firstGrade);
                System.out.println("Student: " + student.getKey() + ", Grade:" + update.get(student.getKey()));
            }
        }
    }
}
