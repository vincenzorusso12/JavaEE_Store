# JavaEE Store
A CRUD in Java EE 7 (Middleware) for store management using JPA, EJB, JMS, Web Services.
It  runs on Glassfish Server 4.1, the data is stored on Apache Derby Database. 
Using EJB's  Simplified development of large-scale enterprise level application.

- JPA data is represented by classes and objects rather than by tables and records as in JDBC. this can significantly simplify database programming.
- EJB container manages life cycle of EJB instances, thus developer needs not to worry about when to create/delete EJB objects.
- JMS provides asynchronicity.
- Web Services gives Interoperability.
## Configuration
1. To use the EJB Project you have to create the Connection Factory and Topic. (in Glassfish)
2. To store data you should create a Data Source and a Connection Pool. (in Glassfish)
3. Then you can build the projects and deploy them.
4. In the client projects there are classes to test the application.
