class Students {
    static String collegename = "St. Joseph's College of Engineering";
    static String name;
}

public class College {
    public static void main(String[] args) {

        Students.name = "Yuvi";
        System.out.println(Students.name + " studies in " + Students.collegename);

        Students.name = "Harini";
        System.out.println(Students.name + " studies in " + Students.collegename);
        
        Students.name = "Hrishya";
        System.out.println(Students.name + " studies in " + Students.collegename);
    }
}