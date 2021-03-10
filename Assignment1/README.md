# Assignment #1 - Relational Databases
[Assignment #1 - Relational Databases](01-relational-db.pdf)  

## Design  

#### Discussion
```diff
- pros and cons for choice of strategy..
``` 
- Joint-table strategy
- Table-per-class strategy
- Single-table strategy

#### Strategy to implement the inheritance
```diff
- choice of strategy
``` 

#### ER diagram covering the domain
```diff
- ER diagram goes here
``` 

## Conceptual level implementation

#### SQL-script that creates the tables
```diff
- reentrant sql script link goes here
``` 

####  SQL-script with sample data for the tables
```diff
- at least two vetenarians, twenty pets of various kinds including some that are neither cats nor dogs, and ten caretakers some with common pets. Also this script should be reentrant
``` 

## External level implementation

#### Views and/or stored procedures to deal with the chosen inheritance strategy

```diff
-  It should be possible to:
-  - See cats and dogs as separate views
-  - See all pets as in the single table strategy
-  - Update cats and dogs with a single SQL call, stored procedure or update on a view with a trigger.
``` 

####  script that creates a designated user for accessing the database
```diff
-  and revokes the rights for that user to access the underlaying tables, implementing the inheritance strategy.
``` 


## Interface implementation

####  A simple program in Java 
```diff
-  • retrieve a list of pets from the database. The types of instances of Pets in the list should reflect the actual type:
-  - Pet
-  - Cat
-  - Dog
-  - insert a new Dog, Cat, and/or Pet in the database.


``` 
