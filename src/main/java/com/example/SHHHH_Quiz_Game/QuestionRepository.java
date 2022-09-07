package com.example.SHHHH_Quiz_Game;

import java.util.ArrayList;

public class QuestionRepository {

    private ArrayList<Question> questions = new ArrayList<>(); {

        questions.add(new Question("Which of these classes are the direct subclasses of the Throwable class?","RuntimeException and Error class","Exception and VirtualMachineError class","IOException and VirtualMachineError class","Error and Exception clas"));
        questions.add(new Question("Which of the following interface is used to declare core methods in Java?","Set","EventListner","Comparison","Collection"));
        questions.add(new Question("Which of these interface handle sequences?","Set","Comparator","Collector","List"));
        questions.add(new Question("Which of this interface must contain a unique element?","Collection","List","Array","Set"));
        questions.add(new Question("When is the object created with new keyword?","When creating class","At compile time","When writing code","At run time"));
        questions.add(new Question("Automatic type conversion is possible in which of the possible cases?","Byte to int","Short to int","Long to int","Int to long"));
        questions.add(new Question("Which statement about a valid .java file is true?","It must define at least one public class","It can contain one pulic class declaration and one public interface definition","It can only contain one class declaration","It may define at most one public class");
        questions.add(new Question("Which is correct about an instance variable of type String?"," It defaults to an empty string","It does not have a default value","It will not compile without initializing on the declaration line","It defaults to null");
        questions.add(new Question("Arrays in java are?","Object references","Primitive data types","Lists","Objects"));
        questions.add(new Question("Which two primitives have wrapper classes that are not merely the name of the primitive with an uppercase letter?","Byte and char","Byte and int","String to int","Char and int"));
        questions.add(new Question("Which of the following is true about primitives?","You can call methods on a primitive","You can convert a wrapper class object to a primitive by calling valueOf()","You can store a primitive directly into an ArrayList","You can convert a primitive to a wrapper class object simply by assigning it");
        questions.add(new Question("compareTo() returns?", "True","False","None","An int value"));
        questions.add(new Question("Which of the following option leads to the portability and security of Java?","The applet makes the Java code secure and portable","Use of exception handling","Dynamic binding between objects","Bytecode is executed by JVM"));
        questions.add(new Question("Which of the following is not a Java features?","Dynamic","Architecture Neutral","Object-oriented","Use of pointers"));
        questions.add(new Question("_____ is used to find and fix bugs in the Java programs","JVM","JRE","JDK","JDB"));
        questions.add(new Question("What is the return type of the hashCode() method in the Object class?","Object","Long","void","int"));
        questions.add(new Question("What does the expression float a = 35/0 return?","0","Not a number","Run time exception","Infinity"));
        questions.add(new Question("Identify the corrected definition of a package", "A package is a collection of editing tools","A package is a collection of classes", "A package is a collection of interfaces"," A package is a collection of classes and interfaces");
        questions.add(new Question("When an array is passed to a method, what does the method receive?","A copy of the array","Length of an array","Copy of the first element","The reference of the array"));
        questions.add(new Question("Which method of the Class.class is used to determine the name of a class represented by the class object as a String?","getClass()","intern()","toString()","getName"));
        questions.add(new Question("Which of the following is true about the anonymous inner class?","It has only methods","Objects can't be created","It has a fixed class name","It has no class name"));
        questions.add(new Question("Which option is false about the final keyword?","A final method cannot be overridden in its subclasses"," A final class cannot be extended","A final method can be inherited","Final class cannot extend other classes"));
        questions.add(new Question("Which of the following is a reserved keyword in Java?","Object","Main","System","strictfp"));
        questions.add(new Question("Which keyword is used for accessing the features of a package?","package","export","extend","import"));
        questions.add(new Question("Which of the following is a mutable class in java?", "java.lang.String", "java.lang.Byte","java.lang.Short","java.lang.StringBuilder"));
        questions.add(new Question("How many threads can be executed at a time?","Only one thread","Only main (main() method) thread","Two threads","Multiple threads"));
        questions.add(new Question("Select Odd one out from these about local variables","Local variables are declared in methods, constructors, or blocks","Local variables are created when the method, constructor or block is entered","The variable will be destroyed once it exits the method, constructor, or block", "We can't create reference variables of Local variables"));
        questions.add(new Question("Which of the following statements are true about finalize() method?"," It can be called zero or more times","It can be called once","It can be called one or more times","It can be called zero or one time"));
        questions.add(new Question("To which of the following does the class string belong to","java.awt","java.applet", "java.string", "java.lang"));
        questions.add(new Question("Number of primitive data types in Java are?","6","4","9","8"));

    }

}