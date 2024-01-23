public class Person {

    private String name;
    private String foreName;
    private int age;
    private boolean isPolytechStudent;

    public static void main(String[] args){
        Person p1 = new Person();
        p1.setName("Smith");
        p1.SetForeName("Jane");
        p1.SetAge(21);
        p1.setPolytechStudent(true);

        System.out.print("Je suis "+p1.getForeName()+" "+p1.getName()+", j'ai "+p1.getAge()+" ans.");
        if(p1.isPolytechStudent())
            System.out.println("Je suis étudiant(e) de Polytech.");
        else
            System.out.println("Je ne suis pas étudiant(e) de Polytech.");

        p1.addOneYearToAge();
        System.out.print("Je suis "+p1.getForeName()+" "+p1.getName()+", j'ai "+p1.getAge()+" ans.");
        if(p1.isPolytechStudent())
            System.out.println("Je suis étudiant(e) de Polytech.");
        else
            System.out.println("Je ne suis pas étudiant(e) de Polytech.");
    }

    private void addOneYearToAge() {
        this.age = age +1;
    }
    private boolean isPolytechStudent() {
        return isPolytechStudent;
    }

    private int getAge() {
        return age;
    }

    private String getName() {
        return name;
    }

    private String getForeName() {
        return foreName;
    }

    private void setPolytechStudent(boolean isPolytechStudent) {
        this.isPolytechStudent = isPolytechStudent;
    }

    private void SetAge(int age) {
        this.age=age;
    }

    private void SetForeName(String foreName) {
        this.foreName = foreName;
    }

    private void setName(String name) {
        this.name = name;
    }
}
