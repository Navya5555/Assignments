public class Person2 {

         String name1;
         int age;

        public Person2(String name1, int age) {
            this.name1 = name1;
            this.age = age;
        }

        public void detailsOf() {
            System.out.println("Name: " + name1 +"Age: " + age);
        }

        public static void main(String[] args) {
            Person2 one = new Person2("sindhu", 27);
            Person2 two = new Person2("dinesh", 27);

        System.out.println("Details of a person: ");
            one.detailsOf();
            System.out.println("Second person details: ");
            two.detailsOf();


        }
    }
