# 🎪 Challenge - Data Access Layer (II) 🎪

In this challenge, we will validate our knowledge of manipulating data from a table in the PostgreSQL database engine.

To achieve this, you will need to apply everything learned from Unit 2 – Servlets and what you have learned in this unit: Data Access Layer - CRUD Methods.

Read the entire document before starting the individual development to ensure you get the maximum score and focus your efforts correctly.

Associated time: 2 chronological hours.

# 🤡 Description 🤡

A company dedicated to distributing goods for neighborhood stores is looking to implement a web system to help manage the business and its supplier control. For this, they have requested that in this new stage, the system should select, edit, and delete the suppliers that supply the company. The team in charge of the database structure has built the following model, which meets the requirements of this first stage:

When displaying supplier data, it should be visualized in a table ordered ascendingly by the supplier's name, showing all columns.

Applying the concepts and tools learned so far, we generate the following:

A Dynamic Java Web project from the Eclipse IDE.
A presentation JSP file to capture the value of a supplier's data.
Capture and validation of the parameters sent in the request and subsequent processing of sending to the Manager layer.
Validate that the information entered in the form is not null or empty.
Implementation of a Singleton connection class.
Connection to the PostgreSQL database via driver.
Execute query for insertion and obtaining suppliers in the data access class.
Execute query for editing and deleting suppliers in the data access class.
Obtain responses sent from the database.
Redirect to the JSP view the result of the CRUD operations or error message if any of the actions are not executed correctly in the table.
# 🎉 Requirements 🎉

Using the Eclipse development IDE, a new Dynamic Web project called “DesafioProveedores2” must be created, and this project must be deployed under the Apache Tomcat 9 or 10 Web server.

Once the project is created, the “index.jsp” page should be created, which is the entry JSP, where the form with the fields to be entered by the suppliers and a section with a table to show all the suppliers should be visualized. Additionally, for each record in the column called "actions", the buttons with the edit and delete actions.

To edit a supplier, a new JSP called “edicion.jsp” should be deployed, which will show all the editable fields except the id field and a button to persist the changes.

A Servlet should be created in which the validation is performed and the result of the mathematical operation is sent.

Create a new Dynamic Java Web project named “DesafioProveedores2” and create the corresponding JSP structure for the required view, considering sending the data to the Servlet using the POST method.
(2 Points)

Create and link the necessary servlet to display in a table the expected result of the operation of obtaining all inserted/edited/deleted suppliers.
(2 Points)

Validate and send the rescued parameters and implement methods in the data access class.
(2 Points)

Access “edicion.jsp” and perform the editing and persistence of a supplier, an action that should be triggered from a column in the supplier table.
(2 Points)

Access “index.jsp” and perform the deletion of a supplier, an action that should be triggered from a column in the supplier table, returning the still existing suppliers in the table to the page.
(2 Points)

# 🎈 Good luck! 🎈
