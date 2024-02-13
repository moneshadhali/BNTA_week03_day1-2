import models.Bungalow;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BungalowTest {
    Bungalow bungalow;
    @BeforeEach
    public void setUp(){
        bungalow = new Bungalow(LocalDate.parse("2018-01-01"), "European");
    }
    @Test
    public void canCalculateBuildCost(){
        bungalow.setArea(300);
        assertThat(bungalow.calculateBuildCost(500)).isEqualTo(150000);
    }
    @Test
    public void hasCentralHeating(){
        assertThat(bungalow.isCentralHeating()).isEqualTo(false);
    }

    @Test
    public void setCentralHeating(){
        bungalow.setCentralHeating(true);
        assertThat(bungalow.isCentralHeating()).isEqualTo(true);
    }

    @Test
    public void hasSwimmingPool(){
        assertThat(bungalow.isSwimmingPool()).isEqualTo(false);
    }

    @Test
    public void setSwimmingPool(){
        bungalow.setSwimmingPool(true);
        assertThat(bungalow.isSwimmingPool()).isEqualTo(true);
    }
    @Test
    public void canGetType(){
        assertThat(bungalow.getType()).isEqualTo("European");
    }
    @Test
    public void canSetType(){
        bungalow.setType("Chinese");
        assertThat(bungalow.getType()).isEqualTo("Chinese");
    }

    @Test
    public void canGetAbout(){
        assertThat(bungalow.about()).isEqualTo("More about this building");
    }
    @Test
    public void canGetNumberOfRooms(){
        assertThat(bungalow.getNumberOfRooms()).isEqualTo(0);
    }
    @Test
    public void canSetNumberOfRooms(){
        bungalow.setNumberOfRooms(5);
        assertThat(bungalow.getNumberOfRooms()).isEqualTo(5);
    }
    @Test
    public void canAddRoom(){
        bungalow.addRoom(10);
        assertThat(bungalow.getNumberOfRooms()).isEqualTo(10);
    }
    @Test
    public void canGetDateOfConstruction(){
        assertThat(bungalow.getDateOfConstruction()).isEqualTo("2018-01-01");
    }
    @Test
    public void canSetDateOfConstruction(){
        bungalow.setDateOfConstruction(LocalDate.parse("2020-01-01"));
        assertThat(bungalow.getDateOfConstruction()).isEqualTo("2020-01-01");
    }
    @Test
    public void canGetZipcode(){
        assertThat(bungalow.getZipcode()).isEqualTo("");
    }
    @Test
    public void canSetZipcode(){
        bungalow.setZipcode("T8 9DG");
        assertThat(bungalow.getZipcode()).isEqualTo("T8 9DG");
    }
    @Test
    public void canGetArea(){
        assertThat(bungalow.getArea()).isEqualTo(0);
    }
    @Test
    public void canSetArea(){
        bungalow.setArea(789);
        assertThat(bungalow.getArea()).isEqualTo(789);
    }
}
