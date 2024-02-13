import models.HallsOfResidence;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HallsOfResidenceTest {
    HallsOfResidence studentResidence;

    @BeforeEach
    public void setUp(){
        studentResidence = new HallsOfResidence(LocalDate.parse("2018-01-01"));
    }

    @Test
    public void canCalculateBuildCost(){
        studentResidence.setCapacity(15);
        assertThat(studentResidence.calculateBuildCost(500)).isEqualTo(7500);
    }
    @Test
    public void canGetNumberOfPartiesHosted(){
        assertThat(studentResidence.getNumberOfPartiesHosted()).isEqualTo(0);
    }
    @Test
    public void canSetNumberOfPartiesHosted(){
        studentResidence.setNumberOfPartiesHosted(45);
        assertThat(studentResidence.getNumberOfPartiesHosted()).isEqualTo(45);
    }
    @Test
    public void canGetCapacity(){
        assertThat(studentResidence.getCapacity()).isEqualTo(0);
    }
    @Test
    public void canSetNCapacity(){
        studentResidence.setCapacity(200);
        assertThat(studentResidence.getCapacity()).isEqualTo(200);
    }
}
