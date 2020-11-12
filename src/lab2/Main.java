import java.util.Scanner;

public class Main {
    public static void getStudentsByFaculty(Student[] arr, int elem) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введіть назву факультету: ");
        String faculty=scan.nextLine();
        for(int i=0;i<elem;++i){
            if(arr[i].getFaculty().equals(faculty))
                System.out.println(arr[i].toString());
        }
    }

    public static void getStudentsByYear(Student[] arr, int elem) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введіть рік народження: ");
        String birthday=scan.nextLine();
        StringBuilder currBday= new StringBuilder();
        for(int i=0;i<elem;++i){
            for(int j=6;j<10;j++ ){
               currBday.append(arr[i].getBirthday().toCharArray()[j]);
            }
            if(Integer.parseInt(currBday.toString())>Integer.parseInt(birthday))
                System.out.println(arr[i].toString());
            currBday = new StringBuilder();
        }
    }
    public static void getStudentsByGroup(Student[] arr, int elem) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введіть назву групи: ");
        String group=scan.nextLine();
        for(int i=0;i<elem;++i){
            if(arr[i].getGroup().equals(group))
                System.out.println(arr[i].toString());
        }
    }
    public static void main(String[] args) {
        int elem;
        System.out.println("Введіть к-сть студентів: ");
        Scanner scan=new Scanner(System.in);
        elem=scan.nextInt();
        Student[] arr = new Student[elem];
        
         for(int i=0;i<elem;i++){
             int id=0, course=0;
             String surname, name, fathersname, birthday, address, number, faculty, group;
             
            System.out.println("Введіть Id: ");
            id= scan.nextInt();
            scan.nextLine();
            System.out.println("Введіть ім'я: ");
            name=scan.nextLine();
            System.out.println("Введіть прізвище: ");
            surname=scan.nextLine();
            System.out.println("Введіть по-батькові: ");
            fathersname=scan.nextLine();
            System.out.println("Введіть дату народження (dd.mm.rrrr): ");
            birthday=scan.nextLine();
            System.out.println("Введіть адресу: ");
            address=scan.nextLine();
            System.out.println("Введіть номер телефону: ");
            number=scan.nextLine();
            System.out.println("Введіть назву факультету: ");
            faculty=scan.nextLine();
            System.out.println("Введіть групу: ");
            group=scan.nextLine();
            System.out.println("Введіть курс: ");
            course= scan.nextInt();
            arr[i]=new Student(id,surname,name, fathersname, birthday,address,number,faculty,course,group);
            System.out.println(arr[i].toString());
        }
        getStudentsByFaculty(arr,elem);
        getStudentsByYear(arr, elem);
        getStudentsByGroup(arr,elem);
    }
}
