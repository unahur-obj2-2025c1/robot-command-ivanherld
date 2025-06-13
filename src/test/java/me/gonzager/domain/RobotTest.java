package me.gonzager.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import me.gonzager.commands.ApagarLuz;
import me.gonzager.commands.EncenderLuz;
import me.gonzager.commands.Tarea;

class RobotTest {
        Robot robotin = new Robot(100.0);

        Habitacion pieza = new Habitacion(15.0);

        @BeforeEach
        void setUp() {
            robotin.reset();
        }

        @Test
        void testExecute() {



            TareaBuilder listaDeTarea = new TareaBuilder();

            robotin.run(
                listaDeTarea
                        .ligon(pieza)
                        .clean(pieza)
                        .ligoff(pieza)
                        .build()
            );

            assertEquals(15.0, robotin.nivelDeBateria());

            
            // Tarea ligon = new EncenderLuz(pieza);
            // Tarea ligoff = new ApagarLuz(pieza);
            // ligon.execute(robotin);
            // ligoff.execute(robotin);
        }

}
