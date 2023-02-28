# cinnamon_cinemas_kata
## Overview
This repository contains the Cinnamon Cinemas TDD Challenge implementation.
The main goal of this challenge is to assign seats to customers who purchase movie tickets at Cinnamon cinemas.
The movie theater has 15 seats, which are divided into three rows of five seats each.
Rows are assigned letters ranging from A to C.
Seats are assigned a number between 1 and 5.

User Story: Assume a customer wants to request some tickets.
When a customer requests a seat between 1 and 3 for a movie, the customer should be assigned the required number of seats from the available seats on the seating plan, and the seats should be marked as allocated.

The user input for the number of seats has been assumed to be between 1 and 3.
The program will assign seats in the auditorium by filling it from left to right, front to back.
When the program first begins, all seats will be available for purchase.
When all of the seats are taken, the program throws an exception and exits.

## Implementation
The solution was created using the Test Driven Development Methodology.
There is a test class that contains all of the methods for testing functionality and a class called CinnamonCinemaTicketPurchaseImpl, in which the logic is implemented. When user books 1 to 3 tickets seats will be allotted in the theatre. If the number of tickets is more than 3 then exception will be thrown. If customer wants to book tickets even after all the tickets were booked there will be an issue thrown.


## Instruction to run
To run this project you need to fork the repository to your git account and clone it to your machine. Once cloned you can run the tests using

mvn test

All the tests should pass and the application should run successfully for additional inputs.