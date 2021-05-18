import java.util.ArrayList;


public class Student {

    //instances
    private String name;
    private long id;
    private ArrayList<Integer> grades;


    //constructors

    public Student(long StudentId,String studentName){
        this.name = studentName;
        this.id = StudentId;
        this.grades = new ArrayList<Integer>();
    }

    public Student(String name, long id, ArrayList<Integer> grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

    public long getId(){
        return this.id;
    }

    public String getName(){

        return this.name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    public double getGradeAverage(){
        int total = 0;
        for(int i=0; i < grades.size(); i++){
            total = total + grades.get(i);
        }

        double average = total / grades.size();
        return average;

    }

    //LEC FOR EACH

    public double getGradeAVG(){
        double sum = 0;
        for (int grade : this.grades){
            sum += grade;
        }
        return sum / getGrades().size();
    }


    //main
    public static void main(String[] args){

        Student jeff = new Student(12, "jeff");
//        jeff.addGrade(92);
//        jeff.addGrade(82);
//        jeff.addGrade(72);
//        jeff.addGrade(72);
//        System.out.println(jeff.getGradeAverage());

    }
}
