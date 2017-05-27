/**
 *
 * @author ray
 * @date 17/5/18
 */


public class Doctor extends People {
    private int patientNumbers;

    private Doctor(String name, String city, int age, int patientNumbers) {
        super(name, city, age);
        this.patientNumbers = patientNumbers;
    }

    private String cure() {
        return super.name + " has " + this.patientNumbers + " patients in " + super.city;
    }

    /**
     * 基于继承(extend)实现多态性
     *  继承
     *  父类引用指向子类对象
     *  重写: 不重写sayRun 执行时调用的People类的sayRun方法
     *        重写sayRun 执行时调用的是Doctor类的sayRun方法
     *        多个子类对同一方法的重写可以表现出不同的行为
     * @param word
     * @return string
     */
    @Override
    public String sayRun(String word) {
        return super.name + " said in class [" + Doctor.class + "]: "+ word + " i have " + this.patientNumbers +
            " patients";
    }

   public static void main(String[] args) {
        Doctor baiqiuen1 = new Doctor("baiqiuen", "Canada", 81, 5);
        Doctor baiqiuen2 = new Doctor("baiqiuen", "Canada", 82, 8);
        People songzonglu1 = new Doctor("songzonglu", "xiehe", 77, 5);
        People shenlei = new People("shenlei", "sjz", 28);

        System.out.println(baiqiuen1.runEat(10000));
        System.out.println(baiqiuen1.cure());
        System.out.println(baiqiuen1.hashCode());
        if (baiqiuen1.equals(baiqiuen1)) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
        System.out.println(songzonglu1.sayRun("hi hi hi"));
        System.out.println(Doctor.class.isInstance(baiqiuen1));
        System.out.println(Doctor.class.isInstance(songzonglu1));

        System.out.println("---extends---");
        System.out.println(songzonglu1 instanceof People);
        System.out.println(songzonglu1 instanceof Doctor);
        System.out.println(baiqiuen1 instanceof People);
        System.out.println(baiqiuen2  instanceof Doctor);
        System.out.println(shenlei instanceof  People);
        //only this return is false
        System.out.println(shenlei instanceof  Doctor);
        System.out.println("---interface---");
        System.out.println(baiqiuen1 instanceof PeopleBio);
        System.out.println(baiqiuen2 instanceof PeopleBio);
        System.out.println(songzonglu1 instanceof PeopleBio);
        System.out.println(shenlei instanceof PeopleBio);
        System.out.println("---interface---");
        System.out.println(baiqiuen1 instanceof PeopleBio);
        System.out.println(baiqiuen2 instanceof PeopleBio);
        System.out.println(songzonglu1 instanceof PeopleBio);
        System.out.println(shenlei instanceof PeopleBio);

    }

}
