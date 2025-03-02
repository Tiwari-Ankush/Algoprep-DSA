// ### Overview of Concepts

// #### 1. **Class and Objects**
// - **Class**: A class is a blueprint for creating objects. It defines properties (fields) and behaviors (methods) that the objects created from the class will have.
// - **Object**: An object is an instance of a class. When a class is instantiated, memory is allocated for the object, and the class's constructor is called to initialize it.

//**Code Example**:
//        ```java
class Car {
    // Fields (attributes)
    String model;
    String color;
    int year;

    // Method (behavior)
    void start() {
        System.out.println(model + " is starting.");
    }
}

public class Java11classesObjects {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car();
        myCar.model = "Tesla Model S";
        myCar.color = "Red";
        myCar.year = 2024;

        // Calling method on the object
        myCar.start();
    }
}
//```

//        // #### 2. **Memory Management of Class and Objects**
//// - **Memory Allocation**: When an object is created using the `new` keyword, memory is allocated in the heap. The reference to this object is stored in the stack.
//// - **Garbage Collection**: Java provides automatic garbage collection, meaning objects no longer in use (i.e., those with no references) are automatically deleted from memory, freeing up space.
//
//        **Code Example**:
//        ```java
//class Sample {
//    String name;
//
//    Sample(String name) {
//        this.name = name;
//    }
//
//    void display() {
//        System.out.println("Name: " + name);
//    }
//}

//public class Java11classesObjects {
//    public static void main(String[] args) {
//        Sample obj1 = new Sample("Object 1");
//        Sample obj2 = new Sample("Object 2");
//
//        obj1.display();
//        obj2.display();
//
//        // obj1 reference is now set to null
//        obj1 = null;
//
//        // Requesting JVM for garbage collection
//        System.gc();  // Note: Garbage collection is not guaranteed to happen immediately
//    }
//}
//```
//
//        // #### 3. **Constructor Basics**
//// - **Constructor**: A constructor is a special method that is called when an object is instantiated. It has the same name as the class and no return type.
//// - **Types**:
////   - **Default Constructor**: Provided by Java if no constructors are defined. It initializes fields with default values.
////   - **Parameterized Constructor**: Allows you to pass parameters and initialize fields with custom values.
//
//// **Code Example**:
//        ```java
//class Dog {
//    String name;
//    int age;
//
//    // Default constructor
//    Dog() {
//        name = "Unknown";
//        age = 0;
//    }
//
//    // Parameterized constructor
//    Dog(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    void display() {
//        System.out.println("Name: " + name + ", Age: " + age);
//    }
//}

//public class Java11classesObjects {
//    public static void main(String[] args) {
//        // Using default constructor
//        Dog dog1 = new Dog();
//        dog1.display();
//
//        // Using parameterized constructor
//        Dog dog2 = new Dog("Buddy", 5);
//        dog2.display();
//    }
//}
//```
//
//        // #### 4. **Implementing Class and Objects**
//// - Implementation involves defining a class, creating objects from the class, and using the object's properties and methods to perform operations.
//
//        **Code Example**:
//        ```java
//class Student {
//    String name;
//    int rollNo;
//    String course;
//
//    // Parameterized constructor
//    Student(String name, int rollNo, String course) {
//        this.name = name;
//        this.rollNo = rollNo;
//        this.course = course;
//    }
//
//    void study() {
//        System.out.println(name + " is studying " + course + ".");
//    }
//
//    void takeExam() {
//        System.out.println(name + " is taking the exam.");
//    }
//}

//public class Java11classesObjects {
//    public static void main(String[] args) {
//        // Creating objects of the Student class
//        Student student1 = new Student("Ankush", 101, "Computer Science");
//        Student student2 = new Student("Adarsh", 102, "Mechanical Engineering");
//
//        // Using methods
//        student1.study();
//        student2.takeExam();
//    }
//}
//```

// ### Summary
// - **Class** is a blueprint, and **Object** is an instance of that blueprint.
// - Memory for objects is managed automatically by Java's garbage collector.
// - **Constructors** initialize objects and come in two types: default and parameterized.
// - Implementing classes and objects involves defining the class, creating objects, and using them to perform actions.

// This overview and the provided code examples should help you understand the concepts of classes, objects, memory management, and constructors in Java.


