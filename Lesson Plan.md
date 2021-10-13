# OOP With Animals - Lesson Plan

## Overview
This plan will use scaffolding and cognitive apprenticeship to demonstrate how OOP concepts are used in software development and the rationale behind those concepts.  The context and direction of the problem is scaffolded.  The progression of changes to evolve the code is demonstrated by the teacher, then practiced by the students.

## Suggested Schedule

| Day | Topic | Resource | 
| --- | --- | --- |
| 1 | Simple animals: modelling pets using classes, properties and methods | [Code Template](https://github.com/l2lam/oop-with-animals/tree/main/1%20-%20Simple%20Animals) | 
| 2 | Expanding the kingdom: using abstract classes to optimize modelling and support extensibility |  | 
| 3 | Animal shelter: using interfaces to define capabilities for utility and organization |  | 
| 4 | What to do with all the animals: application of objects |  | 

## Instruction Sequence

### Simple Animals
1. Define classes for a Cat and a Dog with the same properties and methods.  Define a class for a Skunk that shares some properties with the other animals
    1. Do the properties make sense?  What would you add or change?
    1. There are some duplicate definitions between the classes, do you see a problem with this?
        1. Define another class to represent an animal of your choosing
            1. How much copy-and-pasting or retyping did you do?
            1. Did you make mistakes?
            1. Can you imagine if there were hundreds of animal properties?
        1. Add a new property to all animals: `Age`
            1. How would you store the age, which changes every day, of an animal?
            1. Can you see how tedious it is to update all the animal classes?

### Expanding the Kingdom
1. Consolidate common properties and methods into an Abstract Animal class, and simplify the other animal classes
    1. Implement the “toString” method in the abstract class to demonstrate inversion of control
    1. Can we further abstract the animals to reduce more repetition of code?
        1. Consider how cats and dogs are similar to each other but different from skunks and elephants
        1. Abstract the classes further into Domesticated and Wild animals and simplify the child classes
    1. Count the lines of code between stage 1 and stage 2 and notice how much was reduced through inheritance
       1. On linux you can use the `wc` command to get the line count in the folder: 
            > ```wc -l *.java```

### Animal Shelter
1. Domesticated animals can be inventoried and sold so they would have traits like “unit price” and “SKU”; but what else can be sold that are not animals?
1. What is an interface and how is it different from an abstract class?
    1. In languages like Java and C#, classes can inherit from only one parent class but can implement multiple interfaces.  Why?
    1. We can sell anything that have certain properties, not just animals
1. Isolate “sellable” capabilities into an interface
1. Implement this capabilities in some animals and a new class, say `PetFood`
1. Create a generally useful `Flyer` class that can advertise things for sale

### Super Animals
1. Imaging evolving animals to be capable of other things like being able to compete with each other and any other thing that implements `ICompetable`.  Given two things that can compete with each other, what creative ways could you determine which one would win?
    1. Consider the circumstances like the current date and time.  Some animals may be stronger in the dark!
    1. Could you somehow rank the animals?  Implement an `IComparable` interface
1. Optional: gamification
    1. Let the user select and configure two or more animals
    1. In a series of rounds, roll a dice and let the animals compete
    1. There will be winners and, well, less-winners