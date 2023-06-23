
![arquitectura-spring](https://github.com/jose-campos1/ValidacionesSpringThymeleaf/assets/106594685/932aa333-4b6b-4eca-a597-8e8d8ab875ad)

  -Actualizar o agregar estas dependencias para que las validaciones de thymeleaf funcionen.
       *   <dependency>
            <groupId>javax.validation</groupId>
            <artifactId>validation-api</artifactId>
            <version>2.0.1.Final</version>
        </dependency>
        <dependency>
            <groupId>org.apache.bval</groupId>
            <artifactId>bval-jsr</artifactId>
            <version>2.0.2</version>
            </dependency>

        //Hay que usar javax validation, no jakarta, es un tema de versiones

     <p>  <a href=" https://stackoverflow.com/questions/2707683/how-do-i-import-javax-validation-into-my-java-se-project "> https://stackoverflow.com/questions/2707683/how-do-i-import-javax-validation-into-my-java-se-project  </a></p>
