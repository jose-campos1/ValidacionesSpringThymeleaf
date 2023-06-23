/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vzla.revo.revo.persona;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Data;
import jakarta.validation.constraints.Email;

/**
 *
 * @author josea
 */

@Data
@Entity
@Table(name = "persona")
public class Persona implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;

   
	@NotEmpty
    private String nombre;

   @NotEmpty
    private String apellido;

   @NotEmpty
   @Email
    private String email;

    private String telefono;
    
}


/*No se de donde saco las dependencias que funcionan pueden ser estas:
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

        https://stackoverflow.com/questions/2707683/how-do-i-import-javax-validation-into-my-java-se-project
 */