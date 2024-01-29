public class Person {
    String name;
        int age;


        public Person(String name, int age) {
            this.name = name;
            this.age = age;

        }
        public String getname(){
            return name;
        }
        public int getage(){
            return age;
        }

        public static void main(String[] args) {
            Person name1 = new Person("yoga", 29);
            Person name2 = new Person("navya", 27);

            System.out.println("Below are the persons name and age ");
            System.out.println("Name : " + name1.getname() + " " +","+"Age: " + name1.getage());
            System.out.println("Name : " + name2.getname() + " "+"," +"Age: " + name2.getage());
        }
    }
