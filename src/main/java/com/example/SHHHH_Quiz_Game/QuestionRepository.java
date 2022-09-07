package com.example.SHHHH_Quiz_Game;

import java.util.ArrayList;

public class QuestionRepository {
    private ArrayList<Question> questions = new ArrayList<>();

    Question question1 = new Question ("Which of these classes are the direct subclasses of the Throwable class?","RuntimeException and Error class","Exception and VirtualMachineError class","IOException and VirtualMachineError class", "Error and Exception clas");
    Question question2 = new Question("Which of the following interface is used to declare core methods in Java?", "Set", "EventListner", "Comparison", "Collection");
    Question question3 = new Question("Which of these interface handle sequences?", "Set", "Comparator","Collector", "List");
    Question question4 = new Question("Which of this interface must contain a unique element?", "Collection", "List", "Array","Set");
    Question question5 = new Question("When is the object created with new keyword?", "When creating class", "At compile time", "When writing code", "At run time");
    Question question6 = new Question("Automatic type conversion is possible in which of the possible cases?", "Byte to int", "Short to int", "Long to int", "Int to long");
    Question question7 = new Question("Which statement about a valid .java file is true?","It must define at least one public class", "It can contain one pulic class declaration and one public interface definition", "It can only contain one class declaration", "It may define at most one public class");
    Question question8 = new Question("Which is correct about an instance variable of type String?", " It defaults to an empty string", "It does not have a default value", "It will not compile without initializing on the declaration line", "It defaults to null");
    Question question9 = new Question("Arrays in java are?", "Object references", "Primitive data types", "Lists", "Objects");
    Question question10 = new Question("Which two primitives have wrapper classes that are not merely the name of the primitive with an uppercase letter?", "Byte and char", "Byte and int", "String to int", "Char and int");
    Question question11 = new Question("Which of the following is true about primitives?", "You can call methods on a primitive", "You can convert a wrapper class object to a primitive by calling valueOf()", "You can store a primitive directly into an ArrayList", "You can convert a primitive to a wrapper class object simply by assigning it");
    Question question12 = new Question("compareTo() returns?", "True", "False", "None", "An int value");
    Question question13 = new Question("Which of the following option leads to the portability and security of Java?", "The applet makes the Java code secure and portable", "Use of exception handling", "Dynamic binding between objects", "Bytecode is executed by JVM");
    Question question14 = new Question("Which of the following is not a Java features?", "Dynamic", "Architecture Neutral", "Object-oriented", "Use of pointers");
    Question question15 = new Question("_____ is used to find and fix bugs in the Java programs", "JVM", "JRE", "JDK", "JDB");
    Question question16 = new Question("What is the return type of the hashCode() method in the Object class?", "Object", "Long", "void", "int");
    Question question17 = new Question("What does the expression float a = 35/0 return?", "0", "Not a number", "Run time exception", "Infinity");
    Question question18 = new Question("Identify the corrected definition of a package", "A package is a collection of editing tools", "A package is a collection of classes", "A package is a collection of interfaces", " A package is a collection of classes and interfaces");
    Question question19 = new Question("When an array is passed to a method, what does the method receive?", "A copy of the array", "Length of an array", "Copy of the first element", "The reference of the array");
    Question question20 = new Question("Which method of the Class.class is used to determine the name of a class represented by the class object as a String?", "getClass()", "intern()", "toString()", "getName");
    Question question21 = new Question("Which of the following is true about the anonymous inner class?", "It has only methods", "Objects can't be created", "It has a fixed class name", "It has no class name");
    Question question22 = new Question("Which option is false about the final keyword?", "A final method cannot be overridden in its subclasses", " A final class cannot be extended", "A final method can be inherited", "Final class cannot extend other classes");
    Question question23 = new Question("Which of the following is a reserved keyword in Java?", "Object", "Main", "System", "strictfp");
    Question question24 = new Question("Which keyword is used for accessing the features of a package?", "package", "export", "extend", "import");
    Question question25 = new Question("Which of the following is a mutable class in java?", "java.lang.String", "java.lang.Byte", "java.lang.Short", "java.lang.StringBuilder");
    Question question26 = new Question("How many threads can be executed at a time?", "Only one thread", "Only main (main() method) thread", "Two threads", "Multiple threads");
    Question question27 = new Question("Select Odd one out from these about local variables", "Local variables are declared in methods, constructors, or blocks", "Local variables are created when the method, constructor or block is entered", "The variable will be destroyed once it exits the method, constructor, or block", "We can't create reference variables of Local variables");
    Question question28 = new Question("Which of the following statements are true about finalize() method?", " It can be called zero or more times", "It can be called once", "It can be called one or more times", "It can be called zero or one time");
    Question question29 = new Question("To which of the following does the class string belong to", "java.awt", "java.applet", "java.string", "java.lang");
    Question question30 = new Question("Number of primitive data types in Java are?", "6", "4", "9", "8");



}