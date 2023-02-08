import java.lang.annotation.*;

// Custom Annotation
// 1. Marker Annotation.
// 2. Single value annotation.
// 3. Multi value annotation.


// We have a metadata annotation where this 4 annotation is introduced.

@Inherited // Help us to achieve inheritance in using annotation.

@Documented // Helps us to create Documentation part if you want to create documentation.

@Target(ElementType.TYPE) // Which level of annotation is this decided with this annotation.

@Retention(RetentionPolicy.RUNTIME) // Which file this annotation is use here we can mention
@interface SmartPhone{
    String os() default "Oreo"; //Here you can set default values.
    int version() default 13 ;
}


// If you pass the values in parameter the given value in the methode is override.
@SmartPhone(os= "Lollipop", version=12)
class NokiaSeries{
    String model;
    int size;

    public NokiaSeries(String model, int size) {
        this.model = model;
        this.size = size;
    }
}

// Don't pass the value in annotation.
@SmartPhone
class NokiaSeries1{
    String model;
    int size;

    public NokiaSeries1(String model, int size) {
        this.model = model;
        this.size = size;
    }
}

public class Main {
    public static void main(String[] args) {
        NokiaSeries obj = new NokiaSeries("Fire", 5);
        System.out.println(obj.model);
        System.out.println(obj.size);

        Class c = obj.getClass(); // Reflection API which helps us to get values of object or features of object.
        Annotation an = c.getAnnotation(SmartPhone.class);
        SmartPhone s = (SmartPhone)an;
        System.out.println(s.os());
        System.out.println(s.version());


        // Create Obj for 2nd Class.
        NokiaSeries1 obj1 = new NokiaSeries1("Lava", 6);
        System.out.println(obj1.model);
        System.out.println(obj1.size);

        Class c1 = obj1.getClass(); // Reflection API which helps us to get values of object or features of object.
        Annotation an1 = c1.getAnnotation(SmartPhone.class);
        SmartPhone s1 = (SmartPhone)an1;
        System.out.println(s1.os());
        System.out.println(s1.version());


    }
}