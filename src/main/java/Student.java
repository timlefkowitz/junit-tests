import java.util.ArrayList;
public class Student {

    //instances
    String name;
    int id;
    ArrayList<Integer> grades;


    //constructors

    public Student(String studentName,int studentId){
        name = studentName;
        id = studentId;
        grades = new ArrayList<Integer>();
    }

    public long getId(){
        return this.id;
    }

    public String getName(){
       return this.name;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    public double getGradeAverage(ArrayList<Integer> grades){
        int total = 0;
        for(int i=0; i < grades.size(); i++){
            total = total + grades.get(i);
        }

        double average = total / grades.size();
        return average;

    }


    //main
    public static void main(String[] args){


    }
}
