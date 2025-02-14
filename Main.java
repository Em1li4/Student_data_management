
public class Main {
    public static void main(String[] args){
        // created array object of Student class
        Student[] students = new Student[5];
        // set the values through the constructor
        students[0] = new Student(1,"John", 19);
        // TDO 1:  create other 4 object of student class and assign to the array Students
        students[1] = new Student(2, "Mary", 20);
        students[2] = new Student(3, "Krish", 21);
        students[3] = new Student(4, "Sara", 22);
        students[4] = new Student(5, "Harry", 23);

        // TDO 2: Uncomment the method call once you have completed the mentioned tasks
        int IndexToDelete = 4;
        System.out.println("Remove element at " + IndexToDelete);
        removeElement(IndexToDelete, students);

        Student newStudent = new Student(6, "Shally", 24);
        System.out.println("Add new student roll Number:" + newStudent.getRollNumber() + " Name : " + newStudent.getName() + "Age : " + newStudent.getAge());
        AddElement(newStudent, students);

        int IndexToUpdate = 2;
        updateElement(IndexToUpdate, students);
    }
    public static void removeElement(int IndexToDelete, Student[] originalArray){
        Student[] newArray = new Student[originalArray.length-1];
        for (int i = 0, j = 0; i < originalArray.length; i++){
            if (i != IndexToDelete){
                newArray[j++] = originalArray[i];
            }
        }
        printArray("Remove", newArray);
        //T 3: create a new array with a length less than the existing one. For example, if your existing array is students, the new array's size will be students.length - 1
        //T 4 : use a ‘for loop’ to copy all elements from the existing array to the new array, except for the element at the index you want to remove
        //TOO 5: if needed, add the new array back to your original array variable
        //TOO 6: call printArray method and pass "Remove" and new array.
    }
    public static void AddElement(Student newStudent,Student[] originalArray) {
        Student[] newArray = new Student[originalArray.length + 1];
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }
        newArray[newArray.length - 1] = newStudent;
        printArray("ADD", newArray);
    }
    //TO 7: define a new array with a length of students.length + 1. This ensures there is space for the new element.
    // TO 8: use a ‘for loop’ to copy all elements from the existing students array to the new array. Iterate over each element and assign it to the corresponding index in the new array.
    // TO 9: create a newStudent object and assign it to the last index of the new array, which is newArray[newArray.length - 1].
    // TO 10: place these three steps inside the addElement method in your class. printArray("Add",newArray);

    public static void updateElement(int indexToUpdate, Student[] originalArray){
        originalArray[indexToUpdate].setName("Jenny");
        // TOO 11: locate the element you need to update. Use the element's index of the array.
        //ODO 12: once you have the index, access the element and update its properties.
        // Use the ‘setter’ method in the Student class to change values like name, age, or ID.
        printArray("Update", originalArray);
    }
    public static void printArray(String message, Student[] students){
        System.out.println("Operation:" + message);
        /* TDO 13: include a print statement to indicate the current action being performed,
           such as ‘Removing student’, ‘Adding student’, or ‘Updating student’
        */
        // TOO 14: use a ‘for loop’ to go through each element in the array.
        // TOO 15: within the loop, use the ‘getter’ method to fetch each student's details and print them using the student object.
        for (int i = 0; i < students.length; i++){
            if (students[i] != null) {
                System.out.println("Student Name : " + students[i].getName());
            }
        }
    }

    public static class Student {
        private int rollNumber;
        private String name;
        private int age;

        /* default constructor */
        public Student(){

        }
        /* parameterized constructor*/
        public Student(int rollNumber, String name, int age) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.age = age;
        }

        public int getRollNumber() {
            return rollNumber;
        }

        public void setRollNumber(int rollNumber) {
            this.rollNumber = rollNumber;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
