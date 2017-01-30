# Wiring-a-Spring-Application
Using the Spring Container and Wiring a Spring Application

For this lab, you will write a few classes for a University application that can register a Student for a set of Courses, compute the tuition cost, and process a credit card payment for that amount. Some of
them will be Domain classes and some will be Service classes. Think about where each class that you write belongs.
For the purposes of configuring the Spring container use only XML for this lab. Do not use annotations.

Student and Course classes
Start by writing a Student class and a Course class.

A Student should have properties for:
a) Name
b) Id
c) Whether the student is an international student
d) Whether or not the student is a graduate student of undergraduate student
e) A list of courses the student is taking this semester.

A Course should have:
a) The course name (e.g., CS325, CS548)
b) Department name
c) Whether the course is a graduate or undergraduate level course
d) Number of units
e) Number of students enrolled in the course

Write a Payment Service.
The PaymentService will be used to process a credit card payment. Different credit card payment
processors (e.g., PayPal, Wells Fargo Bank) will have varying rules for handling the payment. We want
to be able to support any PaymentService provider and don’t want to have our application only be able
to support one specific provider. The PaymentService will have a method makePayment() that takes a
Student object and a credit card number. We won’t write the set of rules to handle the payment. You
can simply put in a print statement such as “Using the PayPal credit card processor to process credit
card number 12345678912 for John Smith”. Write two different payment service implementations –
one for PayPal and one for Wells Fargo. 

Write a Tuition Calculator Service.
The TuitionCalculatorService contains the rules for how to calculate a student’s tuition. Different
universities can have varying rules for this so we’ll need to be able to support different implementations
of the tuition calculator. The TuitionCalculatorService will have a method computeTutition() that takes a
Student object and list of Course objects. Write two different tuition calculator implementations using
the following rules:

TuitionCalculator for Ohio State University:

1. For undergraduate students the cost is $100 per course unit; for graduate students the cost is
$120 per course unit
2. An extra $50 “lab fee” is added to every course from the Chemistry department
3. A 10% surcharge is added to the above cost for international students

TuitionCalculator for National University:

1. For international students the cost is $500 per course unit; for other students the cost is $230
per course unit

Write a StudentCheckoutService
The student checkout service has a method checkout() that takes a Student object, a list of Course
objects, and a credit card number. The method should:

1. Register the Student for the Courses. This involves adding each Course to the student’s course
list and updating the enrollment number for each Course
2. Compute the tuition bill. This should be computed by the TuitionCalculatorService (see above).
Different universities will use different rules for computing the tuition. We don’t want to have
the application depend on any one implementation.
3. Process the payment by using the PaymentService (see above). Different credit card processors
will provide their own PaymentService which will use the student’s credit card number to pay
for the tuition.

Take advantage of dependency injection for the collaborators so that collaborators can be changed
without modifying any Java code. 

Write a small application

Create a client application with a main() method to test your StudentCheckoutService:
1. Lookup a StudentCheckoutService bean from the Spring container.
2. Write a method (different from main()) that will create a Student object
3. Write a method (different from main()) that will create a list of Course objects
4. Call the checkout() method of the student checkout service by providing the student object, a
list of courses and a credit card number.
5. Experiment with changing to a different payment service and a different tuition calculator. Can
you do so without changing your Java code? 
