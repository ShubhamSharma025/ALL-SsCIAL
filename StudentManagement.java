public class StudentManagement{
    private schoolLL head;

    public StudentManagement(){

        this.head = null;
    }

    public void add(int studentId, String name, int age, String grades){
        schoolLL newNode = new schoolLL(studentId, name, age, grades);
        newNode.next = head;
        head = newNode;
        System.out.println("student" + name +"added successfully .");
    }

    public void deleteStudent(int studentId){

      schoolLL current = head;
      schoolLL previous = null;

      while(current !=null && current.studentId != studentId){
        previous = current;
        current = current.next;
      }

      if(current == null){
        System.out.println("Stuent not found .");
        return;
      }

      if(previous == null){
        head = current.next;
      }else{
        previous.next = current.next;
      }
      System.out.println("Student with Id"+ studentId + "deleted successfully.");
    }

    public void display(){
      schoolLL current = head;
      while(current != null){
        System.out.println("Student Id: "+ current.studentId + "Name: "+ current.name + "Age: "+ current.age + "Grades: "+ current.grades);
        current = current.next;
      }
    }

    public void searchStudent(int studentId){
      schoolLL current = head;
      while(current != null && current.studentId != studentId){
        current = current.next;
      }
      if(current == null){
        System.out.println("Student not found.");
        return;
      }
      System.out.println("Student Id: "+ current.studentId + "  Name: "+ current.name + "  Age: "+ current.age + "Grades: "+ current.grades);
    }

    public static void main(String[] args){
      StudentManagement sm = new StudentManagement();
      sm.add(1, "John", 20, "A");
      sm.add(2, "Doe", 21, "B");
      sm.add(3, "Jane", 22, "C");
      sm.add(4, "Doe", 23, "D");
      sm.add(5, "Doe", 24, "E");
      sm.add(6, "Doe", 25, "F");
      sm.add(7, "Doe", 26, "G");
      sm.add(8, "Doe", 27, "H");
      sm.add(9, "Doe", 28, "I");
      sm.add(10, "Doe", 29, "J");
      sm.add(11, "Doe", 30, "K");
      sm.add(12, "Doe", 31, "L");
      sm.add(13, "Doe", 32, "M");
      sm.add(14, "Doe", 33, "N");
      sm.add(15, "Doe", 34, "O");
      sm.add(16, "Doe", 35, "P");
      sm.add(17, "Doe", 36, "Q");
      sm.add(18, "Doe", 37, "R");
      sm.add(19, "Doe", 38, "S");
      sm.add(20, "Doe", 39, "T");
      sm.add(21, "Doe", 40, "U");
      sm.add(22, "Doe", 41, "V");
      sm.add(23, "Doe", 42, "W");
      sm.add(24, "Doe", 43, "X");
      sm.add(25, "Doe", 44, "Y");
      sm.add(26, "Doe", 45, "Z");
      sm.add(27, "Doe", 46, "AA");
      sm.add(28, "Doe", 47, "AB");
      sm.add(29, "Doe", 48, "AC");
      sm.add(30, "Doe", 49, "AD");
      sm.add(31, "Doe", 50, "AE");

    //  sm.display();
     // sm.deleteStudent(1);
     /// sm.searchStudent(5);
     // sm.display();
      sm.searchStudent(2);
      
    }
  }
