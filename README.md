# Spring Boot Strategy Pattern Example
Here is an example using the Strategy Pattern.
The Strategy Pattern allows you to implement different behaviours dependin on the status. With the strategy pattern you can change the behaviur at runtime.

You only need an Interface and several implementations for each behaviurs.

In this example, the Interface is named TransformationDetails which has a method for transforming lines. And we have defined three different implementations:
* **TransformationDetailsAuto**: the word AUTO will be added at the beginning of the line.
* **TransformationDetailsManual**: the word Manual will be added at the beginning of the line.
* **TransformationDetailsCLO**: the word CLO will be added at the beginning of the line.

## How to run the project and use it
The example does not need parameters to start the Spring application.
Once it is started, you can use below end points in Postman that will call each implementation depending on the report Type:

**End-points**

**GET**:http://localhost:8080/api/v1/extract/MANUAL
**GET**:http://localhost:8080/api/v1/extract/AUTO
**GET**:http://localhost:8080/api/v1/extract/CLO

## Example of results
~~~
[
     "MANUAL|BG1234456_1234|LD12345667|840",
     "MANUAL|BG1234456_1234|LD12345667|840",
     "MANUAL|BG1234456_1234|LD12345667|840"
 ]
~~~
