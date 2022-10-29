public class Course {
    //İlk önce Course sınıfında yer alan nitelikleri tanımladık.
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int examnote;
    int note;

    //Daha sonrasında Course Constructor sınıfını tanımladık.
    //Böylece ders tanımlarken daha az kod kullanmış olacağız.
    //Alacağımız değerin değişkeniyle sınıftaki değişken karışmasın diye kod bloğunda this kullandık.
    public Course (String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.examnote = 0;
        this.note = 0;
    }

    //Öğretmen eklemek için addTeacher() methodunu oluşturacağız.
    public void addTeacher(Teacher t) {
        if(this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı!");
        } else {
            System.out.print(t.name + "akademisyeni bu dersi veremez!");
        }
    }

    //Akademisyen bilgisini bastırmak için printTeacher() metodunu oluşturacağız.
    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}


public class Student {
    //İlk önce Course sınıfında yer alan nitelikleri tanımladık.
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avaragemat, avaragefizik, avaragekimya;
    double avarage;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calculateAverage();
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int mat1, int fizik, int fizik1, int kimya, int kimya1) {
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
            this.mat.examnote = mat1;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
            this.fizik.examnote = fizik1;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
            this.kimya.examnote = kimya1;
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    //Ders ve genel ortalamayı hesaplamak için bit metot yazdık.
    public void calculateAverage() {
        this.avaragemat = (this.mat.examnote * 0.8) + (this.mat.note * 0.2);
        this.avaragefizik = (this.fizik.examnote * 0.8) + (this.fizik.note * 0.2);
        this.avaragekimya = (this.kimya.examnote * 0.8) + (this.kimya.note * 0.2);

        //Derslerin ortalamaya etkisi:
        //Matematik %50
        //Fizik %25
        //Kimya %25
        this.avarage = (this.avaragemat * 0.5) + (this.avaragefizik * 0.25) + (this.avaragekimya * 0.25);
    }

    //Ortalama kontrolü için bir metot yazdık.
    public boolean isCheckPass() {
        calculateAverage();
        return this.avarage > 55;
    }

    //Notları yazmak için bir metot tanımladık.
    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.avaragemat);
        System.out.println("Fizik Notu : " + this.avaragefizik);
        System.out.println("Kimya Notu : " + this.avaragekimya);
    }
}

public class Teacher {
    //Teacher sınıfında yer alan nitelikleri tanımladık.
    String name;
    String mpno;
    String branch;



    //Constructor sınıfını tanımladık.
    public Teacher (String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

}

public class Main {
    public static void main(String[] args) {


        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut A.", "123456789", "MAT");
        Teacher t2 = new Teacher("Ayşe B.", "456789123", "FZK");
        Teacher t3 = new Teacher("Hasan C.", "789123456", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Ayça A.", 1, "123456789", mat, fizik, kimya);
        s1.addBulkExamNote(50, 70, 40, 40, 80, 20);
        s1.isPass();

        Student s2 = new Student("Buse B.", 2, "456789123", mat, fizik, kimya);
        s2.addBulkExamNote(80,100, 40, 60, 80, 80);
        s2.isPass();

        Student s3 = new Student("Ceren C.", 3, "789123456", mat, fizik, kimya);
        s3.addBulkExamNote(40,50,50,60,70,80);
        s3.isPass();
    }
}
