import models.Office;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OfficeTest {
    Office office;

    @BeforeEach
    public void setUp(){
        office = new Office(LocalDate.parse("2007-12-03"));
    }
    @Test
    public void canCalculateBuildCost(){
        office.setNumberOfRooms(50);
        assertThat(office.calculateBuildCost(850)).isEqualTo(42500);
    }
    @Test
    public void isGymInOffice(){
        assertThat(office.isGym()).isEqualTo(false);
    }

    @Test
    public void setGymInOffice(){
        office.setGym(true);
        assertThat(office.isGym()).isEqualTo(true);
    }
    @Test
    public void isRestaurantInOffice(){
        assertThat(office.isRestaurant()).isEqualTo(false);
    }

    @Test
    public void setRestaurantInOffice(){
        office.setRestaurant(true);
        assertThat(office.isRestaurant()).isEqualTo(true);
    }
}
