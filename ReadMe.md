High level overview

This API will serve as a penetration testing tool, which will provide Excel styled reports of any vulnerabilities within the API.

Running the project

To compile run gradlew clean bootrun, once server is started correctly by default the port is set to 8081. To access in a browser go to http://localhost:8081/api/info for a health check of this API

TODO:
- Write code that reads the RAML and understands what the API does.
-Write code to run different security attacks on the API e.g. SQL injection on URL parameters.
-Write Junit tests ensuring 80% coverage at a minimum.
-Write code to generate a report in Excel format to send back to the user.
-Create a GUI for all of the above that is user friendly

Please feel free to add any suggestions to this file.

thanks,

Kyle