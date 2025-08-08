public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Rodrigo Duterte\n", 20, "BSIT", 80, 90, 87);
        Student s2 = new Student("Bongbong Marcos\n", 19, "BSCS", 75, 65, 60);
        Student s3 = new Student("Nicolas Deloso Torre III", 21, "BSIT", 84, 89, 92);

        Student[] students = { s1, s2, s3 };
        int passingCount = 0;

        for (Student stdnts : students) {
            stdnts.displayInfo();
            if (stdnts.isPassing()) {
                passingCount++;
            }
        }

        System.out.println("Summary: " + passingCount + " out of " +
                students.length + " students are passing.");
    }
}