import models.Bridge;
import models.Bungalow;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BridgeTest {
    Bridge bridge;
    @BeforeEach
    public void setUp(){
        bridge = new Bridge("Iron", 777);
    }
    @Test
    public void canCalculateBuildCost(){
        assertThat(bridge.calculateBuildCost(50)).isEqualTo(38850);
    }
    @Test
    public void canCalculateBuildCost2(){
        assertThat(bridge.calculateBuildCost(50, 15)).isEqualTo(582750);
    }
    @Test
    public void canGetMaterialUsed(){
        assertThat(bridge.getMaterialUsed()).isEqualTo("Iron");
    }
    @Test
    public void canSetMaterialUsed(){
        bridge.setMaterialUsed("Wood");
        assertThat(bridge.getMaterialUsed()).isEqualTo("Wood");
    }
    @Test
    public void canGetAmountOfMaterial(){
        assertThat(bridge.getAmountOfMaterial()).isEqualTo(777);
    }
    @Test
    public void canSetAmountOfMaterial(){
        bridge.setAmountOfMaterial(450);
        assertThat(bridge.getAmountOfMaterial()).isEqualTo(450);
    }
}
