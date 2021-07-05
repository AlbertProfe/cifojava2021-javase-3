# cifojava2021-javase-3
Java SE exercises: Objects, POO, to practise with objects and classes, that is: uses, composition, inherence creating UML with INTERFACES

- Spring Boot with @Controller, View and Thymeleaf and Applications.properties
- Classes: @Entity Employee and CrudRepository Interface
- Database: H2 (local or in Memory) and ddl.auto


## employee (java-EE spring)

- employee1: CRUD, option Read, `public String getAllEmployees(Model boxToView)` ( employeeRepository.findAll(), CrudRepository and employees.html)
- employee2: CRUD, option Delete, `public String removeEmployee(int id, Model model)` ( employeeRepository.deleteById(id), CrudRepository and employees.html)   
- employee3: CRUD, option Create, `public String newEmpoyee()` and `public String inserEmployee(Employee employee)` ("newemployee.html" and @Entity expense )
- employee4: CRUD option Update, `public String updateEmpoyee(int id, Model model)` and `public String replaceEmployee(@PathVariable("idFromView") int id, Employee employee)` and  `public String detailEmpoyee(int id, Model model)` (layout and navbar, fillinEmployee and java faker)
- employee5: CRUD of @Expense
- employee6: Login (classes: MvcConfig and WebSecurityConfig)

## userUniversity (java-SE)

- userUniversity
- userUniversity0.1
- userUniversity0.2
- userUniversity0.3
